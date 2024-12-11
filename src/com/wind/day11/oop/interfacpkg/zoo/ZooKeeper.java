package com.wind.day11.oop.interfacpkg.zoo;

public class ZooKeeper {
	public void feed(FoodInterface animal) {
		System.out.println("feet " + animal.favoriteFood());
	}
	
	
//	public void feed(Bear bear) {
//		System.out.println("feed honey");
//	}
//	public void feed(Camel camel) {
//		System.out.println("feed cactus");
//	}
//	public void feed(Deer deer) {
//		System.out.println("feed acorn");
//	}
//}
}
