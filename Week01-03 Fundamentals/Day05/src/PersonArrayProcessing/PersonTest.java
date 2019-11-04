package PersonArrayProcessing;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		String name,inpStr;
		int age;
		char gender;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < persons.length; i++) {
			System.out.print("Enter name: ");
			name = scanner.next();
			System.out.print("Enter age: ");
			age = scanner.nextInt();
			System.out.print("Enter gender: ");
			inpStr = scanner.next();
			gender = inpStr.charAt(0);
			
			persons[i] = new Person();
			
			persons[i].setName(name);
			persons[i].setAge(age);
			persons[i].setGender(gender);
		}
		
		scanner.close();
		
		youngestAndOldest(persons);
		printNamesForEach(persons);
	}
	
	public static void youngestAndOldest(Person[] persons) {
		int minidx = 0;
		int maxidx = 0;
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() < persons[minidx].getAge()) {
				minidx = i;
			} else if(persons[i].getAge() > persons[maxidx].getAge()) {
				maxidx = i;
			}
		}
		
		System.out.println(persons[minidx].getName() + " is the youngest at " + persons[minidx].getAge() + " years old.");
		System.out.println(persons[maxidx].getName() + " is the oldest at " + persons[maxidx].getAge() + " years old.");
	}
	
	public static void printNamesForEach(Person[] persons) {
		for(Person p : persons) {
			System.out.println(p.getName());
		}
	}

}
