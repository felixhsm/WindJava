package com.wind.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator3 {
	/*
	 *문자 하나 입력 : a
	 *영어 대문자 확인 : false
	 *
	 *  문자 하나 입력 : K
	 *  영어 대문자 확인 : true
	 *  
	 */
	public static void main(String [] args) {
		System.out.print("문자 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		char alphabet = sc.next().charAt(0);
		boolean result = (64 < alphabet ) && (alphabet < 91);
		System.out.println("영어 대문자 확인 : " + result);		
	}
}
