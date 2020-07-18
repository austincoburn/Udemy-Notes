package org.studyeasy.person;

public abstract class Person implements IsAlive, LiveLife {
	public void speak() {
		System.out.println("Shares his or her thoughts");
	}
	
	
	
	@Override
	public void breathe() {
		System.out.println("be alive; remain alive");
	}
	
	@Override
	public void message() {
		System.out.println("Life is a journey, keep moving and meet new people");
	}
	
	public abstract void eat();
}
