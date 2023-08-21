package com.kodnest.training.java;

import java.util.Scanner;

public class Main {

	public static void identifyPolygon(int sides) {
		
		if(sides <= 2) {
			System.out.println("Not a Polygon");
		}
		else if(sides == 3) {
			System.out.println("Triangle");
		}
		else if(sides ==4) {
			System.out.println("Quadrilateral");
		}
		else if(sides == 5) {
			System.out.println("Pentagon");
		}
		else {
			System.out.println("Hexagon");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Sides");
		int sides = scan.nextInt();
		identifyPolygon(sides);
		
		scan.close();

	}

}
