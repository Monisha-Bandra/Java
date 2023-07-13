package saturday_marathon;

public class ConvertToHours {

	public static void main(String[] args) {
		
		System.out.println(convertToHours(90));
	}
	public static double convertToHours(int minutes) {
	    double hours = minutes / 60.0;
	    return hours;
	}

}
