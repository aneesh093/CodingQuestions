package StringRelated;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneesh.Mathai
 */
public class RemoveCharacterFromAnother {

	public static void main(String[] args) {
		String s1="HelloWorld";
		String s2 ="ello";
		
		Map<Character,Integer> stringMap=new HashMap<Character, Integer>();
		for(char c: s2.toCharArray()) {
			stringMap.put(c, 1);
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(stringMap.get(s1.charAt(i))==null) {
				sb.append(s1.charAt(i));
			}
		}
		
		System.out.println("String after removing characters "+sb);
	}

}
