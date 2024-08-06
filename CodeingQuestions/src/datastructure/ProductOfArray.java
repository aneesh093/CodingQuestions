package datastructure;

public class ProductOfArray {

	public static void main(String[] args) {
		int arr[]  = {10, 3, 5, 6, 2};
		int arr1[]=getProdArray(arr);
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
		}
	}
	
	/**
	  	Input: arr[]  = {10, 3, 5, 6, 2}
		Output: prod[]  = {180, 600, 360, 300, 900}
		3 * 5 * 6 * 2 product of other array 
		elements except 10 is 180
	 */
	public static int[] getProdArray(int[] arr) {
		int n=arr.length;
		int[] prod=new int[n];
		
		for(int i=0;i<n;i++) {
			int prodValue=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					prodValue = prodValue *arr[j];
				}
			}
			prod[i]=prodValue;
		}
		return prod;
	}

}
