package programs;

public class SingleTonExample {

	public static void main(String[] args) {
		SingleTonDemo demo= SingleTonDemo.getObject();
		SingleTonDemo demo1= SingleTonDemo.getObject();
		SingleTonDemo demo2= SingleTonDemo.getObject();
		
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
	}

}

class SingleTonDemo{
	private static SingleTonDemo demo=null;
	public String s="";
	private SingleTonDemo() {
		s="Hello";
	}
	
	public static synchronized SingleTonDemo getObject() {
		if(null==demo) {
			demo=new SingleTonDemo();
		}
		return demo;
	}
	
}
