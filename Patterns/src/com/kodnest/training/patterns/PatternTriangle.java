package com.kodnest.training.patterns;

public class PatternTriangle {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {

			for (int j = 2; j >= i; j--) {
				System.out.print("  ");
			}

			for (int j = 1; j < i * 2; j++) {
				
				if(i == 2 && j ==2 ) {
					System.out.print("* ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


