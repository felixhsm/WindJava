package com.wind.day13.oop;

public class Student {
	
	// 필드
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//메소드 - 생성자
	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 메소드
	// getter / setter
	
	//getter
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return this.total()/3.0;
	}
}