package com.wind.day14.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	
	private List<Student> sList;
	
	public StudentManage() {
		sList = new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
		
	}

	@Override
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					// 찾은 데이터
					System.out.println("찾았다.!!");
				}
			}
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public int searchIndexByName(String name) {
		if(name != null) {
			for(int i = 0; i < sList.size(); i++) {
				if(name.equals(sList.get(i).getName()));
				return i;
			}
		}
		return -1;
	}

	@Override
	public List<Student> selecAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		sList.remove(index);
	}

	
	
}
