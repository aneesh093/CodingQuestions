package StringRelated;

import java.util.LinkedHashMap;

public class ConvertStringToMap {
	public static void main(String[] args) {

		String test="tarun:1]kumar:2]Amit=4]Ani;5";
		
		java.util.Map<String,Integer> map=new LinkedHashMap<>();
		
		String[] strArray = test.split("]");
		for(int i=0;i<strArray.length;i++) {
			String[] strArray2= strArray[i].split("[:=;]");
			if(strArray2.length==2)
				map.put(strArray2[0], Integer.parseInt(strArray2[1]));
		}
		
		System.out.println(map);
	}
}


