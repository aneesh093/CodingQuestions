package StringRelated;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aneesh.Mathai
 */
public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println("Test Case 1 --> "+longestSubstring("abcabcbb"));
		System.out.println("Test Case 2 --> "+longestSubstring("aaaaaa"));
	}

	public static int longestSubstring(String s) {
		int count=0;
		int left = 0;
		Set<Character> charSet =new HashSet<>();

		for(int right=0;right<s.length();right++){
			char c=s.charAt(right);
			while(charSet.contains(c)){
				charSet.remove(s.charAt(left));
				left++;
			}
			charSet.add(c);
			count=Math.max(count,right-left+1);
		}

		return count;
	}

}
