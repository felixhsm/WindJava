package com.wind.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[]args) {
		/*
		 * 선택정렬이란?
		 * 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		 * 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬,
		 * 데이터의 양이 많을 때 급격한 성능 저하를 보임.
		 * 
		 */
		int[]arrs= {2, 5, 4, 1, 3};
		//int min = 0;		
		for(int i = 0; i < arrs.length; i++) {
			int min = i;
			for(int j = i+1; j < arrs.length; j++) {
			if(arrs[min] > arrs[j]) {
				min = j;
		}
		}
		int temp = arrs[i];
		arrs[i] = arrs[min];
		arrs[min] = temp;
		}
		
		for(int num:arrs) {
			System.out.print(num + " ");
		
		
//		for(int i = 1; i < arrs.length; i++) {
//			if(arrs[min] > arrs[i]) {
//				min = i;
//		}
//		}
//		temp = arrs[1];  arrs[n] 의 값이 늘어나면서 정렬 이걸 반복문으로 만들어라 
//		arrs[1] = arrs[min];  
//		arrs[min] = temp;
		
	}
//		if(arrs[0] > arrs[2]) {
		// 인덱스값을 기억하는 코드
//			min=2;
//		}
//		if(arrs[0] > arrs[3]) {
//			min = 3;
//		}
//		if(arrs[0] > arrs[4]) {
//			min = 4;
//		}
	}
}
