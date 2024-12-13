package com.wind.day13.oop;

import java.util.Scanner;

// 저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student[]students;
	private int index;
	
	public StudentManage () {
		students = new Student[3];
		index = 0;
	}
//		String name = sc.next();
//		students[index].setName(name);
//		students[index].setKor(sc.nextInt());
//		students[index].setEng(sc.nextInt());
//		students[index].setMath(sc.nextInt());
	public void inserStudent(Student student) {
		students[index] = student;
		index++;
		
		
//		for(int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//			students[i].name = sc.next();
//			students[i].kor = sc.nextInt();
//			students[i].eng = sc.nextInt();
//			students[i].math = sc.nextInt();
//			
//		}
	}
	public Student []getStudents(){
		return students;
	}
}
