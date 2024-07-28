package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,1,6,5};
		java.util.List<Integer> testList=Arrays.asList(arr);
		java.util.Set<Integer> testSet=new HashSet<>();
		java.util.Set<Integer> testSet2=new HashSet<>();
		
		System.out.println("Using Distinct");
		List<Integer> tesst=testList.stream().distinct().collect(Collectors.toList());
		System.out.println(tesst);

		System.out.println("Using Set ");
		List<Integer> tesst1=testList.stream().filter( key -> testSet.add(key)).collect(Collectors.toList());
		System.out.println(tesst1);
		
		System.out.println("Using Set only duplicate ");
		List<Integer> tesst2=testList.stream().filter( key -> !testSet2.add(key)).collect(Collectors.toList());
		System.out.println(tesst2);
	}

}
