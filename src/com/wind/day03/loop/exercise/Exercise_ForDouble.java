package com.wind.day03.loop.exercise;

public class Exercise_ForDouble {
	public static void main(String [] args) {
		/*
		 * 0시 0분부터 23시 59분까지 출력하는 프로그램을 작성하세요
		 * 0시 0분
		 * 0시 1분
		 * 0시 2분
		 * 0시 3분
		 * ...
		 * 0시 59분
		 * 1시 0분
		 * 1시 1분
		 * ...
		 * 1시 59분
		 * 2시 0분
		 * 2시 1분
		 * ...
		 * 22시 58분
		 * 22시 59분
		 * ...
		 * 23시 56분
		 */
		for(int i= 0; i <24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.println(i+"시 " +j+ "분" );
			}
			
		}
		
		
	}
}
