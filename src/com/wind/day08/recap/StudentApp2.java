package com.wind.day08.recap;

import java.util.Scanner;

//class Student {
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math =0;
//	double avg = 0;
//	
//	public int total() {
//		return kor+eng+math;
//	}
//	public double avg() {
//		return (kor+eng+math)/3.0;
//	}
//}
// 구조적 프로그래밍
public class StudentApp2 {
	//필드 (멤버변수)
	static Scanner sc =new Scanner(System.in);
//	Student student = new Student();
//	static int choice = 0;
	
	public static void main(String[] args) {
		end:
		while(true) {
			// 메소드화 
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				 inputStudentData();
				break;
			case 2 : 
				// 출력
				 printStudentData();
				
				break;
			case 3 : 
				// 종료
				displayMessage();
				break end;
			default : 
				displayMessage();
				break;
			}
		}
	}
	// printMenu()
	static int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	// inputStudentData()
	static void inputStudentData() {
		System.out.println("===== 정보 입력 ====");
		System.out.print("이름 : ");
		Student.name = sc.next();
		System.out.print("국어 : ");
		Student.kor= sc.nextInt();
		System.out.print("영어 : ");
		Student.eng= sc.nextInt();
		System.out.print("수학 : ");
		Student.math= sc.nextInt();
		
	}
	// printStudentData()
	static void printStudentData() {
		System.out.println("==== 정보 출력 ====");
		System.out.println("이름 : " + Student.name);
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " + Student.total());
		System.out.println("평균 : " + Student.avg());
	}
	//displayMessage();
	static void displayMessage() {
		System.out.println("프로그램이 종료되었습니다.");
		
	}
}