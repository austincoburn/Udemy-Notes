package org.revature;

import org.revature.animals.Animal;
import org.revature.interfaces.Walk;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAge(23);
		animal.setLegs(2);
		animal.getTheAlive();
		System.out.println(animal.getWalk().canWalk());
		System.out.println(animal.toString());
		
		
		
		
		
		
	}

}
