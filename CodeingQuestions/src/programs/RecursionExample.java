package programs;

public class RecursionExample {

	public static void main(String[] args) {
		
		System.out.println("Desending Order using Recursion");
		printNumber(5);
		
		System.out.println("Ascending Order using Recursion");
		printNumber1(5);
		System.out.println("dd");
	}

	public static void printNumber(int n) {
		if(n>0) {
			System.out.println(n);
			printNumber(n-1);
		}
	}
	
	public static void printNumber1(int n) {
		if(n>0) {
			printNumber1(n-1);
			System.out.println(n);
		}
	}
}
