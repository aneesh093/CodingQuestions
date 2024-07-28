package StringRelated;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Aneesh.Mathai
 */
public class JoinString {

	public static void main(String[] args) {

		List<String> testString = Arrays.asList("hello","hi","how");
		
		System.out.println(testString.stream().collect(Collectors.joining(",","[","]")));
	}

}
