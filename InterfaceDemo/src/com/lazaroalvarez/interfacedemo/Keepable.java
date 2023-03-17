package com.lazaroalvarez.interfacedemo;

public interface Keepable {
//default means it use usable
	public default void play() {
		System.out.println("Playing around....");
		
	}
	
// 	abstract : has to be completed when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
	
}
