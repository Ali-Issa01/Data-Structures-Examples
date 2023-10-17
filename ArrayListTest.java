package com.AliIssa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        // Add elements in the "colors" array to the list
        String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
        List<String> list = new ArrayList<String>();

        for (String color : colors) {
            list.add(color); // Adds color to the end of the list
        }

        // Add elements in the "removeColors" array to "removeList"
        String[] removeColors = { "RED", "WHITE", "BLUE" };
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors) {
            removeList.add(color);
        }

        // Output list contents
        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        // Remove from the list the colors contained in "removeList"
        removeColors(list, removeList);

        // Output list contents
        System.out.println("\n\nArrayList after calling removeColors: ");

        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    // Remove colors specified in "collection2" from "collection1"
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        // Get iterator
        Iterator<String> iterator = collection1.iterator();

        // Loop while the collection has items
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove(); // Remove the current color
            }
        }
    }
}
