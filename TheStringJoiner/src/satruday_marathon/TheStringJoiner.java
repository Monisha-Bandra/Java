package satruday_marathon;

public class TheStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello,";
		String s2 = "World!";
		System.out.println(joinStrings(s1,s2));

	}
	
	public static String joinStrings(String s1, String s2) {
		return s1 + s2;
	}
}
