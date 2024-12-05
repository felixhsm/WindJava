package com.wind.day02.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * 삼항연산자
		 * (조건식) ? 참일때 : 거짓일때
		 * String result = (num % 2) == 0 ? "짝수" : "홀수";
		 * System.out.println(result + "입니다.");
		 */
		
		
		//예제1. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		 System.out.print("정수 하나 입력 : ");
		 Scanner sc = new Scanner(System.in);
		 int input = sc.nextInt();
		 String result = ((input % 2) == 0) ? "짝수" : "홀수";
		 System.out.println(result + "입니다.");
		 
	}
}
/*	
 	0. 대입연산자
 	 - 맨마지막 수행되며 연산방향 다름
 	 - 복합대입연산자, +=, -=, +=, /=
 	1. 산술연산자
	- % 모듈러스 나머지를 구해줌
	2. 단항연산자
	- ++a(전위연산), a++(후위연산)
	3. 비교연산자
	- 동등비교 !=, ==의 결과의 반대
	4. 논리연산자
	- &&, ||, !
	5. 삼항연산자
	- 조건식 ? 참 : 거짓 
*/