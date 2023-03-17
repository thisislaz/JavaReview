package com.lazaroalvarez.interfacedemo;

public class Cat extends Pet implements Keepable{
	
	public Cat() {
		super("random cat", "cat");
	}
	
	public Cat(String name) {
		super(name, "cat");
	}
	
	public void showAffection() {
		System.out.println("Biting you at midnight");
	}
	
	public void askForFood() {
		System.out.println("Meoooowwwwwwwwww");
	}
}
