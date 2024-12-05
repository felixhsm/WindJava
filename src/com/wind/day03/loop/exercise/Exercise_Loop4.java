package com.wind.day03.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	public static void main(String[] args) {
		/*
		 * 문제4
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 첫번째 입력 : 2
		 * 두번째 입력 : 10
		 * 출력 : 2 3 4 5 6 7 8 9 10
		 */
		System.out.print("첫번째 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("출력 :");
		if(num == num2) {
			System.out.println("두 숫자 사이에 존재하는 정수가 없습니다.");
			return;
		}
		if(num < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			// 첫번째보다 두번째가 더 클 때
		}if(num < num2 ) {
		for(int i = num; i <= num2; i++) {
			System.out.print(i + " ");
		}
		// 첫번째가 두번째보다 더 클 때
		}if(num > num2) {for(int i = num2; i <= num; i++) {
			System.out.print(i + " ");
		}
		}
	}
}	
