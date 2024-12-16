//package com.trump.day14.collection.studentB;
//
//import java.util.List;
//
//public class StudentController {
//	public static void main(String[] args) {
//		StudentView view = new StudentView();
//		StudentManage manage = new StudentManage();
//		end: 
//		while(true) {
//			int choice = view.printMenu();
//			switch(choice) {
//			case 1 : 
//				Student student = view.inputStudent();
//				manage.registerStudent(student);
//				break;
//			case 2 :
//				String name = view.inputName(null);
//				List<Student> searchList 
//					= manage.searchListByName(name);
//				view.displayStudents(searchList);
//				break;
//			case 3 : 
//				List<Student> sList = manage.selectAllStudents();
//				view.displayStudents(sList);
//				break;
//			case 0 : break end;
//			}
//		}
//	}
//}
