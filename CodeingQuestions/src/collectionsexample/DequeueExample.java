package collectionsexample;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque is an interface where we can perform operations on both the side of the queue.
 * @author Aneesh.Mathai
 */
public class DequeueExample {

	public static void main(String[] args) {

		// Deque is an interface so we cannot create a Deque object, 
		// thats why we are using the ArrayDeque which is an implemented class of Deque
		Deque<Integer> deque=new ArrayDeque<Integer>();
		deque.add(10);
		deque.add(15);
		deque.add(9);
		deque.add(6);
		deque.add(8);
		deque.add(1);
		deque.add(3);
		
		System.out.println(deque);
		deque.addFirst(99);
		System.out.println("Added First "+deque);
		
		deque.addLast(999);
		System.out.println("Added Last "+deque);
		
		System.out.println("Removed Element "+deque.pop());
		System.out.println("After Removing "+deque);
		
		// Poll will not throw exception if the queue is empty
		System.out.println("Removed Element "+deque.poll());
		System.out.println("After Removing "+deque);
	}

}
