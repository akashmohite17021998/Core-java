package Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		
		LocalTime localTime1 = LocalTime.of(23, 33);
		System.out.println("of : " + localTime1);
		
		LocalTime localTime2 = LocalTime.of(23, 33, 33);
		System.out.println("of : " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(23, 33, 33, 980980980);
		System.out.println("of : " + localTime3);
		
		System.out.println("============================================================\n");
		
		/**
		 * Getting the values from local time instance
		 */
		
		System.out.println("getHour : " + localTime.getHour());
		
		System.out.println("getMinute : " + localTime.getMinute());
		
		System.out.println("getSecond : " + localTime.getSecond());
		
		System.out.println("getNano : " + localTime.getNano());
		
		System.out.println("ChronoField.CLOCK_HOUR_OF_DAY : " 
		+ localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());
		
		/**
		 * Modify the values of localTime
		 */
		
		System.out.println("minusHours : " + localTime.minusHours(2));
		
		System.out.println("minusMinutes : " + localTime.minusMinutes(2));
		
		System.out.println("minusSeconds : " + localTime.minusSeconds(2));
		
		System.out.println("minusNanos : " + localTime.minusNanos(200));
		
		System.out.println("ChronoUnit.HOURS : " + localTime.minus(2, ChronoUnit.HOURS));
		
		System.out.println("LocalTime.MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
		
		System.out.println("LocalTime.NOON : " + localTime.with(LocalTime.NOON));
		
		System.out.println("LocalTime.MAX : " + localTime.with(LocalTime.MAX));
		
		System.out.println("LocalTime.MIN : " + localTime.with(LocalTime.MIN));
		
		System.out.println("LocalTime.HOUR_OF_DAY : " 
		+ localTime.with(ChronoField.HOUR_OF_DAY, 22));
		
		System.out.println("plusHours : " + localTime.plusHours(15));
	}
}
