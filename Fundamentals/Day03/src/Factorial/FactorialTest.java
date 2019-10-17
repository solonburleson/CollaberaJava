package Factorial;

import java.util.Scanner;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
//		Factorial();
		System.out.println(factorialRecursive(5));
	}
	
	public static void Factorial() {
		System.out.println("What number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i; 
		}
		System.out.println(number + "! = "+ factorial);
		scanner.close();
	}
	
	public static int factorialRecursive(int number) {
		int factorial = 1;
		
		if(number > 1) {
			factorial = factorialRecursive(number-1);
		}
		
		factorial *= number;
		
		return factorial;
	}

}
