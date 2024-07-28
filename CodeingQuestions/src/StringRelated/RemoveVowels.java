package StringRelated;

import java.util.Scanner;
/**
 * 
 * @author Aneesh.Mathai
 */
public class RemoveVowels {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str = "Hello";//s.next();
		String str1="";
		boolean val=str.matches(".*[aeiou].*");
		if(val) {		
		for(int i=0;i<str.length();i++) {
			if( ! (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u' )) {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
		}
	}

}
	