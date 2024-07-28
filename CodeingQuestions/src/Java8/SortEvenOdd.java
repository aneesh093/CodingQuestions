package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Aneesh.Mathai
 */
public class SortEvenOdd {
	public static void main(String[] args) {
		List<Integer> testList=Arrays.asList(21,36,10,2,18,33);
		Map<Boolean,List<Integer>> testMap= testList.stream().collect(Collectors.partitioningBy(i -> i%2==0));
		
		testMap.entrySet().forEach( t ->{
			if(Boolean.TRUE.equals(t.getKey()))
				System.out.println("Even Numbers ");
			else
				System.out.println("Odd Numbers ");
			t.getValue().forEach(System.out::println);
		});

	}
}
