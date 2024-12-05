package com.wind.day06.array.sort;

import java.util.Scanner;

public class Exam_ArraySort2 {
	public static void main(String[] args) {
//		1. 구현
//		 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오 
//		 - 요구사항
//		     2) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함 (정수 5개 입력받는 배열 사용)
//		     3) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함
//		     4) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함
//		     5) 마지막에 첫번째 수와 마지막수를 합한 값을 출력할 수 있어야 함
		Scanner sc = new Scanner(System.in);
		int[]arrs = new int[5];
		int sum = 0;
		int i = 0;
		int min = 0;
		int max = 0;
		for(i =0; i < arrs.length; i++) {
			System.out.print(i+1 +"번째 정수 입력 : ");
			int nums = sc.nextInt();
			arrs[i] = nums;
		}
		for(int j = 4; j > 0; j--) {
			for(int k = 0; k < j; k++) {
				if(arrs[k] > arrs[k+1]) {
					int temp = arrs[k+1];
					arrs[k+1] = arrs[k];
					arrs[k] = temp;
					
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for(int val:arrs) {
			System.out.print(val + " ");
			min = arrs[0];
			max = arrs[arrs.length-1];
			sum = min + max;
		}
		System.out.println("");
		System.out.println("정렬 후 첫번째 수와 마지막수의 합 :" +  sum);
		
	}
}
