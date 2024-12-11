package com.wind.day11.oop.objectpkg.animalfarm;

public class Yard {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal = new Dog();
		animal = new Hen();
		animal.speak();
	}
}
