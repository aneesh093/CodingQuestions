package StringRelated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String s = "Hello world";

		java.util.Map<Character, Integer> testMap = new HashMap<>();

		Map<String,Long> t1=Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		// to find out maximum occurred character
		Optional<Entry<String, Long>> t=t1.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
				.findFirst();
		Entry<String, Long> entry=t.get();
		System.out.println(entry.getKey() + " ----- " + entry.getValue());
		
	}

}
