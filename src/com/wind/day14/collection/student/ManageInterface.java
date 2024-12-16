package com.wind.day14.collection.student;

import java.util.List;

public interface ManageInterface {
	void registerStudent(Student student);
	
	List<Student> searchListByName(String name);
	
	Student searchOneByName(String name);
	
	List<Student> selecAllStudents();
	
	void modifyStudent(int index, Student student);
	
	void deleteStudent(int index);
	
}
