// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

package local_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2021, 10, 8);
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2021, 300);
		System.out.println(localDate2);
		
		LocalDate localDate7 = LocalDate.of(2021, Month.OCTOBER, 8);
		System.out.println(localDate7);
		
		LocalDate localDate8 = LocalDate.ofEpochDay(0);
		System.out.println(localDate8);
		
		LocalDate localDate9 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println(localDate9);
		
		LocalDate localDate3 = LocalDate.parse("2021-10-08");
		System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.parse("2021-10-08", DateTimeFormatter.ISO_DATE);
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("20211008", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate5);
		
		LocalDate localDate6 = LocalDate.parse("2021-10-08+23:00", DateTimeFormatter.ISO_OFFSET_DATE);
		System.out.println(localDate6);
	}

}
