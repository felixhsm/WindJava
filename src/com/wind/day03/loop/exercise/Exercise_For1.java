package com.wind.day03.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String [] args) {
		/*
		 * 2단을 출력해보세요.
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...
		 */
		
		/*
		 * 문제1
		 * 정수 하나를 입력받아서 그 수가 1~9사이의 수이럐ㄸ만
		 * 그 수의 구구단을 출력하세요.
		 * 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다"를 출력하세요
		 */
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(0 < num &&  num < 10) {
			for(int i = 1; i < 10; i++)
				System.out.println(num + " * " + i +" = " + (num * i) );
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		} return;
	}
}
