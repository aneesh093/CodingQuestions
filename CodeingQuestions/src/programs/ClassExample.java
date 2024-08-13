package programs;

public class ClassExample {

	public static void main(String[] args) {
		B b=new B();
		b.show();
	}

}

class A{
	public void show() {
		System.out.println("A");
	}
	
	public void test() {
		this.show();
	}
}

class B extends A{
	public void show() {
		System.out.println("B");
	}
}
