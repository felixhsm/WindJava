package com.wind.day14.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.println("2차 점수 : ");
		int secondScore = sc.nextInt();
		// 최종적으로는 Student 객체에 넣어야 함.
		// 1. 기본생성자 이용
		Student student = new Student();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		// 2. 매개변수 있는 생성자 이용
		student = new Student(name, firstScore, secondScore);
		// 그 후에는 ArrayList 객체에 넣어야 함.
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(student);
		Student std = stdList.get(0);
		System.out.println(std.toString());
		
	}
}
