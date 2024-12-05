package com.wind.day03.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {
	public static void main(String[] args) {
		/*
		 * 문제5
		 * 사용자로부터 입력 받은 숫자의 구구단을 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 숫자를 입력 : ");
		int dan = sc.nextInt();
		for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
	}
}	
