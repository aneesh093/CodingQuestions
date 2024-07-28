package StringRelated;

import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String s1= "Java is easy to learn";
		
		String s2=Stream.of(s1.split(" ")).map( t -> new StringBuffer(t).reverse()).collect(Collectors.joining(" "));
		System.out.println(s2);
	}

}
