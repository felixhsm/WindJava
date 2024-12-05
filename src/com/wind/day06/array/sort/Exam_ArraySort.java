package com.wind.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
		int[]arrs = {1, 3, 2};
		int temp = arrs[2];
		arrs[2] = arrs[1];
		arrs[1] = temp;
		for(int val:arrs)
		System.out.print(val + " ");
		
	}
}
