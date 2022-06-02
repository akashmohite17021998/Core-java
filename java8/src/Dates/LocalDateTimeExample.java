package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("localDateTime : " + localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2012, 12, 22, 22, 22, 22, 25);
		
		System.out.println("localDateTime1 : " + localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		System.out.println("localDateTime2 : " + localDateTime2);
		
		/**
		 * Getting the time and date from LocalDateTime instance
		 */
		
		System.out.println("getYear : " + localDateTime.getYear());
		
		System.out.println("getMonthValue : " + localDateTime.getMonthValue());
		
		System.out.println("getMonth : " + localDateTime.getMonth());
		
		System.out.println("getDayOfYear : " + localDateTime.getDayOfYear());
		
		System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
		
		System.out.println("getDayOfWeek : " + localDateTime.getDayOfWeek());
		
		System.out.println("getHour : " + localDateTime.getHour());
		
		System.out.println("getMinute : " + localDateTime.getMinute());
		
		System.out.println("getSecond : " + localDateTime.getSecond());
		
		System.out.println("getNano : " + localDateTime.getNano());
		
		System.out.println("DAY_OF_YEAR : " + localDateTime.get(ChronoField.DAY_OF_YEAR));
		
		/**
		 * Modifying LocalDateTime
		 */
		
		 System.out.println("plusHours : " + localDateTime.plusHours(2));
		 
		 System.out.println("minusDays : " + localDateTime.minusDays(2));
		 
		 System.out.println("withMonth : " + localDateTime.withMonth(2).getMonth());
		 
		 /**
		  * Converting localdate and localtime to localdatetime and viceversa
		  */
		 
		 LocalDate localDate = LocalDate.of(2021, 10, 10);
		 System.out.println("atTime : " + localDate.atTime(22, 12));
		 
		 LocalTime localTime = LocalTime.of(23, 39);
		 System.out.println("atDate : " + localTime.atDate(localDate));
		 
		 LocalDateTime localDateTime3 = localTime.atDate(localDate);
		 System.out.println("toLocalDate : " + localDateTime3.toLocalDate());
		 
		 System.out.println("toLocalTime : " + localDateTime3.toLocalTime());
	}
}
