package programs;

/**
 * @author Aneesh.Mathai
 */
public class CustomException {

	public static void main(String args[]) {
		
		double a = 10.0;
		double b=10;
		
		try {
			 
			if(b<=0) {
				throw new ExceptionDemo("B is Zero");
			}
			double c=0.0;
			
			double d= a/c;
			System.out.println(d);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class ExceptionDemo extends Exception{
	
	public ExceptionDemo(String msg) {
		super(msg);
	}
}
