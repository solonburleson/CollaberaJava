package constructors;

public class Person {
	private String name;
	
	public Person() {
		setName("Unknown");
	}
	
	public Person(String n) {
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
