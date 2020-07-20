package org.studyeasy;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		App app = new App();
		app.printList(countries);
		countries.add(1, "Canada"); //ADD a node in between
		countries.add("Bragil");

		countries.set(7, "Brazil"); //REPLACE a node
		app.printList(countries);
		countries.remove(); //first element is removed
		app.printList(countries);
		
		countries.remove(3);
		app.printList(countries);
		

	}
	
	public void printList(LinkedList<String> list) {
		for(String element : list) {
			System.out.println("Element : " + element);
		}
		System.out.println("******************************");
	}

}


//Linked List 
/*
Has nodes that contain data and LINK to the (address of) the next node.
	- Works like an ArrayList but its internal workings are different 
	- Memory efficient
	- ArrayList is SPEED efficient

















*/