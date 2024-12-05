package com.wind.day02.Condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String [] args) {
		/*
		 * 문제3
		 * 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요.
		 * 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		 * 점수를 입력해주세요 : 92
		 * 학점은 A입니다.
		 * 
		 * 점수를 입력해주세요 : 102
		 * 0 ~ 100 사이의 수를 입력해주세요
		 * 커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F )
		 */
		System.out.print("점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if((90 <= score) && (score <= 100)) {
			System.out.println("학점은 A입니다.");
		}else if ((80 <= score)&& (score<= 89)) {
			System.out.println("학점은 B입니다.");
		}else if ((70 <= score)&& (score<= 79)) {
			System.out.println("학점은 C입니다.");
		}else if ((60 <= score)&& (score<= 69)) {
			System.out.println("학점은 D입니다.");
		}else if ((0 < score) && (score >100)) {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
		}else {
			System.out.println("학점은 F입니다.");
		}
		
		//# #2
		char grade = 0;
		if(score < 0 || score >100) {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
			// 동작 안하게 하는 방법 #1
			// return;
		}else {
			if (score >= 90) {
				grade = 'A';
			}else if (score >= 80) {
				grade = 'B';
			}else if (score >= 70) {
				grade = 'C';
			}else if (score >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			System.out.println("학점은 " + grade + " 입니다.");
		}
	}
}
