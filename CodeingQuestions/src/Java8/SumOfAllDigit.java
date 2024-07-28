package Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class SumOfAllDigit {

	public static void main(String[] args) {

		int i=123456;
		Integer sum = Stream.of(String.valueOf(i).toString().split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
	}

}
