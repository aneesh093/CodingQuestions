package singletons;

public class ThreadSafeSingleTon {

	public static void main(String[] args) {
		SingleTonDemoTest demo = SingleTonDemoTest.getObject();
		System.out.println(demo.hashCode());

		SingleTonDemoTest demo1 = SingleTonDemoTest.getObject();
		System.out.println(demo1.hashCode());
	}

}


class SingleTonDemoTest{
	
	private static volatile SingleTonDemoTest singleTon;
	private static Object obj=new Object();
	
	private SingleTonDemoTest() {
		
	}
	
	public static SingleTonDemoTest getObject() {
		SingleTonDemoTest result= singleTon;
		if(result==null) {
			synchronized (obj) {
				result= singleTon;
				if(result==null) {
					result = singleTon = new SingleTonDemoTest();
				}
			}
		}
		return result;
	}
}