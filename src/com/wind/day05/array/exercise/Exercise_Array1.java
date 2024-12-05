package com.wind.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String [] args) {
		/*
		 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		 * 입력받고 평균을 구하는 프로그램을 작성하라.
		 * 단, 배열의 크기는 5이다
		 * 
		 */
//		int []nums = new int[5];
//		System.out.println(nums.length);
//		for(int i = 0; i < nums.length; i++) 
//			System.out.println(nums[i]);
		
		// nums 배열에 24 11 18 5 2 순서대로 저장 후 
		// 평균을 구하는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		int []nums = new int[5];
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		total += nums[i];
		}
		double avg = total /(double)5;
		System.out.println("평균 : " + avg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             );
		
	}
}
