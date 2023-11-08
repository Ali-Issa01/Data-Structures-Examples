package com.AliIssa;

public class TowersOfHanoi {
	public static void main(String[] args) {
		moveTower(3,"A","C","B");
	}
	
	public static void moveTower(int numberofTowers, String starting_tower, String target_tower, String extra_tower) {
		if(numberofTowers == 1) {
			System.out.println(starting_tower + "->" +  target_tower);
		}
		else {
		moveTower(numberofTowers -1 , starting_tower , extra_tower , target_tower);
		System.out.println(starting_tower + "->" +  target_tower);
		moveTower(numberofTowers -1 , extra_tower , target_tower , starting_tower);
		}
	}
}
