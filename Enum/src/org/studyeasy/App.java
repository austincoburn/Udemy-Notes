package org.studyeasy;
//Enum is a collection of predefined constants

public class App {


	public static void main(String[] args) {
		
		Learning learn = Learning.GENERICS;
		
		switch(learn) {
		case COREJAVA:
			System.out.println("core Java");
			break;
		case COLLECTIONS:
			System.out.println("Collections");
			break;
		case GENERICS:
			System.out.println("generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("jsp and servlets");
			break;
		case MULTITHREADING:
			System.out.println("mulithreading");
			break;
		default:
			break;
		}
}
}