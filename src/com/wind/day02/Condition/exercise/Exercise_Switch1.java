package com.wind.day02.Condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String[] args) {
		/*
		 * 문제2
		 * 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		 * 주문하시겠어요? 가격을 알려드립니다.
		 * (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		 * 메뉴를 입력해주세요 : 에스프레소
		 * 2500원입니다.
		 * 메뉴를 입력해주세요 : 자바칩프라프치노
		 * 없는 메뉴입니다.
		 */
		System.out.print("메뉴를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		int price = 0;
		switch(menu) {
		case "에스프레소" : 
			price = 2500;
			break;
		case "카푸치노" :
			price = 4000;
			break;
		case "카페라떼" : 
			price = 3500;
			break;
		case "아메리카노" : 
			price = 3000;
			break;
		default : System.out.println("없는 메뉴 입니다.");
		return;
		}
		System.out.println( price +"원입니다.");
	}
}
