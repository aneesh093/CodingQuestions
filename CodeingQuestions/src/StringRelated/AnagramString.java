package StringRelated;

import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class AnagramString {

	public static void main(String[] args) {

		String s1="Race Car";
		String s2="Car Race";
		
		String s3= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String s4 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		
		if(s3.equals(s4))
			System.out.println("Anagram ");
		else
			System.out.println("Not Anagram ");

	}

}
