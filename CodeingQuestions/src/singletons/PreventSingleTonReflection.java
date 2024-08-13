package singletons;

public class PreventSingleTonReflection {

	public static void main(String[] args) {
		SingleTonDemo1 demo= new SingleTonDemo1();
		SingleTonDemo1 demo1= new SingleTonDemo1();
		
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
	}

}

 class  SingleTonDemo1{
	public String s="";
	
	 enum SingletonDemo1 {
	    INSTANCE;
		 SingletonDemo1()
		 {
			 if(null==demo) {
					demo=new SingleTonDemo1();
				}
		 }
	}
	
	 private static SingleTonDemo1 demo=null;
		public SingleTonDemo1() {
			s="Hello";
		}
		
		public static synchronized SingleTonDemo1 getObject() {
			return demo;
		}
}
