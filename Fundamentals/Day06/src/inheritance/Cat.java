package inheritance;

public class Cat extends Pet {
	public Cat() {
		setName("Unknown Cat");
	}

	public String speak() {
		return "Don't give me orders.\nI speak only when I want to.";
	}
}
