package com.kodnest.training.java;

import java.util.Scanner;

public class Fibonacci {

	public static void FibonacciSeries(int n){
	
	int fib1 = 0; 
	int fib2 = 1;
	
	for(int i = 1; i <= n; i++) {
		System.out.print(fib1 + " ");
		
		int nextNum = fib1 + fib2;
		fib1 = fib2;
		fib2 = nextNum;
	}
}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println("The Fibonacci Series upto " + num + " is");
		FibonacciSeries(num);
		
		scan.close();
	}

}
