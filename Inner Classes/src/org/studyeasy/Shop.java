
package org.studyeasy;
import org.studyeasy.shop.Door;
import org.studyeasy.shop.Door.Lock;
import org.studyeasy.shop.Person;


public class Shop {

	public static void main(String[] args) {
		
		Person person = new Person();
		Person.Student study = person.new Student();
		
		
		System.out.println(study);
		study.setAge(23);
		System.out.println(study.getAge());
		
		
		
		Door door = new Door();
		Lock theLock = door.getLock();
		System.out.println(theLock);
		System.out.println(theLock.getHandle());
		theLock.theHandle();
		theLock.setHandle("Purple");
		theLock.theHandle();
		
		Door.Lock locky = door.new Lock(true, "blue");
		System.out.println(locky);
		
		
	

	
		
		
		
		
		
		/*
		 * System.out.println("My age is: " + student.getAge() + " and my class is: " +
		 * student.getClasss()); student.setAge(39); student.setClass("Gym class");
		 * System.out.println("My age is: " + student.getAge() + " and my class is: " +
		 * student.getClasss());
		 */
	}

}