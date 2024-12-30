package com.wind.day13.oop;

/*
 * View와 Manage 서로 메세지 전달을 통해서 상호작용을 해야하는데
 * 중간에 있어서 그 View와 Manage 연결하는 역할을 하는 클래스임.
 * View -> Controller -> Manage : 데이터 입력 후 저장
 * Manage -> Controller -> View : 데이터 로드 후 출력
 */

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		exit:
		while(true) {
			// 메뉴를 출력하기 위해서 mainMenu()를 호출하고
			//입력받은 숫자가 리턴될 것이기 때문에 int 변수로 받음
			int choice = view.mainMenu();
			// 해당 선택에 따라 다르게 동작하도록, 하기위함
			// switch ~ case문
			switch(choice) {
			case 1:
				// 1번 동작
				// 입력을 받을 때는 view부터
				// 넘겨받은inputStudent객체를 저장하기 위해서
				// manage에 있는 insertStudent()를 호출하고 전달해줌
				// sutdent를 전달해줌
				Student student = view.inputStudentData(); 
				manage.inserStudent(student);
				break;
			case 2: 
				// 2번 동작
				// 성적 출력을 하려면 그동안 저장했었던 데이터를 로드해야함
				// manage에 있는 getStudent()메소드를 호출하면
				// 모든 데이터가 넘어올 것임. 그 데이터의 타입은 Student[]
				// 이기 때문에 Student[] 변수로 받음.
				// 입력 받은 정보를 출력할 때는 manage부터
				Student [] students = manage.getStudents();
//				for(int i = 0; i < 3; i++) {
//					view.printStudentData(students[i]);
//				}
				// 넘어온 데이터를 모두 출력하기 위해서
				// 데이터를 전달해줌. view에 있는 printStudentData()
				// 메소드에 전달해줌.
				view.printStudentData(students[0]);
				view.printStudentData(students[1]);
//				view.printStudentData(students[2]);
				break;
			case 3: 
				view.displayMessage("프로그램이 종료되었습니다.");
				break exit;
			default : view.displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
  
}
