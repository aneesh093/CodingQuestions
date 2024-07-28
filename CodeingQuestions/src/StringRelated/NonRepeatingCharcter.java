package StringRelated;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Aneesh.Mathai
 */
public class NonRepeatingCharcter {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the string ");
			String str=s.next();
			
			String c = Arrays.asList(str.split("")).stream()
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet().stream().filter(t -> t.getValue() == 1).findFirst().orElseThrow().getKey();
			System.out.println(c);
		}
	}

}
