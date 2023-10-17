package com.AliIssa;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        // Add colors elements to list1
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        List<String> list1 = new LinkedList<String>();

        for (String color : colors) {
            list1.add(color);
        }

        // Add colors2 elements to list2
        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
        List<String> list2 = new LinkedList<String>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2); // Concatenate lists
        list2 = null; // Release resources

        printList(list1); // Print list1 elements

        convertToUppercaseStrings(list1); // Convert to uppercase string
        printList(list1); // Print list1 elements

        System.out.print("\nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // Remove items 4-6 from the list
        printList(list1); // Print list1 elements
        printReversedList(list1); // Print list in reverse order
    }

    // Output List contents
    private static void printList(List<String> list) {
        System.out.println("\nlist: ");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    } // end main

    // Locate String objects and convert to uppercase
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    // Remove items from the list within the specified range
    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    // Print the list in reverse order
    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReversed list: ");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }
}

