package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * 
 * @author Aneesh.Mathai
 */
public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> test = Arrays.asList(10,20,5,6,30,15,81,75);
		Integer secondLargest=test.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Largest "+secondLargest);
		
		Integer thirdSmallest= test.stream().sorted().skip(2).findAny().get();
		System.out.println("Third Smallest "+thirdSmallest);
		
	}

}
