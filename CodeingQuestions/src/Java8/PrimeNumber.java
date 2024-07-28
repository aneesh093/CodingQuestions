package Java8;

import java.util.stream.IntStream;
/**
 * 
 * @author Aneesh.Mathai
 */
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n =50;
		
		for(int j=1;j<=n;j++) {
			final int k=j;
			boolean t=IntStream.rangeClosed(2, k/2).noneMatch(i -> k%i==0);
			if(t)
			System.out.println(k); 
		}
	}

}
