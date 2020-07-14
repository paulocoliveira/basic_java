package fundamentals.cast;

public class TypeCasting {

	public static void main(String[] args) {
		
		double a = 1.123456788888; //implicit
		System.out.println(a);
		
		float b = (float) 1.123456788888; //explicit (cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicit (cast)
		
		System.out.println(d);
		
		double e = 1.9999999; 
		int f = (int) e; //explicit (cast)
		
		System.out.println(f);

	}

}
