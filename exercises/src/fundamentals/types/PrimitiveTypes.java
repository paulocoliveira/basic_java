package fundamentals.types;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// Employee data
		
		// integer numeric types
		byte companyYears = 23;
		short flightNumber= 542;
		int id = 56789;
		long totalPoints = 3_134_845_223L;
		
		// real numeric types
		float salary = 11_445.44F;
		double totalSales = 2_991_797_103.01;
		
		// boolean type
		boolean isOnVacation = false;
		
		// character type
		char status = 'A';
		
		// Days at company
		System.out.println(companyYears * 365);
		
		// Number of trips
		System.out.println(flightNumber / 2);
		
		// Points by dollars
		System.out.println(totalPoints / totalSales);
		
		System.out.println(id + ": earns -> " + salary);
		System.out.println("Vacation? " + isOnVacation );
		System.out.println("Status: " + status);

	}

}
