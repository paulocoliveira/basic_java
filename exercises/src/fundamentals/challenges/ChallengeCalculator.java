package fundamentals.challenges;

import java.util.Scanner;

class ChallengeCalculator {

	public static void main(String[] args) {

		Scanner enteredData = new Scanner(System.in);
		
		System.out.println("Inform number 1: ");
		double num1 = enteredData.nextDouble();
		
		System.out.println("Inform number 2: ");
		double num2 = enteredData.nextDouble();
		
		System.out.println("Inform operation: ");
		String op = enteredData.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);
		enteredData.close();

	}
	
	/**
	 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	 * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	 */

}
