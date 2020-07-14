package fundamentals.challenges;

public class ChallengeArithmeticOperators {

	public static void main(String[] args) {
		int numerator1 = (int) Math.pow(6 * (3 + 2),2);
		int denominator1 = 3 * 2;
		int generalNumerator1 = numerator1 / denominator1; 
		int numerator2 = (1-5) * (2-7); 
		int denominator2 = 2;
		int generalNumerator2 = (int) Math.pow(numerator2 / denominator2, 2);
		int generalNumerator = (int) Math.pow(generalNumerator1 - generalNumerator2, 3);
		int generalDenominator = (int) Math.pow(10, 3);
		int result = generalNumerator / generalDenominator;
		
		System.out.println(result);

	}

}
