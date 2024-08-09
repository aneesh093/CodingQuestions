package programs;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoElement {

	public static void main(String[] args) {

		int[] arr= {1,2,3,5,3,9,6};
		int target=10;
		
		Set<Integer> te=new HashSet<>();
		
		for(int i:arr) {
			
			int c = target-i;
			if(te.contains(c)) {
				System.out.println(i +" "+c);
			}
			te.add(i);
		}

	}

}
