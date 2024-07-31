package interfaces;

/**
 * 
 * @author Aneesh.Mathai
 */
public class ClassEx extends B {

	public static void main(String[] args) {
		B a= new B();
		System.out.println(a.show());
	}
}

class A{
	A(){
	}
	public String show() {
//		System.out.println("Show Called A");
		return "Hello";
	}
}

class B extends A{
	B(){
		super();
	}
	public String show() {
		System.out.println("Test");
		return super.show();
	}
}