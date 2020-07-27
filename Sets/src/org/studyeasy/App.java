package org.studyeasy;

import java.util.HashSet;
import java.util.Set;


/* For sets - it's not sequential
 * - Cant access by index
 * Duplicates do not exists in set
 * 
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
