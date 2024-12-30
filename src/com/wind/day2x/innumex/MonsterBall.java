package com.wind.day2x.innumex;

public class MonsterBall {
	static int size = 100;
	static int price = 5000;
	
	//메소드 안에 존재하는 로컬 클래스
	void showPokemonster() {
		//static final int exp = 4000;
		
		class PoketMonster {
			static String name = "꼬부기";
			static int level = 100;
			
			public void getPoketLevel() {
				System.out.println(level);
				//System.out.println(exp);
			}
		}
	}
	// static이 아닌 경우 외부와 연결되어 있는 외부 참조를 갖게됨
	// 메모리가 더 사용되고 느려지므로 static 권장
	static class PocketMonster {
		String name = "이상해씨";
		int level = 100;
		static final int cost = 1000; // 인스턴스 클래스 내부에서는 static final 상수만 선언가능(jdk15 이전)
		static int cost2 = 1000; // 인스턴스 클래스 내부에서는 static 선언가능(jdk16부터 도입)
		
		public void getPocketMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
//			System.out.println(size);
//			System.out.println(price);
		}
	}
	public static void main(String[]args) {
		MonsterBall ball = new MonsterBall();
		// new MonsterBall.PocketMonster();
		MonsterBall.PocketMonster pokemon = new PocketMonster();
		pokemon.getPocketMember();
	}
}
