package com.wind.day12.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		// ======= 권장사항 =======
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		Calendar calender = new GregorianCalendar();
		System.out.println(calender.getTime());
		
		
		
		
		
		
		
		
		Date date = new Date();
		System.out.println(date);
		String transDate1 = sdf.format(date);
		System.out.println(transDate1);
		String transDate2 = sdf2.format(date);
		System.out.println(transDate2);
	}
}
