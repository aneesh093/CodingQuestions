package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		Callable<String> cl =new DemoThread();
		 ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Future<String> future=  executor.submit(cl);
		
		System.out.println(future.get());
	}

}

class DemoThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Callable is called";
	}
	
}