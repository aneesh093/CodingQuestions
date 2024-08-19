package javaemployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class EmployeeWithJava8 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 18, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 22, 160, "M", "IT", "Blore", 2010));
		
		// Employees based on City
		empList.stream().collect(Collectors.groupingBy(Employee::getCity)).entrySet().forEach(System.out::println);
		
		//Employees Based on Age
		empList.stream().collect(Collectors.groupingBy(Employee::getAge)).entrySet().forEach(System.out::println);
		
		//How many male and how many female employees
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);
		
		//Print All the department in organization
		empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		//print employees whose age > 27 
		empList.stream().filter(t-> t.getAge() > 27).collect(Collectors.toList()).forEach(System.out::println);
		
		//Find Maximum age of Employee
		OptionalInt e=empList.stream().mapToInt(Employee::getAge).max();
		if(e.isPresent()) {
			System.out.println(e.getAsInt());
		}		
		
		//Find Minimum Salary
		OptionalLong e1=empList.stream().mapToLong(Employee::getSalary).min();
		if(e1.isPresent()) {
			System.out.println(e1.getAsLong());
		}
		
		e1.ifPresent(value -> System.out.println(value));
		
		// Find Average salary of Male and Female Employees
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getSalary))).
					entrySet().forEach(System.out::println);
		
		//Number of employees in each department
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().forEach(System.out::println);
		
		//Find the oldest Employee
		String s=empList.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).findFirst().get().toString();
		System.out.println(s);
		
		//Find Youngest Female Employee
		 s=empList.stream().filter(t-> t.getGender()=="F").min(Comparator.comparingInt(Employee::getAge)).get().toString();
		 System.out.println(s);
		 
		 // Partition Employees By Age Greater than 30 and less than 30
		 Map<Boolean, List<Employee>> eList=empList.stream().collect(Collectors.partitioningBy(es -> es.getAge() >30));
		 eList.entrySet().forEach( t -> {
			 if(t.getKey()) {
				System.out.println(">30 "+t.getValue());
			 }else {
				 System.out.println(t.getValue());
			 }
		 });
		 
//		  Find the department name which has the highest number of employees.
		 Map.Entry<String, Long> maxNoOfEmployeesInDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
				 .entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 System.out.println("Max no of employees present in Dept :: " + maxNoOfEmployeesInDept.getKey());
		 
		 //Print Average and Total salary
		 LongSummaryStatistics emp=empList.stream().collect(Collectors.summarizingLong(Employee::getSalary)); 
		 System.out.println(emp.getAverage()+" "+ emp.getSum());
		 
		 Long sum=empList.stream().map(Employee::getSalary).reduce((a,b) -> a+b).get();
		 
		 System.out.println("Total Salary "+sum); 
		 System.out.println("AVG Salary "+sum/9); 
		 
		 //Print average salary of each department
		 empList.stream().collect(Collectors.groupingBy(Employee:: getDeptName,Collectors.averagingDouble(Employee::getSalary)))
		 .entrySet().forEach(System.out::println);
	
		 // Find highest paid salary in the organization based on gender.
		 empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors
				 .maxBy((t3,t4) -> (int) (t3.getSalary()- t4.getSalary())))).entrySet().forEach(System.out::println);
	
//		 Find lowest paid salary in the organization based in the organization.
		 empList.stream().collect(Collectors.groupingBy(Employee::getGender,
				 Collectors.minBy((t1,t2) -> (int)(t1.getSalary() - t2.getSalary())))).entrySet().forEach(System.out::println);
	
		 //Highest salary based on department.
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.collectingAndThen
				 (Collectors.toList(),list -> list.stream().max(Comparator.comparing(Employee::getSalary))))).entrySet().forEach(System.out::println);
	
		 //Second Highest salary based on department.
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors
				.collectingAndThen(Collectors.toList(), list ->  list.stream()
						.sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).skip(1).findAny()))).entrySet().forEach(System.out::println);;
	}
	

}
