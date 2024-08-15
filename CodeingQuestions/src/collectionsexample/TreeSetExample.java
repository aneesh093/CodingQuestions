package collectionsexample;

import java.util.TreeSet;

/**
 * Tree Set will insert the element in a sorted manner
 * It does not contain any duplicates
 * It will not contain any null values
 * 
 * @author Aneesh.Mathai
 */
public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(15);
		set.add(9);
		set.add(6);
		set.add(8);
		set.add(1);
		set.add(3);
		
		
		System.out.println(set);
	}

}
