package programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Aneesh.Mathai
 */
public class BinarySearchTree {

	public static void main(String[] args) {
		
		Integer[] arr = {10,5,6,8,3,7,22,15,2};
		int low = 0;
		int high = arr.length-1;
		int target = 10;
		
		// To Sort the Array because BST is always sorted
		List<Integer> li= Stream.of(arr).sorted().collect(Collectors.toList());

		System.out.println(li);
		int loc=bst(li.toArray(new Integer[0]), high, low, target);
		System.out.println("Element found at location "+loc);
		
	}
	
	public static int bst(Integer[] arr,int high,int low,int key) {
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]<key) {
				low = mid+1;
			}else if(arr[mid]==key) {
				return mid;
			}else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		return -1;
	}

}
