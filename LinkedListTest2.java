package com.AliIssa;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest2 {

	public static void main(String[] args) {
		String[] ColorsArr = {"White","Black"};
		List<String> colorsList = new LinkedList<String>(Arrays.asList(ColorsArr));
		System.out.println("List 1:\n"+ colorsList);
		String[] Colors2Arr = {"Red","Blue","Green"};
		List<String> colors2List = new LinkedList<String>();
		for(String color : Colors2Arr) {
			colors2List.add(color);
		}
		System.out.println("List 2:\n"+ colors2List);
		
		//combining the 2 list
		colorsList.addAll(colors2List);
		System.out.println("After combining the 2 lists:\n"+ colorsList);
		printReversedList(colorsList);
		convertToUpperCase(colorsList);
		System.out.println("Colors in uppercase: " + colorsList);
		
		removeItems(colorsList, 2, 3);
		System.out.println("After removing the items: " + colorsList);
	}

	
	public static void printReversedList(List<String> List) {
		ListIterator<String> listiterator = List.listIterator(List.size());
		//Returns a list iterator over the elements in this list (in proper sequence), 
		//starting at the specified position in the list.
		while(listiterator.hasPrevious()) {
			System.out.print(listiterator.previous() + " ");
		}	
		System.out.println();
	}
	public static void convertToUpperCase(List<String> List) {
		ListIterator<String> listiterator = List.listIterator();
		while(listiterator.hasNext()) {
			listiterator.set(listiterator.next().toUpperCase());
			
		}
	}
	public static void removeItems(List<String> List,int a,int b) {
		
		List.subList(a, b).clear();
		
	}
		
}