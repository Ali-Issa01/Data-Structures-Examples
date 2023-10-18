package com.AliIssa;

import java.util.Comparator;

public class WordComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		if(s1.length()-s2.length() < 0) {
			return s1.length()-s2.length();
		}
		else {
			return s1.compareToIgnoreCase(s2);
			//the reason we did this, is because we want to check the length before checking the characters,
			// note that the compareTo method checks the characters before checking the length.
		}
		
	}

	

}
