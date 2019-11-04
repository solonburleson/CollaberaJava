package polymorphism;

public class PetTest {

	public static void main(String[] args) {
		Pet pet = new Pet();
		System.out.println(pet.speak());

		pet = new Cat();
		System.out.println(pet.speak());
		
		pet = new Dog();
		System.out.println(pet.speak());
	}

}
