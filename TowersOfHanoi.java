package com.AliIssa;

public class TowersOfHanoi {
	public static void main(String[] args) {
		moveTower(3,"A","C","B");
	}
	
	public static void moveTower(int numberofTowers, String starting_tower, String target_tower, String extra_tower) {
		if(numberofTowers == 1) { // base case: if we have 1 tower, just move it
			System.out.println(starting_tower + "->" +  target_tower);
		}
		else {
		// move all the towers except the base to the extra tower
		moveTower(numberofTowers -1 , starting_tower , extra_tower , target_tower);
		// move the base to the extra tower
		System.out.println(starting_tower + "->" +  target_tower);
		// now we move the remaining towers from the extra and we place them on the target tower above the base
		moveTower(numberofTowers -1 , extra_tower , target_tower , starting_tower);
		}
	}
}
