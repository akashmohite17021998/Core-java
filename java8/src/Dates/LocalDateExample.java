package Dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		/*
		 * //now() LocalDate localDate = LocalDate.now();
		 * 
		 * System.out.println("localDate : " + localDate);
		 * 
		 * //of(int year, int month, int day) LocalDate localDate1 = LocalDate.of(2022,
		 * 02, 17);
		 * 
		 * System.out.println("localDate1 : " + localDate1);
		 * 
		 * //ofYearDay() LocalDate loaclDate2 = LocalDate.ofYearDay(2022, 47);
		 * 
		 * System.out.println("loaclDate2 : " + loaclDate2);
		 * 
		 * System.out.println("====================================");
		 * 
		 *//**
			 * Get values from localDate from line number 10
			 */
		/*
		 * System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
		 * 
		 * System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		 * 
		 * System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		 * 
		 * System.out.println("getMonth : " + localDate.getMonth());
		 * 
		 * System.out.println("getMonthValue : " + localDate.getMonthValue());
		 * 
		 * System.out.println("getYear : " + localDate.getYear());
		 * 
		 * System.out.println("Day of month using get method : " +
		 * localDate.get(ChronoField.DAY_OF_MONTH));
		 * 
		 *//**
			 * Modifying local date
			 *//*
				 * 
				 * System.out.println("plusDays : " + localDate.plusDays(2));
				 * 
				 * System.out.println("plusMonths : " + localDate.plusMonths(3));
				 * 
				 * System.out.println("minusDays : " + localDate.minusDays(2));
				 * 
				 * System.out.println("withYear : " + localDate.withYear(2025));
				 * 
				 * System.out.println("with chronofield : " + localDate.with(ChronoField.YEAR,
				 * 2020));
				 * 
				 * System.out.println("with TemporalAdjusters : " +
				 * localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
				 */
		
		LocalDate localDate = LocalDate.now();
		System.out.println("now : " + localDate);
		
		LocalDate localDate1 = LocalDate.of(2022, 01, 14);
		System.out.println("of : " + localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2018, 48);
		System.out.println("ofYearDay : " + localDate2);
		
		System.out.println("==================================================\nGet values from localdate\n");
		
		/**
		 * Get values from localdate
		 */
		
		System.out.println("getYear : " + localDate.getYear());
		
		System.out.println("getMonth : " + localDate.getMonth());
		
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		
		System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		
		System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
		
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		
		//get(TemporalField t)
		System.out.println("==========");
		
		System.out.println("get(ChronoField.DAY_OF_MONTH) : " + localDate.get(ChronoField.DAY_OF_MONTH));
		
		System.out.println("get(ChronoField.DAY_OF_WEEK)) : " + localDate.get(ChronoField.DAY_OF_WEEK));
		
		System.out.println("get(ChronoField.DAY_OF_YEAR)) : " + localDate.get(ChronoField.DAY_OF_YEAR));
		
		System.out.println("========================================================\nModifying localdate\n");
		
		/**
		 * Modifying localdate
		 */
		
		System.out.println("plusDays : " + localDate.plusDays(2));
		
		System.out.println("plusWeeks : " + localDate.plusWeeks(2));
		
		System.out.println("plusMonths : " + localDate.plusMonths(2));
		
		System.out.println("plusYears : " + localDate.plusYears(2));
		
		System.out.println("====");
		
		System.out.println("minusDays : " + localDate.minusDays(2));
		
		System.out.println("minusWeeks : " + localDate.minusWeeks(2));
		
		System.out.println("minusMonths : " + localDate.minusMonths(2));
		
		System.out.println("minusYears : " + localDate.minusYears(2));
		
		System.out.println("====");
		
		System.out.println("with(ChronoField.YEAR : " + localDate.with(ChronoField.YEAR, 2024));
		
		System.out.println("with(ChronoField.MONTH_OF_YEAR : " + localDate.with(ChronoField.MONTH_OF_YEAR, 2));
		
		System.out.println("with(ChronoField.DAY_OF_MONTH : " + localDate.with(ChronoField.DAY_OF_MONTH, 30));
		
		System.out.println("with(TemporalAdjusters.firstDayOfNextMonth()) : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.println(localDate.minus(1, ChronoUnit.YEARS));
		
		System.out.println("=========================================================================\nAdditional support methods\n");
		
		/**
		 * Additional support methods
		 */
		
		System.out.println("2022 is Leap year : " + localDate.isLeapYear());
		
		System.out.println("2020 is Leap year : " + LocalDate.ofYearDay(2020, 10).isLeapYear());
		
		//localDate -> 13-01-2022
		//localDate1 -> 14-01-2022
		System.out.println("isEqual : " + localDate.isEqual(localDate1));
		
		System.out.println("isBefore : " + localDate.isBefore(localDate1));
		
		System.out.println("isAfter : " + localDate.isAfter(localDate1));
		
		/**
		 * Unsupported
		 */
		//System.out.println(localDate.minus(1, ChronoUnit.MINUTES));
		
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
		
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));
	}
}
