package collectionsexample;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import Java8.DemoObject;

/**
 * Weak Hash Map is used for garbage collection. whenever a reference object is present in hashmap it will not be garbage collected.
 * In case of weakhashmap it will be garbage collected
 * @author Aneesh.Mathai
 */
public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {

		Map<DemoObject,String> testMap =new WeakHashMap<>();
		DemoObject ob1 =new DemoObject();
		ob1.setId(1);
		
		Map<DemoObject,String> hashMap =new HashMap<>();
		DemoObject ob2 =new DemoObject();
		ob2.setId(1);
		
		testMap.put(ob1, "Demo Object 1");
		hashMap.put(ob2, "Demo Object 2");
		
		
		ob1=null;
		ob2=null;
		
		System.out.println("Weak HashMap "+testMap);
		System.out.println("HashMap "+hashMap);
		
		System.gc();
		
		System.out.println();
		
		System.out.println("Weak HashMap "+testMap);
		System.out.println("HashMap "+hashMap);
	}

}
