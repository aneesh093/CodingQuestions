package StringRelated;
/**
 * 
 * @author Aneesh.Mathai
 */
public class PrintNumbersAsString {

	public static void main(String[] args) {
		
		Integer number=11019;
		String returnPostion="";
		String s1=String.valueOf(number);
		while(s1.length()>0) {
			
			if(s1.length() == 2 || s1.length()==5 || s1.length()==7 || s1.length()==9) {
				boolean flag= s1.startsWith("1")?true:false;
				String num= return3Pos(s1,flag);
				returnPostion =returnPostion+" "+num+" "+ (num.equals("")?"": returnPosition(s1.length()));
				s1=s1.substring(2);
			}else {
				String num = returnNumber(Integer.parseInt(String.valueOf(s1.charAt(0))));
				returnPostion=returnPostion+" "+num+" "+ (num.equals("")?"": returnPosition(s1.length()));
				s1=s1.substring(1);
			}
		}
		System.out.println(returnPostion);
	}
	
	public static String returnPosition(int len) {
		switch (len) {
		case 3:	return "hundred";
		case 4, 5:	return "thousand";
		case 6,7 : return "lakh";
		case 8,9: return "crore";
		default: return "";
	  }
	}
	
	public static String returnNumber(int number) {
		int num = number % 10;
		if (num == 0) {
			return "";
		} else {
			switch (number) {
			case 0 : return "";
			case 1:	return "One";
			case 2:	return "Two";
			case 3:	return "Three";
			case 4:	return "Four";
			case 5:	return "Five";
			case 6:	return "Six";
			case 7:	return "Seven";
			case 8:	return "Eight";
			case 9:	return "Nine";
			default: return "";
			}
		}
	}
	
	
	
	public static String return3Pos(String number,boolean pos) {
		String[] test= {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		
		if(pos) {
			String s1=number.substring(0,2);
			switch(s1) {
				case "10": return "Ten";
				case "11": return test[0];
				case "12": return test[1];
				case "13": return test[2];
				case "14": return test[3];
				case "15": return test[4];
				case "16": return test[5];
				case "17": return test[6];
				case "18": return test[7];
				case "19": return test[8];
			}
		}else {
			char s2= number.charAt(0);
			switch(s2){
			case '0': return returnNumber(Integer.parseInt(String.valueOf(number.charAt(1))));
			case '1': return test(number,s2,1);
			case '2': return test(number,s2,2);
			case '3': return test(number,s2,3);
			case '4': return test(number,s2,4);
			case '5': return test(number,s2,5);
			case '6': return test(number,s2,6);
			case '7': return test(number,s2,7);
			case '8': return test(number,s2,8);
			case '9': return test(number,s2,9);
			}
		}
		
		return "";
	}
	
	public static String test(String number, char s2, int pos) {
		String[] test= {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		String s1= returnNumber(s2);
		String s3= s1.equalsIgnoreCase("")? test[pos-1]: s1;
		return s3+" "+ returnNumber(Integer.parseInt(String.valueOf(number.charAt(1)))); 
	}
}
