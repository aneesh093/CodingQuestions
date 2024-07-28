package programs;

import java.util.Arrays;
/**
 * 
 * @author Aneesh.Mathai
 */
public class ArrayRearrangement {

	public static void main(String[] args) {

		int[] arr= { 1,2,3,4,5,6,7};
		for(int i=1;i<arr.length;i+=2) {
			int temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
			
		}
		System.out.print(Arrays.toString(arr));

	}

}
