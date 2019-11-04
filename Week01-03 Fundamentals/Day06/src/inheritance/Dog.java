package inheritance;

public class Dog extends Pet{
	public Dog() {
		setName("Unknow Dog");
	}
	
	public String fetch() {
		return "Yes, master. Fetch I will.";
	}
}
