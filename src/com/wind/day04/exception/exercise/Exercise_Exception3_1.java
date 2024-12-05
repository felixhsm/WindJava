package com.wind.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			try {
				int num = sc.nextInt();
				sum += num;
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				i--;
			}
		}
		System.out.println(" 합은 : " + sum);
	}
}
