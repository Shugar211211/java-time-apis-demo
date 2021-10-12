// https://www.geeksforgeeks.org/java-time-year-class-in-java/

package year;

import java.time.*;

public class YearApp {

	public static void main(String[] args) {
		
		// Object 1
        // Creating an Year class object
 
        // getting the current year each
        // using the now() method
		Year y = Year.now();
		
		// Print and display the current year
		System.out.println("Current year: " + y);
		
		// Object 2
        // Creating another Year class object Object
        // Here year 2020 as passed as an argument
		Year y1 = Year.of(2020);
		
		// Object 3
        // Creating another object of year class
        // again passing year 2022 as an argument
		Year y2 = Year.of(2022);
		
		// Now, creating a LocalDate object and
        // getting the local date at the day
        // passed as an argument
        // Custom input argument = 350
		LocalDate l = y.atDay(350);
		
		// Print the local date
		System.out.println("Local date: " + l);
		
		// Now, creating a YearMonth
        // and retrieving month using atMonth() method
        // by passing argument to the method
        // Custom input argument- 6
		YearMonth ym = y.atMonth(6);
		
		// Print the year and the month
		System.out.println("Year and month: " + ym);
		
		// Printing number of days of current Year
		System.out.println("Number of days in the current year: " + y.length());
		
		// Checking if Year y
        // is before Year y2
		System.out.println("2021 is before 2022: " + y.isBefore(y2));
		
		// check if Year y
        // is after Year y1
		System.out.println("2021 is after 2020: " + y.isAfter(y1));
		
		// Now, printing hashcode of the year
        // using the hashcode() method
		System.out.println("Hashcode of the year: " + y.hashCode());
		
		// Checking whether the year is leap year or not
		System.out.println("2020 is leap year: " + y1.isLeap());
		
		// Adding 150 years to the current year
		System.out.println("2021 + 150 years: " + y.plusYears(150));
		
		// Subtracting 150 years from the current year
		System.out.println("2021 + 150 years: " + y.plusYears(-150));
	}

}
