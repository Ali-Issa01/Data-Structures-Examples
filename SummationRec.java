package com.AliIssa;

public class SummationRec {
	public static void main(String[] args) {
		
		// calling the recursive method sum()
		System.out.println(sum(4)); 
		// Expected output: 4 + 3 + 2 + 1 = 10
		
		
		// calling the iterative method sum_iter()
		System.out.println(sum_iter(4));
	}
	
	//Implementation of sum()
	public static int sum(int n) {
		// Time complexity : O(n)
		// Space complexity: O(n) due to recursion stacking
		
		
		
		
		// This the base case for this problem: 
		//we want to add the number from 1 to n, the simplest case is when n is 1
		if(n == 1) {
			return 1;
		}
		
		// Recursion Step: 
		// In this step the method is calling it self, but note that a simpler problem is passed into its parameter
		// In this case, we reducing n by 1 (making closer to the base case), the program will run until n = 1,
		// when n becomes 1, the program will stop running and the sum from 1 to n will be returned
		return n + sum(n-1);
		
	}
	private static long sum_iter(int n) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		long output = 0L;
		
		for(int i=1; i<=n; i++) {
			output+=i;
		}
		
		return output;
	}
}
