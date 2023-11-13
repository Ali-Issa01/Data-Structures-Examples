package com.AliIssa;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		Instant before = Instant.now(); // catch the instant before starting
		System.out.println(fib(n));
		Instant after = Instant.now();// catch the instant after starting
		Duration.between(before, after).toMillis(); // calculation the duration of execution
		
		
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
