package com.kodnest.training.patterns;

//import java.util.Scanner;

public class NumberTriangle {

	public static void main(String []args) {
		
		int prevNum = 1;
		
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(prevNum + " ");
				prevNum++;
			}
			System.out.println();
		}
	}
}

