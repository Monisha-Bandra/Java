package saturday_marathon;

public class FinanceCalculator {

	public static void main(String[] args) {
	
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.println(calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
	}
	public double calculateSimpleInterest(double principal, double rate, double time) {
        double interest = principal * rate * time;
        return interest;
    }
}
