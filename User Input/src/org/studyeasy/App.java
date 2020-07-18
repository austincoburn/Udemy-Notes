package org.studyeasy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		System.out.println("your age is :  " + age);
	}
	
}
