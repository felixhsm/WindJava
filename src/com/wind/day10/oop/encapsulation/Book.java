package com.wind.day10.oop.encapsulation;

public class Book {
	// 제목과 저자의 필드 생성
	private String title;
	private String author;
	
	// 생성자 생성
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// getter/setter 생성
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}


	public static void main(String[] args) {
		// 생성자를 이용해서 객체를 만들었다.
		Book book = new Book();
		// 다른 방법
		book = new Book("춘향전", "작자미상");
		book.setTitle("어린왕자");
		book.setAuthor("생떽쥐페리");
		
		System.out.println("책제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getAuthor());
	}
}