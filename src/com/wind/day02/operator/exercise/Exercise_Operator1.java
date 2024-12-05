package com.wind.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator1 {
	/*
	 * 정수 하나를 입력받아서 짝수인지 홀수인지 판별하는
	 * 프로그램을 작성하여라.
	 * 정수 하나 입력 : 4
	 * true
	 * 
	 * 정수 하나 입력 : 3
	 * false
	 * 
	 */
	public static void main(String [] args) {
		System.out.print("정수 하나 입력 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean result;
		result = (num % 2 == 0);
		System.out.println(result);
	}
}
