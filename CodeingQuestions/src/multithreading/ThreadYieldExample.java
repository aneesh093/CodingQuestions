package multithreading;

/**
 * 
 * Yield is a method of thread class which allow us to run another thread which has same priority by pause its current thread
 * 
 * @author Aneesh.Mathai
 */
public class ThreadYieldExample {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
	}

}


class Thread1 extends Thread{
	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}