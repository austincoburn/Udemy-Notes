package org.studyeasy;

import java.util.Scanner;

public class Hello {

	
	//Methods can be called numerous times and can be used unlimited times
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		System.out.println("Please enter the beginning number");
		int steppy = scanny.nextInt();
		System.out.println("Please enter the number you would like to stop at");
		int stepFinal = scanny.nextInt();
		
		
		
		loop(steppy,stepFinal);
		System.out.println("*******************");
		loop(1,30);
	
	}
	
	public static void loop(int step, int finalValue) {
		while (step<=finalValue) {
			System.out.println(step);
			step++;
		}
	}
	


}
