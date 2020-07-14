package fundamentals.challenges;

import java.util.Scanner;

public class ChallengeConvertion {
	public static void main(String[] args) {
		Scanner enteredData = new Scanner(System.in);
		
		System.out.print("Type salary 1: ");
		Double salary1 = Double.parseDouble(enteredData.nextLine().replace(",", "."));
		
		System.out.print("Type salary 2: ");
		Double salary2 = Double.parseDouble(enteredData.nextLine().replace(",", "."));
		
		System.out.print("Type salary 3: ");
		Double salary3 = Double.parseDouble(enteredData.nextLine().replace(",", "."));
		
		double average = (salary1 + salary2 + salary3) / 3;
		
		System.out.println("Average Salary: " + average);
				
		enteredData.close();
	}

}
