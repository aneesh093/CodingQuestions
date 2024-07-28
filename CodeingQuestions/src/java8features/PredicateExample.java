package java8features;

import java.util.function.Predicate;
/**
 * 
 * @author Aneesh.Mathai
 */
public class PredicateExample {
	public static void main(String[] args) {
		
		Predicate<Integer> sum  = (a) ->  a==0?  true:  false;
		
		Predicate<Integer> sum1 = (a) ->  a>0?  true:  false;
			
		System.out.println("Using Test Method " + sum.test(10));
		
		System.out.println("Using Negate " + sum.negate().test(10)); 
		
		System.out.println("Using Or Method " + sum.or(sum1).test(10)); // sum.test(10) or sum1.test(10)
		
		System.out.println("Using And Method " + sum.and(sum1).test(10)); // sum.test(10) and sum1.test(10)
		
	}
}
