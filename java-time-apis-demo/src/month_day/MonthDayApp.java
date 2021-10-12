package month_day;

import java.time.Clock;
import java.time.Month;
import java.time.MonthDay;

public class MonthDayApp {

	public static void main(String[] args) {
		
		MonthDay md3 = MonthDay.now();
		System.out.println(md3);
		
		MonthDay md4 = MonthDay.now(Clock.systemUTC());
		System.out.println(md4);
		
		MonthDay md1 = MonthDay.of(Month.DECEMBER, 21);
		System.out.println(md1);
		
		MonthDay md2 = MonthDay.of(12, 21);
		System.out.println(md2);
		
		MonthDay md5 = MonthDay.parse("--11-13");
		System.out.println(md5);
	}

}
