package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

	private int age;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeInputException {
		if(age <= 0)
			throw new AgeInputException("Age should be greater than 0.");
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) throws AgeInputException {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the Student's name: ");
		String name = scanner.nextLine();
		student.setName(name);
		
		System.out.println("Enter Student's age: ");
		int age;
		try {
			age = scanner.nextInt();
			student.setAge(age);
		} catch(InputMismatchException e) {
			System.out.println("Invalid entry. Entry contained letters."+ e.getMessage());
		} catch(AgeInputException e) {
			System.out.println(e.getMessage());
			System.out.println("Age cannot be Zero! Please try again.");
			System.out.println("Enter the Student's age:");
			age = scanner.nextInt();
			student.setAge(age);
		} catch(Exception e) {
			System.out.println("Invalid Entry.");
			System.out.println("Enter the Student's age:");
			age = scanner.nextInt();
			student.setAge(age);
		}
		
		System.out.println(student);
		scanner.close();
	}

}
