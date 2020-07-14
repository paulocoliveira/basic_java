package fundamentals.challenges;

public class ChallengeVariables {
	public static void main(String[] args) {
		// (F - 32 * 5/9 = C
		final int ADJUST= 32;
		final double MULTIPLIER = 5.0/9.0;
		double fahrenheit = 86; 
		double celsius = (fahrenheit - ADJUST) * MULTIPLIER;
		System.out.println("The result is "+ celsius + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - ADJUST) * MULTIPLIER;
		System.out.println("The result is "+ celsius + "°C.");
		
	}
}
