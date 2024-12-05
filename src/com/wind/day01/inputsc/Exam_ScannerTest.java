package com.wind.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) throws IOException {
		System.out.print("반지름 입력 : ");
//		int input = System.in.read();
//		System.out.println("출력 " + (input-48));
		Scanner sc= new Scanner(System.in);
		//int input = sc.nextInt();
		double input = sc.nextDouble();
//		System.out.println("입력 받은 값 " + input);
		final double PI = 3.14;
		
		double circleArea = input * input * PI;
		System.out.println("원의 면적 : " +circleArea);
	}
}
