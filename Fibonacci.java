package com.AliIssa;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		System.out.println(fib(n));
		
		
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
		return fib(n-1) + fib(n-2);
		}
	}

}
