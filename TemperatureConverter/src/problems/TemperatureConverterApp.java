package problems;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	TemperatureConverter temperatureConverter = new TemperatureConverter();
	        double celsius = temperatureConverter.convertFahrenheitToCelsius(68.0);
	        System.out.printf("%.2f", celsius);
	}

}
