package fundamentals.basic;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Good");
		System.out.print(" Morning!\n");
		System.out.println("Good");
		System.out.println("Morning");
		
		System.out.printf("Bet Numbers: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salary: %.1f %n", 1234.5678);
		System.out.printf("Name: %s%n", "João");
		
		Scanner enteredData = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = enteredData.nextLine();
		
		System.out.print("Type your last name: ");
		String lastName = enteredData.nextLine();
		
		System.out.print("Type your age: ");
		int age = enteredData.nextInt();
		
		System.out.printf("\n\n%s %s is %d years old. \n", name, lastName, age);
		
		enteredData.close();
	}

}
