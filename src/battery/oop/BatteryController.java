package battery.oop;

import java.util.List;

public class BatteryController {
	public static void main(String[] args) {
		BatteryView view = new BatteryView();
		BatteryManage manage = new BatteryManage();
		String name;
		String number = "";
		int index;
		List<Battery> bList;
		exit:
		while(true){
			int choice = view.mainMenu();
			String phone;
			switch (choice) {
			case 1 :  // 로그인
				Battery battery = view.inputBatteryData();
				
				break;
			case 2 : // 재고 확인
				view.printBatteryStock();
				break;
			case 3 : // 대여하기
				String place = view.selectPlace();
				String rentalDate = view.inputRentalDate();
				String returnDate = view.inputReturnDate();
				System.out.println("대여하기 완료");
				break;
			case 4 : // 예약 확인
				phone = view.inputNumber();
				bList = manage.searchOneByNumber(number);
				String reservation = manage.findReservation(phone);
				view.showReservation(reservation);
				break;
			case 5 : 
				
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				break exit;
			default : 
				view.displayMessage("1 ~ 6 사이의 수를 입력해주세요.");
				break;
			}
		}
	}
}
