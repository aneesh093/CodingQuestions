package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author Aneesh.Mathai
 */
public class RemoveElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		
		Integer size=arr.length;
		Integer result=0;
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 !=0) {
				l1.add(arr[i]);
				
			}else {
				l2.add(arr[i]);
			}
		}
		size -=l1.size();
		
		result=l1.stream().collect(Collectors.summingInt(Integer::intValue));
		
		l1.clear();
		for(int i=0;i<size;i++) {
			if(arr[i] % 2 !=0) {
				result +=
				size--;
			}else {
				l2.add(arr[i]);
			}
		}
	}

}
