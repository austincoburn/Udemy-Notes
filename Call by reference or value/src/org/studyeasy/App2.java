package org.studyeasy;

public class App2 {

	
	//Call by reference
		//Passing in the reference as a parameter
	public static void main(String[] args) {
		String[] names = {"Chann", "John", "Pooja", "Jim", "Josh"};
		App2 app2 = new App2();

		app2.displayNames(names);
		System.out.println("*********************");
		System.out.println(names[0]);
		
		

	}
	
	void displayNames(String[] names) {
		names[0] = "Salim";
		
		for(String name : names) {
			System.out.println(name);
		}
		names[0] = "Salim";
	}

}

/*
 * Collections in Java?
 * 	= The JAVA COLLECTIONS framework is a COLLECTION of INTERFACES and CLASSES which 
 * make it easier for storing and processing collection of objects efficiently
 * 
 * 								Collection
 * 	Set 		List		Queue 		Deque
 *  Sorted Set
 *  **********************************************
 *  Map
 *    SortedMap
 *    
 *  Advantages:
 *  - No 3rd party API
 *  - Don't need to create API
 *  - Tested and optimized
 *  	
 * 
 * */
