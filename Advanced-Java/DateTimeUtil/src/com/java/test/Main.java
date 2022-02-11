package com.java.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args){
		Date date = new Date();
		System.out.println("date: "+date);
		
		System.out.println("time: "+date.getTime());
		
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeInMillis());
				
		
		cal.add(Calendar.MONTH, 6);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());
		
		cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());*/

		
		DateFormat formatter = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(formatter.format(date));
		
		formatter = new SimpleDateFormat("dd-MMM-YYYY");
		System.out.println(formatter.format(date));
		
		formatter = new SimpleDateFormat("dd-MMM-YY");
		System.out.println(formatter.format(date));
		
		formatter = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
		System.out.println(formatter.format(date));
		
		String dateObj = "22-10-2021";
		
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date inputDate = formatter.parse(dateObj);
			
			System.out.println("inputDate: "+inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LocalDate lDate = LocalDate.now();
		
		System.out.println(lDate);
		
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(lDate.format(dtFormatter));
		
		LocalTime lTime = LocalTime.now();
		System.out.println(lTime);
		
	}
	
}
