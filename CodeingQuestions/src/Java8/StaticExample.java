package Java8;
/**
 * 
 * @author Aneesh.Mathai
 */
public class StaticExample {

	public static void main(String[] args) {
		Test t=new Test();
		Test.val = 10;
		t.name="A";
		t.show();
		
		
		Test t1=new Test();
		t1.name="b";
		t1.show();
	}

}

class Test{
	static int val=3;
	String name;
	
	public void show() {
		val=5;
		System.out.println(val+" "+name);
	}
}
