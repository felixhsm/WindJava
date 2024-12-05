package com.wind.day04.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//예외가 발생할 수 있기 때문에 예외처리를 강제함.
		
		//예외가 발생할 수 있으나 예외처리는 강제하지 않음.
		try {
			System.in.read();
		} catch (InputMismatchException e) {
			//e.printStackTrace();

		}
		
		try {
			int num = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자를 입력해주세요");
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
