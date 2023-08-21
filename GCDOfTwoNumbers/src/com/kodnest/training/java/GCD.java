package com.kodnest.training.java;

public class GCD {

	public static int findGCD(int m, int n) {
		while(n != 0) {
			int rem = m % n;
			m = n; 
			n = rem;
		}
		
		return m;
	}

}
