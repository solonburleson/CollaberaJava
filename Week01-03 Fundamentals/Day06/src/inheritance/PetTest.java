package inheritance;

public class PetTest {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog.speak());
		System.out.println(myDog.fetch());
		
		Cat myCat = new Cat();
		System.out.println(myCat.speak());
	}

}
