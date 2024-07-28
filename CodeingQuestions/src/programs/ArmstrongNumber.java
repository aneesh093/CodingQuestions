package programs;

import java.util.Objects;
/**
 * @author Aneesh.Mathai
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Integer num=1634;
		Integer original=num;
		Integer len=num.toString().length();
		Integer sum=0;
		while(num>0) {
			Integer rem = num%10;
			sum = (int) (sum + Math.pow(rem, len));
			num= num/10;
		}
		if(Objects.equals(sum, original)) {
			System.out.println("ArmStrong");
		}else
		{
			System.out.println("Not ArmStrong");
		}
	}

}
