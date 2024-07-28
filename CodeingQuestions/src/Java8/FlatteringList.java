package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FlatteringList {
	public static void main(String args[]) {
		
		// Do flattering list of objects and do the sorting using java8
		List<Integer> l1= Arrays.asList(3,1,4,2);
		List<Integer> l2= Arrays.asList(8,5,7,6);
		
		Stream.concat(l1.stream(), l2.stream()).sorted().forEach( t -> {
			System.out.print(t);
		});
	}
}
