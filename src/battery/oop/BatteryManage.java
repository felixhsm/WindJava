package battery.oop;

import java.util.ArrayList;
import java.util.List;

public class BatteryManage {
	private List<Battery> bList = new ArrayList<Battery>();
	
	public void inserBattery(Battery battery) {
		batterys[index] = battery;
		index++;
	}
	

	private Battery[]batterys;
	private int index;
	
	public BatteryManage() {
		batterys = new Battery[6];
		index = 0;
	}
	
	public Battery []getBatterys(){
		return batterys;
	}
}
