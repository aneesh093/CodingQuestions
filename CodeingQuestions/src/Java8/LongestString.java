package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/**
 * 
 * @author Aneesh.Mathai
 */
public class LongestString {

	public static void main(String[] args) {

		String[] str = { "HI", "Hello", "How", "are you my friend", "welcome" };

		List<String> stList=Arrays.asList(str);
		Optional<String> s1 = stList.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
		System.out.println(s1.get());
		
	}

}
