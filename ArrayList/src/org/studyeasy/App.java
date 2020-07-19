package org.studyeasy;

import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Duck");
		listNames.add("Wowzer");
		listNames.add("Austin");
		listNames.add("Carla");
		listNames.add("Mandi");
		System.out.println(listNames); 
		
		
		App app = new App();
		/*
		 * app.removeNameByPosition(3); System.out.println(listNames);
		 * System.out.println("**********************"); app.removeNameByName("Chaand");
		 * System.out.println(listNames);
		 * 
		 * app.displayList(listNames); System.out.println(listNames.get(3));
		 */
		app.letsReplace("Jonnny", "Austin");
		System.out.println(listNames);
	}
	
	public void displayList(ArrayList<String> names) {
		for(String name : names) {
			System.out.println(name);
		}
	}

	
	private void removeNameByPosition(int position) {
		listNames.remove(position);
	}
	
	public void removeNameByName(String name) {
		listNames.remove(name.toLowerCase());
	}
	
	public void replacetheName(String theName, String replacedName) {
			int theIndex = listNames.indexOf(replacedName);
			
			if(listNames.contains(replacedName)) {
				replacedName = listNames.set(theIndex, theName);
				System.out.println(listNames);
			} else {
				System.out.println("the name you entered does not exist");
			}
		
	}
	
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	int search(String name) {
		return listNames.indexOf(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void letsReplace(String whatName, String existingName) {
		if(listNames.contains(existingName)) {
			int theIndex = listNames.indexOf(existingName);
			listNames.set(theIndex, whatName);
		} else {
			System.out.println("This name simply does not exist!");
		}
	}
	
	
	
	
	
	
	
	
}
