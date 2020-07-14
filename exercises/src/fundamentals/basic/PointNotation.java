package fundamentals.basic;

public class PointNotation {

	public static void main(String[] args) {

		String s = "Good Morning, X";
		s = s.replace("X", "Paulo");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Paulo".toUpperCase());
		
	}

}
