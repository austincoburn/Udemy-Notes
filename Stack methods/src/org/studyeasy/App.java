package org.studyeasy;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(2);
		demo.push(100);
		demo.push(3);
		demo.push(4);
		demo.push(5);

		//Get rid of top element on stack
		demo.pop();
	
		
		for(Integer temp : demo) {
			System.out.println(temp);
		}
		
		//Peek top element but only to look at it
		System.out.println(demo.peek());
		
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
		
		System.out.println(demo.search(100));

	}

}
