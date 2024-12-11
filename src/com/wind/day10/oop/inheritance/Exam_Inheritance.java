package com.wind.day10.oop.inheritance;

public class Exam_Inheritance {
	public static void main(String[] args) {
			Point point = new Point();
			point.SetX(11);
			point.SetY(18);
			point.showPoint();
			
			
			ColorPoint colorPoint = new ColorPoint();
			colorPoint = new ColorPoint(12, 25, "red");
			colorPoint.showColorPoint();
			
//			colorPoint.SetX(5);
//			colorPoint.SetY(2);
//			colorPoint.showPoint();
		
	}
}
