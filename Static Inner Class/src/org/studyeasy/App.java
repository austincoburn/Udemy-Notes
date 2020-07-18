package org.studyeasy;

import org.studyeasy.demo.Outer;

public class App {

	public static void main(String[] args) {
		
		
		//Non static way of accessing outer method
		Outer outy = new Outer();
		outy.testOuterMethod();
		
		//static way of accessing outer method
		/* Outer.testOuterMethod(); */
		
		//static way of accessing inner method or variable
		Outer.Inner.testingInnerMethod();
		System.out.println(Outer.Inner.x);
		
	}

}
