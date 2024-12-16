package com.wind.day14.collection.student;

import java.util.List;
import java.util.Scanner;

public interface ViewInterface {
	public Student inputStudent();
	
	public void displayStudents(List<Student> stdList);
	
	public int printMenu();
	
	public void displayMsg(String msg);
	
	public String inputName(String category);
	
	public Student modifyStudent(Student student);

	Student modifyStudent1(Student student);
}
