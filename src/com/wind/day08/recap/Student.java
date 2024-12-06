package com.wind.day08.recap;

public class Student {
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math =0;
	static double avg = 0;
	
	public static int total() {
		return kor+eng+math;
	}
	public static double avg() {
		return (kor+eng+math)/3.0;
	}
}
