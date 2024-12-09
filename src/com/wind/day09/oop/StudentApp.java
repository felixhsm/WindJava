package com.wind.day09.oop;

import java.util.Scanner;




public class StudentApp {
	Scanner sc = new Scanner(System.in);
//	Student student = new Student();
	Student []students = new Student[3];
	public void startProgram() {
		System.out.println("프로그램 실행");
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				// 한번 시작하면 3명의 학생의 점수를
				// 모두 입력해야하는 방식
				for(int i = 0; i < students.length; i++)
					students[i] = inputStudentData();
				break;
			case 2 : 
				for(Student student : students)
					printStudentData(student);
				
//				for(int i = 0; i < students.length; i++)
//					printStudentData(students[i]);
				break;
			case 3 : 
				displayMessage("프로그램이 종료되었습니다.");
//				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default : 
				displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
//				System.out.println("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	private int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	private Student inputStudentData() {
		System.out.println("===== 성적 입력 ====");
		Student student = new Student();
		System.out.print("이름 : ");
		student.name = sc.next();
		System.out.print("국어 : ");
		student.kor= sc.nextInt();
		System.out.print("영어 : ");
		student.eng= sc.nextInt();
		System.out.print("수학 : ");
		student.math= sc.nextInt();
		return student;
	}
	private void printStudentData(Student student) {
		// Student student = student[0]
		// Student student = student[1]
		// Student student = student[2]
		System.out.println("==== 성적 출력 ====");
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " + student.total()); // 메소드 소괄호
		System.out.println("평균 : " + student.avg());
		
	}
	private void displayMessage(String message) {
		System.out.println(message);
		
	}
}
