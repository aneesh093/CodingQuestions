package multithreading;
/**
 * 
 * Join method is used to put the current thread into temporary waiting state until the another thread completes execution
 * 
 * @author Aneesh.Mathai
 */
public class ThreadJoinMethod {

	public static void main(String[] args) {
		Thread t1=new Thread(new Thread3());
		Thread t2=new Thread(new Thread3());
		Thread t3=new Thread(new Thread3());
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t2.start();
		try {
			t2.join();
		}catch (Exception e) {
		}
		t1.start();
		t3.start();
	}

}

 class Thread3 implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
				
	}
	
}
