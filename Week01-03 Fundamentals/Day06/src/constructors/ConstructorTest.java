package constructors;

import complexconstructors.Complex;

public class ConstructorTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Smith");
		
		System.out.println("person name: " + person1.getName());
		System.out.println("person name: " + person2.getName());
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7);
		Rectangle r3 = new Rectangle(4,3);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5);
		Fraction f3 = new Fraction(9,3);
		Fraction f4 = new Fraction(f3);
		
		System.out.println(f1.compute());
		System.out.println(f2.compute());
		System.out.println(f3.compute());
		System.out.println(f4.compute());
		
		Clock c1 = new Clock();
		Clock c2 = new Clock(14);
		Clock c3 = new Clock(14,19);
		Clock c4 = new Clock(14,19,37);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		Complex com1 = new Complex(10,15);
		Complex com2 = new Complex(com1);
		
		Complex com3 = com2;
		
		if(com1.equals(com2)) {
			System.out.println("com1 equals com2");
		} else {
			System.out.println("com1 does NOT equal com2");
		}
		
		if(com1 == com2) {
			System.out.println("com1 == com2");
		} else {
			System.out.println("com1 != com2");
		}
		
		System.out.println(com2.toString());
	}

}
