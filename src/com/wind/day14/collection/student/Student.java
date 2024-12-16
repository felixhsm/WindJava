package com.wind.day14.collection.student;

public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 생성자
	public Student(){}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// 메소드
	// getter / setter
	public String getName() {
		return name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public int getScondScore() {
		return secondScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	// Ctrl + Shift + s 자동완성
	// toString();
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
}
