package inheritance;

public class Pet {
	private String name;
	
	public Pet() {
		setName("Unknown Pet");
	}
	
	public String speak() {
		return "I'm your cuddly little pet.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
