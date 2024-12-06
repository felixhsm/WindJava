package com.wind.day08.method;

public class Exam_Rum_Method {
	public static void main(String[]args) {
	Exam_Method em = new Exam_Method();
	// 리턴형 X, 매개변수 X
	em.noReturnNoParam();
	// 리턴형 X, 매개변수 O
	em.noReturnYesParam(20250502);
	// 리턴형 O, 매개변수 X
	System.out.println(em.yseReturnNoPram());
	//리턴형 O, 매개변수 O
	int result = em.yesReturnYesPram(1000);
	System.out.println(result);
	
	result = em.sum(1,2,3,4,5);
	System.out.println("result : " + result );
	}
}
