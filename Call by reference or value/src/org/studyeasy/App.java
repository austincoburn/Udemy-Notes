package org.studyeasy;

public class App {

	
	//Call by Value
	//***BASICALLY in this below scenario, the VALUE is passed into the method
	// not the reference. Therefore after the method runs, the value remains the same
	
	public static void main(String[] args) {
		int value = 10;
		System.out.println("Current value of variable in main method is " + value);
		App app = new App();
		app.displayValue(value);
		System.out.println("Current value of variable in main method is " + value);
		

	}
	
	
	void displayValue(int value) {
		System.out.println("Current value of variable in displayValue method is " + value);
		value = 20;
		System.out.println("Current value of variable in displayValue method is " + value);
	}
	
}
