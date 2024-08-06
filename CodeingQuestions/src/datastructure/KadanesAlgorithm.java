package datastructure;
/**
 * 
 * @author Aneesh.Mathai
 */
public class KadanesAlgorithm {

	public static void main(String[] args) {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(sum(arr));
	}

	
	/**
	Largest Contigeous Sub Array 
	Input: arr = {-2,-3,4,-1,-2,1,5,-3}
	Output: 7
	Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.
	**/

	public static Integer sum(int[] arr) {
		
		int currentSum=0;
		int totalSum=0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum=arr[i]+currentSum;
			if(currentSum>totalSum) {
				totalSum=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		return totalSum;
	}
}


