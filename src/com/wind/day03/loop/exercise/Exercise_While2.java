package com.wind.day03.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int i = sc.nextInt();
		int sum = 0;
		while(i != -1) {
			sum +=i;
			System.out.println("값 : ");
			i =sc.nextInt();
		}
		System.out.println("합" + sum);
		//2번째 방법
		while(true) {
			System.out.print("값 : ");
			int num = sc.nextInt();
			if(num == -1) {
				break;
			}
			sum += num;
		}
		System.out.println("합 : " + sum);
		
		//3번째 방법
		System.out.print("값 : ");
		int lastNum;
		while((lastNum = sc.nextInt())!= -1) {
			sum += lastNum;
		}
		System.out.println("합 : " + sum);
		
		
	/*
	 * while문을 이용하여 -1이 입력될때까지
	 * 정수를 입력받고 -1이 입력되면
	 * 입력한 수의 합을 출력하시오.
	 * 값 : 1
	 * 갑 : 2
	 * 값 : -1
	 * 합 : 3
	 */
		}
}
