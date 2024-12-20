package battery.oop;

import java.util.Random;
import java.util.Scanner;

public class BatteryView {
	private Scanner sc;
	
	public BatteryView() {
		this.sc = new Scanner(System.in);
	}
	
	public int mainMenu() {
		System.out.println(" ==== 보조배터리 대여 시스템 =====");
		System.out.println("1. 핸드폰 번호로 로그인");
		System.out.println("2. 현재 재고량 확인");
		System.out.println("3. 보조배터리 대여하기");
		System.out.println("4. 예약확인");
		System.out.println("5. 반납하기");
		System.out.println("6. 프로그램 종료");
		int choice = sc.nextInt();
		return choice;	
	}
	public Battery inputBatteryData() {
		System.out.println(" ====핸드폰 번호로 로그인====");
		Battery battery = new Battery();
		System.out.println("이름 : ");
		String name = sc.next();
		battery.setName(name);
		System.out.println("휴대폰 번호 : ");
		battery.setNumber(sc.nextInt());
		System.out.println((name) + "님 로그인 되었습니다.");
		return battery;
	}
	public void displayMessage(String msg) {
		System.out.println(msg);
	}
	public void printBatteryStock() {
		Random rand = new Random();
		int value = rand.nextInt(10) + 1;
		System.out.println("현재  재고량 : " + value);
	}
	public String selectPlace() {
		System.out.println("대여하실 장소를 선택해주세요. ex) 역이름,마트,공항");
		return sc.next();
	}
	public String inputRentalDate() {
		System.out.println("대여일자와 시간을 입력해주세요. ex) 2024-12-18  18:00");
		return sc.next();
	}
	public String inputReturnDate() {
		System.out.println("반납일자와 시간을 입력해주세요. ex) 2024-12-20 10:00");
		return sc.next();
	}
	public String inputNumber() {
		System.out.println(" 핸드폰번호를 입력해주세요 : ");
		return sc.next();
	}
	public void showReservation(String reservation) {
		if (reservation != null) {
			System.out.println("예약 정보 : " + reservation);
			System.out.println("예약이 확인되었습니다.");
		}else {
			System.out.println("예약자 정보를 찾을 수 없습니다.");
		}
	}
	
}
