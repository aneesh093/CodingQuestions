package programs;

/**
 * @author Aneesh.Mathai
 */
public class ThreadDemo {

	public static int num = 10;
	public static boolean flag = true;
	public static Object lock = new Object();

	public static void main(String[] args) {
		Thread t1=new Thread(new Threads1());
		Thread t2=new Thread(new Threads2());
		t1.start();
		t2.start();
	}

	static class Threads1 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < num; i++) {
				synchronized (lock) {
					while (!flag) {
						try {
							lock.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("element1 ");
					flag = false; // Switch turn to element2
					lock.notify(); // Notify the waiting thread (element2 thread)
				}
			}
		}
	}

	static class Threads2 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < num; i++) {
				synchronized (lock) {
					while (flag) {
						try {
							lock.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("element 2 ");
					flag = true; // Switch turn to element2
					lock.notify(); // Notify the waiting thread (element2 thread)
				}

			}
		}
	}

}
