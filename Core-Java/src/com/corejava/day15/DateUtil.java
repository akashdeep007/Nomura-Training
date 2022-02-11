package com.corejava.day15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] agrs) {
		try {
			Date toDay = new Date();
			System.out.println("Date(): " + new Date());

			// toDay = new Date(System.currentTimeMillis());
			System.out.println("Date(long date): " + new Date(System.currentTimeMillis()));

			System.out.println("Date(year, month, date): " + new Date(2022, 1, 4));

			// default calendar in java starts from 1900

			// dd-MM-yyyy
			DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
			System.out.println("Today: " + df.format(new Date()));

			String inputDate = "21-03-2022";
			DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");

			Date d = df2.parse(inputDate);
			System.out.println("Input: " + inputDate + " & Output: " + df.format(d));

			System.out.println("Compare input Date with today: " + d.compareTo(toDay));
			
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(toDay);
			
			/*System.out.println(cal.getTime());
			
//			cal.set(Calendar.DATE, 22);
			cal.set(1987, Calendar.AUGUST, 22);
			
			System.out.println(cal.getTime());
			
			long diff = (new Date()).getTime() - cal.getTime().getTime();
			System.out.println("Diff in mil: "+diff);
			System.out.println("Diff in sec: "+diff/1000);*/
			
			cal.add(Calendar.MONTH, 7);
			
			
			System.out.println(cal.getTime());
			
			System.err.println("Month: "+cal.getTime().getMonth());
			

		} catch (ParseException ex) {
			System.out.println("Invalid date");
		}

	}

}
