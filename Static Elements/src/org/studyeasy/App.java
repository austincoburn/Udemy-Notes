package org.studyeasy;

import org.studyeasy.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
		System.out.println("Current variable value : " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);
		System.out.println("Obj1 current variable value : " +TestStatic.getStaticVariable());
		
		System.out.println("Obj2 current variable value : " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(24);
		System.out.println("Obj2 current variable value : " + TestStatic.getStaticVariable());

		System.out.println("Obj3 current variable value : " + TestStatic.getStaticVariable());

		
		TestStatic.setStaticVariable(34343);
		System.out.println(TestStatic.getStaticVariable());
	}

}
