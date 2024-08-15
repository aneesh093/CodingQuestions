package Java8;

import java.math.BigDecimal;

public class DemoObject {
	
	private Integer id;
	private String name;
	private BigDecimal salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public DemoObject(Integer id, String name, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public DemoObject() {
		super();
	}
	@Override
	public String toString() {
		return "DemoObject [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
