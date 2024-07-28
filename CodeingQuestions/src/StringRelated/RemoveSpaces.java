
package StringRelated;

/**
 * @author Aneesh.Mathai
 */
public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str =" Hello World   ";
		System.out.println("After Removing Leading and Trailing Space "+str.strip());
		
		
		String str1 =" Hello World   ";
		StringBuilder sb=new StringBuilder();
		for(char c:str1.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println("After Removing Space "+sb);
	}

}
