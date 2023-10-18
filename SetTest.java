package com.AliIssa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		String[] colors = { "Red", "Red", "Green", "Green", "Yellow", "Yellow","Black", "White"};
		Set<String> colorsAsHS = new HashSet<>(Arrays.asList(colors));
		System.out.println("Colors without duplicates:" + colorsAsHS);
		// duplicates will be removed but there will be no order
		
		Set<String> colorsAsTS = new TreeSet<>(colorsAsHS);
		//we can pass a Set to a Treeset or Hashset constructor
		
		System.out.println("Colors without duplicates and ordered:" + colorsAsTS);
		// duplicates will be removed and there will be an order
	
		System.out.println("Colors before orange:"+ ((TreeSet<String>) colorsAsTS).headSet("Orange"));
		//.headSet and .tailSet are only for a TreeSet
		//gets all the elements before the parameter excluding the parameter
		
		System.out.println("Colors after orange:"+ (((TreeSet<String>) colorsAsTS).headSet("Orange")));
		//gets all the elements after the parameter including the parameter
		
		System.out.println("First Color: " + ((TreeSet<String>) colorsAsTS).first());
		//gets the first element of the TreeSet
		System.out.println("Last Colors: "+ ((TreeSet<String>) colorsAsTS).last());
		//gets the last element of the TreeSet
		
		System.out.println("The element just before \"Red\": "+ ((TreeSet<String>) colorsAsTS).lower("Red"));
		System.out.println("The element just after \"Red\": "+ ((TreeSet<String>) colorsAsTS).higher("Red"));
		System.out.println(colorsAsHS.contains("Red"));
		System.out.println(colorsAsHS.contains("Violet"));
		// the method .contains() can be used on any collection, it returns true if the value is in the collection and false otherwise.

	}

}
