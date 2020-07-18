package org.studyeasy;

public class App {

	public static void main(String[] args) {
		String[] stringArray = {"Chaand", "John", "Pooja", "Mia", "Salim", "Angel"};
		
		System.out.println(stringArray[0]);

		//Enhanced ForLoop
		for (Object name : stringArray) {
			System.out.println(name);
		}
	}

}
