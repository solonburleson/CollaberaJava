package innerclass;

abstract class Person{
	abstract void eat();
}

public class AnonymousInner {

	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Nice fruits.");
			}
		};
		
		p.eat();
	}
}
