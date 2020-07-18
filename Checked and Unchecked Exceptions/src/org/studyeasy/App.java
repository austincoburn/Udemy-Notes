package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		/*
		 * int x = 10, y;
		 * 
		 * y = x / 0;
		 * 
		 * System.out.println(y);
		 */
		
//arithmetic exception is an unchecked exception
		
		
		
		//Checked exception : Needs to be handled
		
		try {
			FileReader in = new FileReader("info.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
