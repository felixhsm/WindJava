package com.wind.day11.oop.interfacpkg.zoo;

public class Zoo {
	public static void main(String[] args) {
	ZooKeeper zooKeeper = new ZooKeeper();
	
//	Bear bear = new Bear(); 부분을 생략하고 바로 만들었다.
	zooKeeper.feed(new Bear());
	zooKeeper.feed(new Camel());
	zooKeeper.feed(new Deer());
	}
}
