package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FindMaxMin {

	public static void main(String[] args) {

		List<Integer> test= Arrays.asList(10,5,3,45,2,98,6);
		Integer max=test.stream().max(Comparator.naturalOrder()).get();
		Integer min=test.stream().min(Comparator.naturalOrder()).get();
		
		Integer max2=test.stream().reduce((x,y) -> x > y ?x :y).get();
		
		System.out.println(test.stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList()));
        
		
		System.out.println("Max is "+max+" Min is "+min);
		
	}

}
