package com.wind.day12;

public class Student {
	//필드
	private int studentId;
	private String name;
	private String major;
	
	//메소드 영역
	public Student() {} // 생성자
	public Student(int studentId, String name, String major) {
		this.studentId = studentId;
		this.name = name;
		this.major = major;
	}
	// getter
	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	// setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
