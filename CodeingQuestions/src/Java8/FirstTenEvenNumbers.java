package Java8;

import java.util.stream.Stream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FirstTenEvenNumbers {

	public static void main(String[] args) {

		Stream.iterate(new int[] {0}, t-> new int[] {t[0]+2}).limit(15).mapToInt(t-> t[0]).forEach(System.out::println);
	}

}
