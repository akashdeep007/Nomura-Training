package com.corejava.day15;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtil {

	public static void main(String[] args){
		// LocalDate
		// LocalTime
		// LocalDateTime
		// Period
		// Year
		// ZoneId
		// ZoneDateTime
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
		System.out.println("DayOfMonth: "+ld.getDayOfMonth()+" DayOfWeek: "+ld.getDayOfWeek());
		
		LocalDate date2 = LocalDate.parse("21-03-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("DayOfMonth: "+date2.getDayOfMonth()+" DayOfWeek: "+date2.getDayOfWeek());
		
		System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.atDate(LocalDate.parse("21-03-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
		System.out.println(lt);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.plusYears(8));
		System.out.println(dateTime.minusYears(8));
		
		System.out.println(dateTime.getYear());
		
		Period p = Period.between(LocalDate.parse("1987-01-22"), LocalDate.now());
		
		System.out.println("Age: "+p.getYears()+" Days: "+p.getDays()+" Month: "+p.getMonths());
		
		Year y = Year.now();
		System.out.println(y.isLeap());
		
		System.out.println(y.minusYears(2).isLeap());
		
	}
	
}
