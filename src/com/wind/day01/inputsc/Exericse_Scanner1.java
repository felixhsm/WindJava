package com.wind.day01.inputsc;

import java.util.Scanner;

public class Exericse_Scanner1 {
	public static void main(String [] args) {
		/*
		 * 이름, 도시, 나이, 체중 독신 여부를 빈칸으로 분리하여 입력받으세요
		 * Kim, Seoul 20 65.1 true
		 * 이름은 Kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신 여부는 true입니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean single = sc.nextBoolean();
//		System.out.println("이름은 " + name + ", 도시는 " +city + ", 나이는 " + age +
//				", 체중은 " + weight + ", 결혼여부는 " + marry + "입니다.");
		System.out.printf("이름은 %s, 도시는 %s, 나이는 %d살, 체중은 %fkg, 독신 여부는 %b입니다.\n"
				, name, city, age, weight, single);
		
	}
}
