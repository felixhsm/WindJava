package com.wind.day03.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {
	public static void main(String[] args) {
		/*
		 * 문제1
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
			if( num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}else {
				for(int i = 1; i <= num; i++) {
					System.out.println(i + "");
				}
			}
		}
	}
