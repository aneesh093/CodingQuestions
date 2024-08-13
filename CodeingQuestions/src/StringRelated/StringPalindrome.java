package StringRelated;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String input= "zr?pu?z";
		String reverseInput= new StringBuilder(input).reverse().toString();
		System.out.println(reverseInput);
		 char[] inputArr = input.toCharArray();
//			if (input.equals(reverseInput)) {
				for (int i = 0, j = input.length() - 1; i < input.length() - 1; i++, j--) {
					if (input.charAt(i) == '?') {
						inputArr[i]= input.charAt(j);
					}
				}
//			} else {
//				System.out.println("Not Palindrome");
//			}

			System.out.println(inputArr);
		}

}
