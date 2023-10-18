package com.AliIssa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConcordancesTest {
	
	private static Map<String, Integer> HashMap = new HashMap<>();
	
	
	public static void main(String [] args) {
		
		String line;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		line = scan.nextLine();
		
		createMap(line); //create a map using the line provided
		displayMap(); // display each word with its number of occurrence
		
		scan.close();	
	}
	
	private static void createMap(String line) {
		line.replace("\\p{p}", ""); // this will remove all the punctuation from the sentence
		String [] words = line.split("\\s+");// "\\s+" will use any number of spaces as a delimeter
		// .split is a method of String class that decompose a line of text into words 
		for(String word: words) {
			if(HashMap.containsKey(word)) { // verifies if a "key" exists in the linkedlist
				int counter = HashMap.get(word); // gets the "Value" associated with the "Key"
				HashMap.put(word, ++counter); //updates the value of the word counter by 1
				// note that counter++ won't work
			}
			else {
				HashMap.put(word,1);
			}
		}
	}
	
	private static void displayMap() {
		
		Set<String> wordsSet = HashMap.keySet();// we create a set containing the "keys" of the map
		// the reason we use a set because we don't want duplicate keys
		
		TreeSet<String> wordsSorted = new TreeSet<String>(new WordComparator());
		for(String word: wordsSet) {
			wordsSorted.add(word);
		}
		System.out.println("Using a TreeSet: ");
		for(String word: wordsSorted) {
			System.out.println(word +": "+ HashMap.get(word));
		}// here the words will printed in a certain order, we can provide our own comparison standards
		
		System.out.println("Using a Set:");
		for(String word: wordsSet) {
			System.out.println(word + ": "+ HashMap.get(word));
		}// words will be printed depending of the sentence order
		
	}
}
