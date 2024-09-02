package programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionApiExample {

	public static void main(String[] args) throws ClassNotFoundException  {

		Class<?> cls= Class.forName("programs.TestClass1");
		
		Constructor[] cns =cls.getConstructors();
		for(Constructor c: cns) {
			System.out.println(c);
		}
		
		Method[] m =cls.getMethods();
		for(Method m1:m) {
			System.out.println(m1);
		}
	}

}

class TestClass1{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TestClass1(int id) {
		super();
		this.id = id;
	}
	

	public TestClass1() {
		super();
	}

	@Override
	public String toString() {
		return "TestClass [id=" + id + "]";
	}
	
	
}
