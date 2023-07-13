package saturday_marathon;

public class HeightConverter {

	public static void main(String[] args) {
		
		HeightConverter converter = new HeightConverter();
		System.out.println(converter.convertInchesToFeet(72.0));
	}
	public double convertInchesToFeet(double inches) {
        double feet = inches / 12.0;
        return feet;
	}
}
