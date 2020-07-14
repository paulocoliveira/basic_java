package fundamentals.basic;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14159;
		double radius = 3.4;
		double area = PI * radius * radius;
		System.out.println(area);
		
		radius = 10;
		area = PI * radius * radius;
		System.out.println("Area = " + area + "m2.");
	}
}
