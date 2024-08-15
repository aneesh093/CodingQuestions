package collectionsexample;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 *  Identity hash map is a type of Map which uses equality operator to compare the key instead of equals method. 
 *  Basically identity hash map check for the memory reference instead of exact value
 * @author Aneesh.Mathai
 */
public class IdentityHashMapExample {

	public static void main(String[] args) {

		Map<String,String> identityHashMap =new IdentityHashMap<>();
		
		identityHashMap.put("Example", "Value1");
		identityHashMap.put(new String("Example"), "Value2");
		identityHashMap.put("Example", "Value3");
		
		
		System.out.println(identityHashMap.size());
		System.out.println(identityHashMap);
	}

}
