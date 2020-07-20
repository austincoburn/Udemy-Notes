package org.studyeasy;

import java.util.LinkedList;
import java.util.List;

public class CompareToMethod {
	
	//If part1 and part2 are same RESULT = 0
	//Part 1 > Part 2 = 1
	//Part 1 < Part 2 = -1

	public static void main(String[] args) {
		int result;
		List<String> countries = new LinkedList<>();
		countries.add("a");
		result = countries.get(0).compareTo("a");
		System.out.println(result);
		
		
		String x = "f";
		String y = "a";
		
		System.out.println(x.compareTo(y));
		
		Integer one = 1;
		Integer two = 2;
		
		System.out.println(one.compareTo(two));

	}

}
