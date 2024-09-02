package Java8;

import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 5,8,6,1,2,12,7};
		IntStream.range(0, arr.length)
				 .mapToObj(i -> arr[arr.length - i - 1]).forEach(System.out::println);
		
	}

}
