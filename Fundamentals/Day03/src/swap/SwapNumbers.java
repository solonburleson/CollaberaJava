package swap;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
//		swapNumbers();
//		swapNumbersNoTemp();
		isPrime();
		
	}
	
	public static void swapNumbers() {
		int x,y,temp;
		System.out.println("Enter x and y:");
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
//		scanner.close();
	}
	
	public static void swapNumbersNoTemp() {
		int x,y;
		System.out.println("Enter x and y:");
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x += y;
		y = x - y;
		x -= y;
		System.out.println("After Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
//		scanner.close();
	}
	
	public static void isPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want to check");
		int number = scanner.nextInt();
		if(number == 0 || number == 1) {
			System.out.println(number + " is prime.");
		}
		else {
			boolean flag = true;
			for(int i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					System.out.println(number + " is not prime.");
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(number + " is prime.");
			}
		}
		scanner.close();
	}
	
	public static void isFactorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want to check");
		int number = scanner.nextInt();
		if(number == 0 || number == 1) {
			System.out.println(number + " is prime.");
		}
		else {
			boolean flag = true;
			for(int i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					System.out.println(number + " is not prime.");
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(number + " is prime.");
			}
		}
		scanner.close();
	}

}
