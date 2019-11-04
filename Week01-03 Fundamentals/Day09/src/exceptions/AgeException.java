package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age;
		
		try {
			age = scanner.nextInt();
			System.out.println(age);
		} catch(InputMismatchException e) {
			System.out.println("This was the junk input: " + scanner.next());
			System.out.println("Input Mismatch Exception occured!");
			System.out.println("Enter and Integer for AGE: ");
			age = scanner.nextInt();
			System.out.println("Age entered is: " + age);
		} catch(Exception e) {
			System.out.println("Exception occured!");
		} finally {
			System.out.println("Input in finally block!");
		}
		
		System.out.println("Reached after Try-Finally!");
		scanner.close();
	}

}
