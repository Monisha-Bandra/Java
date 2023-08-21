package com.kodnest.training.patterns;

public class DaimondStarPattern {

	public static void main(String[] args) {

		int rows = 7; 
        int mid = rows / 2; 
        int stars = 1; 
        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < Math.abs(mid - i); j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < mid) {
                stars += 2;
            } else {
                stars -= 2;
            }
        }
    }
}

