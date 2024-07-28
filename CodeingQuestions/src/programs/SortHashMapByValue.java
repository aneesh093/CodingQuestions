package programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneesh.Mathai
 */
public class SortHashMapByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> testMap=new HashMap<>();
		testMap.put("Aneesh", 3);
		testMap.put("Steevan", 1);
		testMap.put("Sachin", 4);
		testMap.put("Jobin", 2);
		
		System.out.println("Natural Order");
		testMap.entrySet().stream()
			.sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
		
		System.out.println("\nReverse Order");
		testMap.entrySet().stream()
		.sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).forEach(System.out::println);
	}

}
