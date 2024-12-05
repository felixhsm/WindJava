package com.wind.day07.array.dimarray.exercise;

public class Exercise_DimArray {
	public void practice1() {
		int num = 0;
		int []nums = new int[10];
		int [][] dimNums = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5 ; i++) {
			for(int j = dimNums.length-1; j >=0; j--) {
				dimNums[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
		
	}
	
	

	public void practice2() {
			int num = 0;
			int []nums = new int[10];
			int [][] dimNums = new int [5][5];
			int k = 1;
			for(int i = 0; i < 5 ; i++) {
				for(int j = 4; j >=0; j--) {
					dimNums[j][i] = k;
					k++;
				}
			}
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.printf("%2d\t", dimNums[i][j]);
				}
				System.out.println();
			}
			
			
			
			
			// 5 10 15 20 25
			// 4 9 14 19 24
			// 3 8 13 18 23
			// 2 7 12 17 22
			// 1 6 11 16 21	
		
	}

	public void practice3() {

		int num = 0;
		int [] nums = new int[10];
		int [][] dimNums = new int [5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				dimNums[j][i] = k;
				k++; // 1 ~ 25까지 증가
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
		
	// 1 6 11 16 21
	// 2 7 12 17 22
	// 3 8 13 18 23
	// 4 9 14 19 24
	// 5 10 15 20 25
	}
	public void practice4() {
		
		int num = 0;
		int [] nums = new int[10];
		int [][] dimNums = new int [5][5];
		int k = 1;
		for(int i = 0; i < dimNums.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					dimNums[i][j] = k;
					k++;
				
			}
		}else {
			for(int j = 4; j  >= 0; j--) { //반복문에서 거꾸로일때 표현법
				dimNums[i][j] = k;
				k++;
			}
		}
	}	
				 // 1 ~ 25까지 증가
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
	// 1 2 3 4 5
	// 10 9 8 7 6
	// 11 12 13 14 15
	// 20 19 18 17 16
	// 21 22 23 24 25
}
	
}