package org.studyeasy;

import java.util.HashSet;
import java.util.Set;


/* For sets - it's not sequential
 * - Cant access by index
 * Duplicates do not exists in set
 * 
 * HASHSET - Doesn't guarantee any order
 * 	- Allows ONE null key
 *  - Fastest for common operation e.g. add, search and remove
 *  
 *LinkeHashSet - Keep elements in the order they are added
 *	- allows one null key
 *	- It's close second
 *
 *TreeSet - Sorts all object
 *	- Doesn't allow null keys
 *	- TreeSet is MUCH slower because it needs to perform sorting
 * 
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Chaand");
		set.add("Austin");
		set.add("Mia");
		set.add("Jim");
		set.add("Chaand");
		set.add("Jenna");
		
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println(set.contains("Mia"));

	}

}
