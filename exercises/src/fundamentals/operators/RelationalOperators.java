package fundamentals.operators;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double grade = 7.3;
		boolean goodBehavior = true;
		boolean passed = grade >= 7;
		boolean hasDiscount = passed && goodBehavior;
		
		System.out.println("Has Discount? " + hasDiscount);
	}

}
