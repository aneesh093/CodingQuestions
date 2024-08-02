
package Java8;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FindCommonElements {

	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(10,20,30,40,50);
		List<Integer> l2 = Arrays.asList(5,15,25,35,50);
		
		l1.stream().filter(l2::contains).forEach(System.out::println);
		
		l1.stream().filter((t-> !l2.contains(t))).forEach(System.out::println);
	       
	}

}
