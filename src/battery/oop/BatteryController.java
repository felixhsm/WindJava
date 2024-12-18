package battery.oop;

public class BatteryController {
	public static void main(String[] args) {
		BatteryView view = new BatteryView();
		BatteryManage manage = new BatteryManage();
		exit:
		while(true){
			int choice = view.mainMenu();
			switch (choice) {
			case 1 : 
				Battery battery = view.inputBatteryData();
				manage.inserBattery(battery);
				break;
			case 2 : 
				view.printBatteryStock();
				break;
			case 3 : 
				
				break;
			case 4 : 
				
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
