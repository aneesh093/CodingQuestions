package programs;

import java.util.LinkedList;

/**
 * @author Aneesh.Mathai
 */
public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(10);
		l1.add(5);
		l1.add(21);
		
		l1.descendingIterator().forEachRemaining(System.out::println);
	}

}
