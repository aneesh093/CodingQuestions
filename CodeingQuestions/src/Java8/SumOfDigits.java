package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class SumOfDigits {

	public static void main(String[] args) {

		Integer[] arr= { 10,20,30,5,15,25};
		
		List<Integer> testList=Arrays.asList(arr);
		
		// Using method reference
		System.out.println("Method Reference "+ testList.stream().reduce(0,Integer::sum));
		
		// Using lambda expression
		System.out.println("Lambda Expression "+ testList.stream().reduce((a,b)->a+b).get());
		
		//Using Collect
		System.out.println("Using Collect "+ testList.stream().collect(Collectors.summingInt(Integer::intValue)));
		
		//Using Intstream
		System.out.println("Using Integer Stream "+ testList.stream().mapToInt(Integer::intValue).sum());

	}

}
