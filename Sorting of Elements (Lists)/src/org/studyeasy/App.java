package org.studyeasy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");

		App app = new App();
		app.printList(countries);
		System.out.println("*****************");
		countries.sort(null); //This sorts the collection by NATURAL ordering (a, b, c) (1,2,3)
		app.printList(countries);
		System.out.println("******************");
		Collections.reverse(countries); //this works because Collections is a superclass for List
		app.printList(countries);
		
		
	}

	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}
	

}