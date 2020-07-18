package org.studyeasy;

public class App {

	
	//Check Java 8 Documentation on String methods to see what you can do with a string
	public static void main(String[] args) {
		String x = "Study";
		String y = "Easy";
		String z = x.concat(y);
		
		z = z.replace("Easy", "hard");

		System.out.println(z);

		if (z.equals("StudyEasy")) {
			System.out.println("Text is Studyeasy");
		} else {
			System.out.println("Text is not studyeasy");
		}
	}

}
