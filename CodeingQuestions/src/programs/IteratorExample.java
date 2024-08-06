package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorExample {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			 Map.Entry<Integer,String> val = it.next();
			 System.out.println(val.getKey()+"  "+val.getValue());
			
		}

		for(Map.Entry<Integer, String> val:map.entrySet()) {
			System.out.println(val.getKey()+"  "+val.getValue());
		}
	}

}
