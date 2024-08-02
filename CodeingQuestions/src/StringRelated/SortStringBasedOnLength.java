package StringRelated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class SortStringBasedOnLength {

	public static void main(String[] args) {
		
		List<String > test = Arrays.asList("Hello","Hi","Are","you","there?");
		test.stream().sorted(Comparator.comparing(String::length))
					.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(test.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get());
		
		System.out.println("Max Length "+test.stream().map(String::length).max(Comparator.naturalOrder()).get());

	}

}
