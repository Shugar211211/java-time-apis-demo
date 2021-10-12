// https://www.geeksforgeeks.org/month-of-method-in-java/

package month;

import java.time.Month;

public class MonthApp {

	public static void main(String[] args) {
		
		// Create a month instance
		Month month = Month.of(10);
		
		// Print the month instance
		System.out.println(month);
	}

}
