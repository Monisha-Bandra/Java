package com.kodnest.training.alphabeticalpatterns;

public class Pattern1 {

	public static void main(String[] args) {
		
		/*    for(int i = 1; i <= 5; i++) {
			
			for(char ch = 'A'; ch < 'A' + i; ch++) {
				
				System.out.print(ch + " ");
			}
			System.out.println();    */
		
		for(int i = 1; i <= 5; i++) {
			char ch = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
