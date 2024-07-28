package interfaces;

/**
 * 
 * @author Aneesh.Mathai
 */
public class ClassEx extends B {

	public static void main(String[] args) {
		
		B a= new B();
		a.show();

	}

}

class A{

	public void show() {
		System.out.println("Show Called A");
	}
}

class B extends A{

	public void show() {
		System.out.println("Show Called B");
	}
}