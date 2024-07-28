package programs;

/**
 * @author Aneesh.Mathai
 */
public class DeliveryRoute {

	public static void main(String[] args) {
		int[] arr= {2,2,5,6,-2};
		System.out.println(findPivotIndex(arr));
	}
	
	public static int findPivotIndex(int[] arr) {
		int sum=0;
		for(int num:arr) {
			sum +=num;
		}
		int prefix=0;
		
		for(int i=0;i<arr.length;i++) {
			if(prefix==sum-arr[i]-prefix) {
				return i+1;
			}
			prefix += arr[i];
			
		}
		return -1;
	}

}
