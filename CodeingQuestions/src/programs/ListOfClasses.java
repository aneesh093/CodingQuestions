package programs;

import java.util.ArrayList;
import java.util.List;

public class ListOfClasses {

	public static void main(String[] args) {
		List<TestClass> te=new ArrayList<>();
		te.add(new TestClass("name1"));
		te.add(new TestClass("name2"));
		
		for(TestClass t : te) {
			System.out.println(t.getName());
		}
	}

}

class TestClass{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	TestClass(String st){
		name=st;
	}
}
