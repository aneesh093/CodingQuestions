package Java8;

import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(5).mapToInt(t -> t[0])
				.forEach(System.out::println);
	}
}
