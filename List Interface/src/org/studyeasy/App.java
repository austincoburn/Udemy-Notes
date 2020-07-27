package org.studyeasy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;




class People implements Comparable<People> {
	private String name;
	private int age;
	
	
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return  name + ": " + age;
	}


	@Override
	public int compareTo(People o) {
		if(this.name.length() == o.name.length()) {
			if(this.age > o.age) {
			return -1;
			}
			return 0;
		} else if(this.name.length() > o.name.length()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}


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

		List<String> demo = new LinkedList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		app.printList(demo);
		
		Stack<People> people = new Stack<>();
		people.add(new People("Austin", 24));
		people.add(new People("John", 4));
		people.add(new People("Carla", 23));
		people.add(new People("Brian", 51));
		
		
		
		System.out.println("Here is the top element: " + people.pop());
		app.printTheList(people);
		System.out.println("------------------");
		people.sort(null);
		app.printTheList(people);
		
		
		

	}
	
	public void printList(List<String> list) {
		for(String element : list) {
			System.out.println("Element : " + element);
		}
		System.out.println("******************************");
	}
	
	public void printTheList(List<People> element) {
		ListIterator<People> iterator = element.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}