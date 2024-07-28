package comparatorexample;

import java.util.Comparator;
/**
 * 
 * @author Aneesh.Mathai
 */
public class Employee implements Comparable<Employee>,Comparator<Employee>{

	Integer empId;
	String name;
	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}


	@Override
	public int compareTo(Employee o) {
		if (empId == o.getEmpId()) {
			return 0;
		} else if (empId > o.getEmpId()) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public Employee() {
		super();
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpId() == o2.getEmpId()) {
			return o1.getName().compareTo(o2.getName());
		} else if (o1.getEmpId() > o2.getEmpId()) {
			return 1;
		} else {
			return -1;
		}
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	
}
