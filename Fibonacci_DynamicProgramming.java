package com.AliIssa;

import java.util.Scanner;

public class Fibonacci_DynamicProgramming {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		
		System.out.println(fib_dp(n,new long[n+1]));
		
	}
	
	public static int fib_dp(int n, long[] cache) {
		if(cache[n] != 0) {
			return (int) cache[n];
		}
		
		long answer;
		
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			answer = fib_dp(n-1, cache) + fib_dp(n-2,cache);
		}
		cache[n] = answer;

		return (int) answer;
		
	}
	

}
