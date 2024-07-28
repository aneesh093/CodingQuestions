package java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FunctionalInterFacesExample {

	public static void main(String[] args) {
		
		System.out.print("Function ------> ");
		Function<Integer, Boolean> fun= (a)-> a>0 ? true: false;
		System.out.println(fun.apply(-10));
		
		System.out.print("BiFunction ------> ");
		BiFunction<Integer,Integer,Integer> fun1 =(a,b)-> a*b;
		System.out.println(fun1.apply(10, 5));
		
		System.out.print("Consumer ------> ");
		Consumer<Integer> con = x -> System.out.println("Value is "+x);
		con.accept(10);
		
		System.out.print("Bi Consumer ------> ");
		BiConsumer<Integer,Integer> con1 = (x,y) -> System.out.println("Value is "+x*y);
		con1.accept(10,5);
		
		System.out.print("Supplier ------> ");
		Supplier<String> sup = () ->  "Hello";
		System.out.println(sup.get());
		
	}

}
