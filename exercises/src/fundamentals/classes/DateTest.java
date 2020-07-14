package fundamentals.classes;

public class DateTest {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		d1.year = 2021;
				
		var d2 = new Date(31, 12, 2020);
		
		String formatedDate1 = d1.obtainFormatedDate();
		
		System.out.println(formatedDate1);
		System.out.println(d2.obtainFormatedDate());
		
		d1.printFormatedDate();;
		d2.printFormatedDate();;
	}
}
