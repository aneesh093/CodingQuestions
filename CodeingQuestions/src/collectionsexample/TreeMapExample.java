package collectionsexample;

import java.util.Map;
import java.util.TreeMap;

/**
 * Tree Map will sort the keys and insert it into map in an ascending order.
 * It will not contain duplicates
 * It will use comparator to sort the elements.
 * 
 * @author Aneesh.Mathai
 */
public class TreeMapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> treeMap =new TreeMap<>();
		treeMap.put(10, "A");
		treeMap.put(15, "B");
		treeMap.put(9, "C");
		treeMap.put(6, "D");
		treeMap.put(8, "E");
		treeMap.put(1, "F");
		treeMap.put(3, "G");
		
		System.out.println(treeMap);
		
	}

}
