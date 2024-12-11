package com.wind.day10.oop.inheritance;

public class Point {
	protected int x, y;
	public int pub;
	public int pro;
	
	public Point() {}
	 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter
	public void SetX(int x) {
		this.x = x;
	}
	public void SetY(int y) {
		this.y = y;
	}
	
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void showPoint() {
		System.out.println(x + ", " + y);
	}
}
