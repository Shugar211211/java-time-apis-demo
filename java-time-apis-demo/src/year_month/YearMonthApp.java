package year_month;

import java.time.Clock;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthApp {
	public static void main(String[] args) {
		
		YearMonth ym1 = YearMonth.now();
		System.out.println(ym1);
		
		YearMonth ym4 = YearMonth.now(Clock.systemUTC());
		System.out.println(ym4);
		
		YearMonth ym5 = YearMonth.of(1995, 1);
		System.out.println(ym5);
		
		YearMonth ym6 = YearMonth.of(1991, Month.APRIL);
		System.out.println(ym6);
		
		YearMonth ym7 = YearMonth.parse("2008-01");
		System.out.println(ym7);
		
		YearMonth ym8 = Year.of(1990).atMonth(Month.JULY);
		System.out.println(ym8);
		
		YearMonth ym9 = Year.of(1990).atMonth(7);
		System.out.println(ym9);
		
		YearMonth ym2 = ym1.plus(Period.ofYears(5));
		System.out.println(ym2);

		YearMonth ym3 = ym1.minus(Period.ofYears(3));
		System.out.println(ym3);
	}
}
