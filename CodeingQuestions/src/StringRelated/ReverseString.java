package StringRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class ReverseString {

	public static void main(String[] args) {
		
		char[] s= {'H','E','L','L','O'};
		for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
//		Arrays.asList(s).stream().forEach( t -> System.out.print(t));
		
		
		String str="Hello";
		String se=Stream.of(str.split(" ")).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()).toString();
		System.out.println(se);
		
	}

}
