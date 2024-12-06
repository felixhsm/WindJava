package com.wind.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 O, X
	 * 매개변수 O, X
	 * 
	 * 리턴형 X, 매개변수 X
	 * 리턴형 X, 매개변수 O
	 * 리턴형 O, 매개변수 X
	 * 리턴형 O, 매개변수 O
	 * 
	 */
	public void noReturnNoParam() {
		System.out.println("noReturnNoParam");
		return;
	}
	public void noReturnYesParam(int num) {
		// int num = 20250502;
		System.out.println("num : " + num);
		return;
	}
	
	// 리턴형은 void 대신에 타입을 넣는다
	// sysout이 필요하다
	public int yseReturnNoPram() {
		int date = 20241118;
		return date;
	}
	public int yesReturnYesPram(int num) {
		num += 10;
		return num;
	}
	
	public int sum(int ...numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum +=num;
		}
		return sum;
	}
	
}
