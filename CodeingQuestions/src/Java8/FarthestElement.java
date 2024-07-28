package Java8;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * 
 * @author Aneesh.Mathai
 */
public class FarthestElement {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter  the size");
		Integer n = s.nextInt();

		System.out.println("Enter the  Elements");
		Integer[] element = new Integer[n];
		for (int i = 0; i < n; i++) {
			element[i] = s.nextInt();
		}
		System.out.println("Farthest element is " + farthestElement(n, element));
		s.close();
	}

	public static Integer farthestElement(int size, Integer[] array) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < size; i++) {
			ts.add(array[i]);
		}
		int min = ts.first();
		int max = ts.last();

		// To Print negative values
		if (Math.abs(min) >= max) {
			return min;
		}
		return max; 
		
	}
}
