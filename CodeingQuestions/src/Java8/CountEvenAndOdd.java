package Java8;

import java.util.Arrays;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class CountEvenAndOdd {

	public static void main(String[] args) {

		List<Integer> l1= Arrays.asList(1,10,5,3,2,6,9,8);
		
		Map<Boolean,List<Integer>> test =l1.stream().collect(Collectors.partitioningBy( t -> t%2==0));
		test.entrySet().forEach(t -> {
			if(t.getKey()) {
				System.out.println("Even numbers "+t.getValue());
			}
			else {
				System.out.println("Odd numbers "+t.getValue());
			}
		});
		
		IntStream.rangeClosed(0,10).boxed().collect(Collectors.partitioningBy(k-> k%2==0)).entrySet().forEach(t -> {
	           if(Boolean.TRUE.equals(t.getKey())){
	               System.out.println("True "+t.getValue());
	           }else{
	                System.out.println("False "+t.getValue());
	           }
	       });
	       
	}

}
