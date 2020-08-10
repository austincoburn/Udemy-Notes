package org.studyeasy;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		
		
		/*
		 * try { queue.remove(); } catch (NoSuchElementException e) {
		 * System.out.println("Queue is empty"); }
		 * 
		 * 
		 * try { queue.element(); } catch (NoSuchElementException e) {
		 * System.out.println("Queue doesn't have a head for the queue."); }
		 */
		
			System.out.println(queue.poll());
			System.out.println(queue.peek());
		
		
			queue.offer(1);
			queue.offer(2);
			queue.offer(3);
			queue.offer(4);
			queue.offer(5);
			queue.offer(6);
			queue.offer(7);
	
		for(Integer element : queue) {
			System.out.println(element);
		}
		
		/*
		 * queue.remove(); System.out.println("First element in the queue is " +
		 * queue.element());
		 */		
		//System.out.println(queue.poll());
		
		System.out.println("***************************");
		System.out.println(queue.peek());
		
		for(Integer element : queue) {
			System.out.println(element);
		}
		
	}

}
