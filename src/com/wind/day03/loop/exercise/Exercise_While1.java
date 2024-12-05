package com.wind.day03.loop.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		/*
		 * 문제 1-1
		 * While문을 이용하여 1 ~ 10까지의 수를 더한 값을 출력하시오
		 * 문제1-2
		 * While문을 이용하여 1 ~ 100까지의 홀수의 합을 출력하시오.
		 * 
		 */
//		문제 1-1
//		int i = 1;
//		int sum = 0;
//		while(i<11) {
//			sum += i;
//			i++;
//		if(i != 100)
//		System.out.println(i + "+");
//	 	System.out.println(i + "= ");
//	}
			
//		문제 2-2
//		int i = 0;
//		int sum = 0;
//		while(i < 100) {
//			sum += i;
//		if( i % 2 != 0 ) {  
//			if(i != 99)
//				System.out.print(i + "+");
//		else 
//			System.out.print(i + "=");
//		}
//		i++;
//		}
//		System.out.println(sum);
		
		// #2
		int sum = 0;
		int i = 1;
		while( i <= 100) {
			i += 2; // i = i + 2; -> i +=2;
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
		}
		}

