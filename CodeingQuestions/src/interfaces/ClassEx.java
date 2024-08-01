package interfaces;

/**
 * 
 * @author Aneesh.Mathai
 */
public class ClassEx extends B {

	public static void main(String[] args) {
		A a= new B();
//		System.out.println(a.show());
		a.show();
	}
}

class A{
	A(){
	}
	public void show() {
		System.out.println("Show Called A");
//		return "Hello";
	}
}

class B extends A{
	B(){
		super();
	}
	public void show() {
		System.out.println("Test");
//		return super.show();
	}
}