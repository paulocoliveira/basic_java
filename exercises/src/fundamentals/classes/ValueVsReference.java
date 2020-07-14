package fundamentals.classes;

public class ValueVsReference {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // by value (primitive type)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Date d1 = new Date(1, 6, 2022);
		Date d2 = d1; // by reference (object)
		
		d1.day = 31;
		d2.month = 12;
		
		d1.year = 2025;
		
		System.out.println(d1.obtainFormatedDate());
		System.out.println(d2.obtainFormatedDate());
		
		returnDateToDefaultValue(d1);
		
		System.out.println(d1.obtainFormatedDate());
		System.out.println(d2.obtainFormatedDate());
		
		int c = 5;
		changePrimitive(c);
		System.out.println(c);
	}
	
	static void returnDateToDefaultValue(Date d) {
		d.day = 1;
		d.month = 1;
		d.year = 1970;
	}
	
	static void changePrimitive(int c) {
		c++;
	}
}
