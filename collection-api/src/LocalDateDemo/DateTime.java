package LocalDateDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime {
	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println("Today's date is: "+d1);
		
		LocalDate d2 = LocalDate.of(2012,02,13);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-05-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(1)); // 1 Day ahead
		System.out.println(d1.minus(1, ChronoUnit.MONTHS));   // 1 Month Behind
		System.out.println(d2.getDayOfWeek());
		System.out.println(d3.getDayOfMonth());
		System.out.println(d2.isLeapYear());
		
		System.out.println("DOB IS: D3");
		
	
		System.out.println("Age is: "+(d1.getYear()-d3.getYear()));
		
		
	}

}
