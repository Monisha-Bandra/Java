package saturday_marathon;

public class PlanetExploree {

	public static void main(String[] args) {
		PlanetExploree explorer = new PlanetExploree();
		System.out.println(explorer.calculateSurfaceArea(3.0));
	}
	
	public double calculateSurfaceArea(double radius) {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }

}
