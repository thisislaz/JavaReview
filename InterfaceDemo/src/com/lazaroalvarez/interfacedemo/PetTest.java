package com.lazaroalvarez.interfacedemo;

public class PetTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Hacker");
		cat1.play();
		cat1.askForFood();
		cat1.showAffection();
		cat1.displayStatus();
		
		Dog dog1 = new Dog("Cheif");
		dog1.askForFood();
		dog1.showAffection();
		dog1.play();
		dog1.displayStatus();
		
	}
}
