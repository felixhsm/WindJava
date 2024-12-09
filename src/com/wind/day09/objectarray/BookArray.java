package com.wind.day09.objectarray;

import java.util.Scanner;

class Book {
	String name = "";
	String author = "";
	String price = "";
	String publisher = "";
	
	// 원래는 필요했으나 사람들이 안써서 위에처럼 해도 가능하지만 기본정석이다
//	public Book() {
//		name = "";
//		author = "";
//		price = "";
//		publisher = "";  
//	}
	
	void printInfomation() {
		System.out.println(name + "의 작가는 " +author +"입니다. 출판사는"
				+ publisher + "이고, 가격은 " + price + "입니다.");
	}
}
public class BookArray {
	public static void main(String[] args) {
//		Book book = new Book();
//		book.name = "자바의 신";
//		book.author = "김자바";
//		book.price = "25000";
//		book.publisher = "길벗이지톡";
//		book.printInfomation();
		Scanner sc = new Scanner(System.in);
		Book []books = new Book[5];
		for(int i = 0; i < books.length; i++) { 
		books[i] = new Book();
		books[i].name = sc.next();
		books[i].author = "김자바";
		books[i].price = "25000";
		books[i].publisher = "길벗이지톡";
		books[i].printInfomation();
		}
		
//		books[1] = new Book();
//		books[1].name = "자바의 신";
//		books[1].author = "김자바";
//		books[1].price = "25000";
//		books[1].publisher = "길벗이지톡";
//		books[1].printInfomation();
//		
//		books[2] = new Book();
//		books[2].name = "자바의 신";
//		books[2].author = "김자바";
//		books[2].price = "25000";
//		books[2].publisher = "길벗이지톡";
//		books[2].printInfomation();
//		
//		books[3] = new Book();
//		books[3].name = "자바의 신";
//		books[3].author = "김자바";
//		books[3].price = "25000";
//		books[3].publisher = "길벗이지톡";
//		books[3].printInfomation();
//		
//		books[4] = new Book();
//		books[4].name = "자바의 신";
//		books[4].author = "김자바";
//		books[4].price = "25000";
//		books[4].publisher = "길벗이지톡";
//		books[4].printInfomation();
		
		
	}
}
