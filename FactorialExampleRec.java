package com.AliIssa;

import java.math.BigInteger;

public class FactorialExampleRec {
	public static void main(String[] args) {
		//All three method will generate an output of : 24 (in the case of 4)
		System.out.println("Iterative solution: " + fact_iter(4));
		System.out.println("Recurive solution: " + fact_rec(4));
		
		//Using BigInteger for an accurate solution:
		System.out.println("Accurate solution: "+ fact_accurate(4));
		// We use BigInteger to avoid overflow and to be accurate 
	}
	
	
	
	public static int fact_iter(int n) {
		//Time complexity: O(n)
		//Space complexity: O(1)
		int fact = 1;
		while(n > 0) {
			fact = fact*n;
			n--;
		}
		return fact;
	}
	
	
	public static int fact_rec(int n) {
		//Time complexity: O(n)
		//Space complexity: O(1)
		
		
		//Base Step: n = 0
		if(n == 0) {
			return 1;
		}
		// Recursion Step: recalling the method while reducing n by 1;
		return n*fact_rec(n-1);
	}
	
	
	public static BigInteger fact_accurate(int n) {
		BigInteger output = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			output = output.multiply(BigInteger.valueOf(i));
			// multiply() method : Returns a BigInteger whose value is (this * value)
			// valueOf() : Returns a BigInteger whose value is equal to that of the specified value.
		}
		return output;
	}
	
	
	
}
