package fundamentals.classes;

public class Date {

	int day;
	int month;
	int year;
	
	Date() {
		// day = 1;
		// month = 1;
		// year = 1970;
		this(1, 1, 1970);
	}
	
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	String obtainFormatedDate() {
		final String format = "%d/%d/%d";
		return String.format(format, this.day, month, year);
	}
	
	void printFormatedDate() {
		System.out.println(this.obtainFormatedDate());
	}

}
