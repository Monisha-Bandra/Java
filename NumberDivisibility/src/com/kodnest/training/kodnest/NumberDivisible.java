package com.kodnest.training.kodnest;

public class NumberDivisible {

	public static void  NumberByTwo(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void NumberByThree(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void NumberByFive(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 5 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void NumberByTwoAndFive(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0 && n % 5 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void NumberByThreeAndFive(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void PrimeNumbers(int n) {
		for(int i = 0; i <= n; i++) {
			if(n % i != 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void EvenNumDivByThree(int n) {
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
	public static void OddNumDivByFive(int n) {
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0 && i % 5 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
}
