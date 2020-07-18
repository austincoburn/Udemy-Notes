package org.studyeasy;

public class App {

	public static void main(String[] args) {
		int x = 0;
		
		try {
			System.out.println("We don't know, what the outcome will be" + x/0);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Possible syntax error");
		} catch (Exception e) {
			System.out.println("I'm a female");
		}
		
		finally {
			System.out.println("This will be get printed");
			System.out.println();
		} 

	}

}
