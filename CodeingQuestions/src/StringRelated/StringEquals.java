package StringRelated;

public class StringEquals {

	public static void main(String[] args) {

		String s1="hai";
		String s2="hai";
		String s3=new String("hai");
		
		String s4=s3;
		
		if(s1==s2)
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
		
		if(s1==s3) {
			System.out.println("Equals with new object");
		}else {
			System.out.println("does not Equals with new object");
		}
		
		if(s4==s3) {
			System.out.println("Equals with Reference " +s3);
		}else {
			System.out.println("does not Equals with Reference");
		}
		
		s3="hello";
		System.out.println("S4 value "+s4);
	}

}
