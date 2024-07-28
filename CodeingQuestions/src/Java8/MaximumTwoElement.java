package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * 
 * @author Aneesh.Mathai
 */
public class MaximumTwoElement {

	public static void main(String[] args) {
		
		List<Integer> test= Arrays.asList(10,5,3,45,2,98,6);
		System.out.println("Minimum Two Element");
		test.stream().sorted().limit(2).forEach(System.out::println);
		
		System.out.println("Maximum Two Element");
		test.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
	}
}
