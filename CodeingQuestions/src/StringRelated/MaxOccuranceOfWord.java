package StringRelated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Aneesh.Mathai
 */
public class MaxOccuranceOfWord {

	public static void main(String[] args) {

		String s = "Hi how are you you are great how you are learn java";
		Optional<Entry<String, Long>> test1 = Arrays.asList(s.split("\\s")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())).findAny();

//		Iterator it= testentrySet().iterator();
//		while(it.hasNext()) {
		Map.Entry entry = test1.get();
		System.out.println(entry.getKey() + " ---> " + entry.getValue());
//		}
	}

}
