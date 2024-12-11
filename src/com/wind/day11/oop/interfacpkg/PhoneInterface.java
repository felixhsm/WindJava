package com.wind.day11.oop.interfacpkg;

public interface PhoneInterface {
	/*
	 * 인터페이스는 
	 * 상수형 필드만 가능
	 * 추상메소로만 구성됨(Java 7)
	 */
	
	public static final int TIME_OUT = 10000;
//	public String name;
	
	// abstract가 붙으면 추상메소드
	public abstract void printLogo();
	
	// 추상메소드
	void sendCall();
	
	public default void showLogo() {
		/*
		 * 디폴트 메소드
		 * 하위 호환성을 위해서 작성하며
		 * 인터페이스의 보완이 가능함.
		 */
	}
}
