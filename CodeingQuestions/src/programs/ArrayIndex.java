package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Aneesh.Mathai
 * Program to print the index based on their sorted position
 * Ex 15 is the 3rd lowest number and it's index is 2 
 * 1 is the lowest number so its index is 0...
 */
public class ArrayIndex {

	public static void main(String[] args) {
		Integer[] arr = {15,1,5,20,16};
		
		List<Integer> test = new ArrayList<>(Arrays.asList(arr));
		
		Collections.sort(test);
		for(int i=0;i<arr.length;i++) {
			int index = test.indexOf(arr[i]);
			System.out.println(index);
		}
	}
}
