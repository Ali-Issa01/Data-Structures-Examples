package com.wissamfawaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
		List<String> suitsAsLL = new LinkedList<>(Arrays.asList(suits));
		System.out.println("Original list: " + suitsAsLL);

		Collections.sort(suitsAsLL);
		System.out.println("Suits sorted in ascending order: " + 
				suitsAsLL);
		Collections.sort(suitsAsLL, Collections.reverseOrder());
		System.out.println("Suits sorted in descending order: " + 
				suitsAsLL);
		
		System.out.println("Min: " + Collections.min(suitsAsLL));
		System.out.println("Max: " + Collections.max(suitsAsLL));

		Collections.shuffle(suitsAsLL);
		System.out.println("Suits shuffled: " + suitsAsLL);
		
		String[] copyArray = new String[suits.length];
		LinkedList<String> copyList = new LinkedList<>(Arrays.asList(copyArray));
		Collections.copy(copyList, suitsAsLL);
		System.out.println("Disjoint? " 
				+ Collections.disjoint(suitsAsLL, copyList));
		
		suitsAsLL.addAll(copyList);
		System.out.println("The frequency of diamonds: " 
				+ Collections.frequency(suitsAsLL, "Diamonds"));
	}

}
