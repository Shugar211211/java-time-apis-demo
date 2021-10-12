// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
// https://beginnersbook.com/2017/11/java-datetimeformatter/

package date_time_formatter;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		// creating string representing date in predefined format
		String dateStr1 = localDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println(dateStr1);
		
		// creating DateTimeFormatter instance with predefined format
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
		
		// creating string representing date in predefined format
		// another way of creatind the same as on line 15
		String dateStr2 = dateTimeFormatter.format(localDate);
		System.out.println(dateStr2);
		
		////////////////////////////////////////////////////////////////////////
		
		// creating LocalDate instance by parsing string in predefined format
		LocalDate localDate2 = LocalDate.parse("2021-01-01", DateTimeFormatter.ISO_DATE);
		System.out.println(localDate2);
		
		////////////////////////////////////////////////////////////////////////
		
		// creating specific format called myFormat1
		DateTimeFormatter myFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:a");
		
		// creating string representing date in myFormat1
		LocalDateTime localDateTime1 = LocalDateTime.now();
		String dateStr3 = localDateTime1.format(myFormat1);
		System.out.println(dateStr3);
		
		////////////////////////////////////////////////////////////////////////
		
		// creating specific format called myFormat2
		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		// creating string representing date in myFormat2
		String dateStr4 = LocalDateTime.of(1980, 10, 16, 18, 0).format(myFormat2);
		System.out.println(dateStr4);
		
		////////////////////////////////////////////////////////////////////////
		
		// creating LocalDateTime instance by parsing string in myFormat2
		LocalDateTime ld3 = LocalDateTime.parse("13-11-1985 05:00:00", myFormat2);
		System.out.println(ld3);
	}
}
