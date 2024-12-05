package com.wind.day02.Condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		/*
		 * 문제1
		 * 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		 * 60점 미만이면 불합격으로 출력한다.
		 * 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오.
		 */
		
		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.print("학년 : ");
		int age = sc.nextInt();
		if (score >= 60 && age !=4 ) {
			System.out.println("합격");
		}else if (score >= 70 && age ==4 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
