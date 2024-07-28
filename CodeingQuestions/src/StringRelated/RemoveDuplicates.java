package StringRelated;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * 
 * @author Aneesh.Mathai
 */
public class RemoveDuplicates {

	public static void main(String[] args) {

		String st="Hi How Are You My Dear, Hi hello";
		
		Set<String> set=new HashSet<>();
		String s2=java.util.stream.Stream.of(st.split(" " )).filter(set::add).collect(Collectors.joining(" "));
		System.out.println(s2);
	}

}
