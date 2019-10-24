package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		
		Person p = new Person("Solon",30,'M');
		people.add(p);
		p = new Person("Jim",52,'M');
		people.add(p);
		p = new Person("Sara",21,'F');
		people.add(p);
		
		System.out.println(people.toString());
		
		Person person = people.get(0);
		System.out.println(person.toString());
		
		for(Person p1 : people) {
			System.out.println(p1);
		}
	}

}
