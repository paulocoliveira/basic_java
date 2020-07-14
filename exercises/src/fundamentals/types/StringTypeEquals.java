package fundamentals.types;

import java.util.Scanner;

public class StringTypeEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");
		
		String s = new String ("2");
		
		System.out.println("2" == s);
		
		System.out.println("2".equals(s));
		
		Scanner enteredData = new Scanner(System.in);
		
		String s2 = enteredData.next();
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		enteredData.close();
		
	}

}
