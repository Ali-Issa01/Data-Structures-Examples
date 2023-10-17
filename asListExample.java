package com.AliIssa;

import java.util.LinkedList;
import java.util.Arrays;

public class asListExample {
    // Creates a LinkedList, adds elements, and converts to an array
    public static void main(String[] args) {
        String[] colors = { "black", "blue", "yellow" };
        LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
        
        links.addLast("red"); // Add as the last item
        links.add("pink"); // Add to the end
        links.add(3, "green"); // Add at the 3rd index
        links.addFirst("cyan"); // Add as the first item
        
        // Get LinkedList elements as an array
        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    } // end main
} // end class UsingToArray
