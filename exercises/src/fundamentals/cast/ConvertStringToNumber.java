package fundamentals.cast;

import javax.swing.JOptionPane;

public class ConvertStringToNumber {

	public static void main(String[] args) {

		String value1 = JOptionPane.showInputDialog("Type the first number: ");
		String value2 = JOptionPane.showInputDialog("Type the second number: ");
		
		System.out.println(value1 + value2);
		
		double number1 = Double.parseDouble(value1);
		double number2 = Double.parseDouble(value2);
		
		double sum = number1 + number2;
		
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum / 2);
	}

}
