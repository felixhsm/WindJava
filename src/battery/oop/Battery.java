package battery.oop;

public class Battery {
	private String name;
	private int number;
	private int date;
	private int time;
	private String place;
	
	public Battery () {}
	public Battery (String name, int number, int date, int time) {
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Battery [예약자 = " + name + ", 핸드폰 번호 = " + number + ", 예약일자 = " + date + ", 시간 = " + time + ", 장소 = " + place
				+ "]";
	}
	
}
