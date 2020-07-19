package org.studyeasy;

import java.util.ArrayList;


class IntWrapper {
	public int intValue;

	public IntWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> studentNumbers = new ArrayList<>();
		 * studentNumbers.add(25); //AUTOBOXING because the primitive 25 is being converted to an object automatically
		 * System.out.println(studentNumbers);
		 
		ArrayList<IntWrapper> studentNumbers = new ArrayList<>();
		//MANUAL boxing Below 
		studentNumbers.add(new IntWrapper(23));
		System.out.println(studentNumbers.get(0).getIntValue()); // MANUAL Unboxing
		*/
		
		
		ArrayList<Double> demoList = new ArrayList<>();
		//demoList.add(24.5); 
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); // <- in the background for demoList.add(10.0) this is what takes place.. AUTOBOXING
		System.out.println(demoList.get(0));
		demoList.get(0);
		System.out.println(demoList.get(0).doubleValue()); // <- in the background for demoList.get(0) this is what takes place.. AUTOUNBOXING
		
		
	}

}
