package StringRelated;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.*;

/**
 * @author Aneesh Mathai
 */
public class PatternMatchingProgram {

	public static void main(String[] args) {
		String input = "The sky1 is blue";
		
		List<String> words = Arrays.asList(input.split(" "));
		
		Pattern p=Pattern.compile("\\d");
		
		for(int i=0;i<words.size();i++) {
			String s=words.get(i);
			Matcher m = p.matcher(s);
			if(m.find()) {
				String reversed = new StringBuffer(s).reverse().toString();
				words.set(i, reversed);
			}
		}
		
		Collections.reverse(words);
		String output=String.join(" ", words);
		System.out.println(output);
		
	}

}
