package com.wind.day13.oop;

import java.util.Scanner;

import com.wind.day13.oop.Student;

// 메뉴, 메시지, 데이터 입력, 출력 하는 기능 클래스
public class StudentView {
	private Scanner sc;
	
	public StudentView() {
		this.sc = new Scanner(System.in);
	}

	public int mainMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice; 
	}
	public Student inputStudentData() {
		System.out.println("===== 성적 입력 ====");
		Student student = new Student();
		System.out.print("이름 : ");
		String name = sc.next();
		student.setName(name);
		System.out.print("국어 : ");
		student.setKor(sc.nextInt());
		System.out.print("영어 : ");
		student.setEng(sc.nextInt());
		System.out.print("수학 : ");
		student.setMath(sc.nextInt());
		return student;
	}
	public void displayMessage(String msg) {
		
	}
	public void printStudentData(Student student) {
		System.out.println("==== 성적 출력 ====");
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMath());
		System.out.println("총점 : " + student.total()); // 메소드 소괄호
		System.out.println("평균 : " + student.avg());
	}
	
}