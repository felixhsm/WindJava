package com.wind.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator2 {
	/*
	 * 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하는 
	 * 프로그램을 작성하여라
	 * 정수 하나 입력 : 44
	 * 1부터 100사이의 숫자인가? : true
	 * 
	 *  정수 하나 입력 : 101
	 *  1부터 100사이의 숫자인가? : false
	 *  
	 */
	public static void main(String [] args) {
		System.out.print("정수 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean result = (0 < num) && (num < 100);
		System.out.println("1부터 100사이의 숫자인가? " + result);
		
		
		
	}
}
