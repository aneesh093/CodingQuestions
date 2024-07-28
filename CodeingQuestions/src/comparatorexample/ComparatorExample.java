package comparatorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 
 * @author Aneesh.Mathai
 */
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Employee> empList= Arrays.asList(
				new Employee(2, "hi"),
				new Employee(1, "you"),
				new Employee(1, "am")
			);
		
		List<Employee> emp2List= new ArrayList<>(empList);
		List<Employee> emp3List= new ArrayList<>(empList);
		List<Employee> emp4List= new ArrayList<>(empList);
		
		System.out.println(" Using Comparable");
		empList.stream().forEach( t-> System.out.println(t.getEmpId()));
		Collections.sort(empList);
		empList.stream().forEach( t-> System.out.println(t.getEmpId()));
		
		System.out.println(" Using Comparator");
		emp2List.stream().forEach( t-> System.out.println(t.getEmpId()+ " " +t.getName()));
		Collections.sort(emp2List,new Employee());
		emp2List.stream().forEach( t-> System.out.println(t.getEmpId()+ " " +t.getName()));
		
		
		System.out.println(" Using Lambda Expression");
		Collections.sort(emp3List, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		emp3List.stream().forEach( t-> System.out.println(t.getEmpId()+ " " +t.getName()));
		
		System.out.println(" Using Anonymous Class");
		Collections.sort(emp4List, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});	
		emp4List.stream().forEach(System.out::println);
	}

}
