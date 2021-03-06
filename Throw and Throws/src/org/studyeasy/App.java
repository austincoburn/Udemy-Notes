package org.studyeasy;

import java.io.FileNotFoundException;


public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Catch block of main method");
		} catch (Exception e) {
			System.out.println("Catch block of Exception in main");
		}
	}

	public static void someMethod() throws Exception {
		System.out.println("Message from someMethod()");
		throw new RuntimeException();
	}
	
}


//Method throws an exception and it needs to be handled
//Throw keyword is used to declare an exception
/* The throw keyword when used "throw new FileNotFoundException() must use the constructor and 
 * the code after it will not run */
