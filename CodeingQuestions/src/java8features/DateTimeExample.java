package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Aneesh.Mathai
 */
public class DateTimeExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date "+date);
		
		 LocalTime time = LocalTime.now();
		 System.out.println("Current Time "+time);
		 
		 LocalDateTime dtTime = LocalDateTime.now();
		 System.out.println("Current Date Time "+dtTime);
		 
		 System.out.println("Current Month "+dtTime.getMonth());
		 
		 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
		 System.out.println("Current Date Time formattted "+ formatter.format(dtTime));
	}

}
