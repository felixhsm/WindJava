package battery.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatteryManage {
	private Map<String, String> reservations = new HashMap<String, String>(); 
	
	private List<Battery> bList;
	
	public BatteryManage() {
		this.bList = new ArrayList<Battery>();
	}

	private Battery[]batterys;

	
	
	public Battery []getBatterys(){
		return batterys;
	}
	public List<Battery> searchOneByNumber(String number) {
		List<Battery> searchList = new ArrayList<Battery>();
		if(number != null) {
			for(Battery bt:bList) {
				if(number.equals(bt.getNumber())) {
					searchList.add(bt);
				}
			}return searchList;
		}return null;
	}
	public String findReservation(String number) {
		return reservations.get(number);
	}
	
	public boolean returnBattery(String number) {
		if(reservations.containsKey(number)) {
			reservations.remove(number);
			return true;
		}return false;
	}
}
