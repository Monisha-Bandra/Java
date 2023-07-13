package saturday_marathon;

import java.util.Scanner;

public class JourneyCalculator {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		
		System.out.println(JourneyCalculator(speed, time));
	}
	
		
	 static double JourneyCalculator(double speed, double time) {
	
		return speed * time;
	
		
	 }
}
