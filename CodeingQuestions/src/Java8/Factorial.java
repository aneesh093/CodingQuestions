package Java8;

import java.util.stream.IntStream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(IntStream.rangeClosed(1, 5).reduce(1,(x,y)-> x*y ));

	}

}
