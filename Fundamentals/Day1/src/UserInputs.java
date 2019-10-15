import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String firstName = scanner.next();
		System.out.println("Hello " + firstName);
		
		System.out.print("Enter your Age: ");
		int age = scanner.nextInt();
		System.out.println(firstName +"'s age: " + age);
		scanner.close();
	}

}
