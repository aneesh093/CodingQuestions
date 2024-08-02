package programs;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.calculate(5, 10);
		
		Class1 cls=new Test2();
		cls.calculate(5, 5);
		
	}

}

abstract class Class1{
	public abstract void calculate(int a,int b);
}

class Test1 extends Class1{
	public void calculate(int a,int b) {
		System.out.println( 10*a*b);
	}
}

class Test2 extends Class1{
	public void calculate(int a,int b) {
		System.out.println( (5*a)+b);
	}
}