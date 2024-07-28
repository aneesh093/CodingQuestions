package Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Aneesh.Mathai
 */
public class FrequencyOfCharacter {
	public static void main(String[] args) {
		String st= "Java is easy to learn";

		System.out.println(" ***************** With Space ***************");
		Map<Character,Long> charCount =st.chars().mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charCount);
		
		System.out.println(" ***************** Without Space ***************");
		Map<Character,Long> charCount1 =st.chars().mapToObj(c-> (char) c).filter(t -> t!=' ')
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charCount1);
		
		Map<Character,Long> charCount3 = Stream.of(st.split("")).map(c-> c.charAt(0)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charCount3);
	}
}
