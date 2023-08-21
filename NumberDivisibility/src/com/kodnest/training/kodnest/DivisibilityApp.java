package com.kodnest.training.kodnest;

import java.util.Scanner;

public class DivisibilityApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		NumberDivisible.NumberByTwo(n);
		NumberDivisible.NumberByThree(n);
		NumberDivisible.NumberByFive(n);
		NumberDivisible.NumberByTwoAndFive(n);
		NumberDivisible.NumberByThreeAndFive(n);
		NumberDivisible.PrimeNumbers(n);
		NumberDivisible.EvenNumDivByThree(n);
		NumberDivisible.OddNumDivByFive(n);
		
		scan.close();
		
		
	}

}
