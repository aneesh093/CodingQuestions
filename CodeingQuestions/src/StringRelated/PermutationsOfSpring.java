package StringRelated;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Aneesh.Mathai
 */
public class PermutationsOfSpring {

	public static void main(String[] args) {
		
		String st="ABC";
		Set<String> permutations = new HashSet<>();
		generatePermutations(st, "", permutations);
		for (String perm : permutations) {
            System.out.println(perm);
        }
		
	}
	
	 private static void generatePermutations(String str, String prefix, Set<String> permutations) {
	        if (str.length() == 0) {
	            permutations.add(prefix);
	        } else {
	            for (int i = 0; i < str.length(); i++) {
	                String rem = str.substring(0, i) + str.substring(i + 1);
	                generatePermutations(rem, prefix + str.charAt(i), permutations);
	            }
	        }
	    }

}
