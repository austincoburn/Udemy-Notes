package org.revature.animals;

import java.util.Scanner;

import org.revature.interfaces.Walk;

public class Animal {
	private int age;
	private String type;
	private int legs;

	Walk walk = new Walk() {

		@Override
		public boolean canWalk() {
			if (getLegs() > 0) {
				System.out.println("It can walk yay!!!");
				return true;
			} else {
				System.out.println("It cannot walk shoot");
				return false;

			}
		}

	};

	@Override
	public String toString() {
		return "Animal [age=" + age + ", type=" + type + ", legs=" + legs + "]";
	}

	public Walk getWalk() {
		return walk;
	}

	public Animal(int age, String type, int legs) {
		this.age = age;
		this.type = type;
		this.legs = legs;
	}

	public Animal() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean getTheAlive() {
		Alive alivey = new Alive();
		Scanner scanny = new Scanner(System.in);
		System.out.println("Would you like to have the animal breathing?");
		System.out.println("Please enter yes or no");
		String answer = scanny.next();
		switch (answer.toLowerCase()) {
		case "yes":
			alivey.setBreathe(true);
			break;
		case "no":
			alivey.setBreathe(false);
			break;
		default:
			System.out.println("What the heck man.. Invalid input, try again");
			getTheAlive();
			break;
		}
		return alivey.isAlive();

	}

	private class Alive {
		boolean breathe;

		public Alive() {
			breathe = false;
		}

		public boolean isBreathe() {
			return breathe;
		}

		public void setBreathe(boolean breathe) {
			this.breathe = breathe;
		}

		public boolean isAlive() {
			if (isBreathe() == false) {
				System.out.println("this animal is dead!");
				System.out.println("Also this animals age was : " + getAge());
				return isBreathe();
			} else {
				System.out.println("This animal is alive!");
				return isBreathe();
			}

		}

	}

}
