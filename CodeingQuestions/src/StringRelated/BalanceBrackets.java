package StringRelated;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalanceBrackets {
	public static void main(String[] args) {
		String str = "([{}])";
		Map<String, Long> testMap = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), 
						Collectors.counting()));

		int count = 0;
		if (testMap.get("(") == testMap.get(")")) {
			count++;
		}
		if (testMap.get("{") == testMap.get("}")) {
			count++;
		}
		if (testMap.get("[") == testMap.get("]")) {
			count++;
		}

		if (count == (testMap.size()/2))
			System.out.println("Balanced String");
		else
			System.out.println("Not a Balanced String");
	}

}
