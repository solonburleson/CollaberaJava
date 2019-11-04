package blocks;

import java.util.Map;
import java.util.Set;

public class Blocks {
	int age;
	
	{
		age = 7;
		System.out.println("Hello in  Non Static Block() age: " + age);
	}
	
	{
		System.out.println("Hello in Non Static Block(1)");
	}
	
	public Blocks() {
		System.out.println("Constructor Blocks() called");
	}
	
	static {
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
	
	static {
		Map<String,String> systemproperties = System.getenv();
		Set<String> keys = systemproperties.keySet();
		for(String key : keys) {
			System.out.println(key + " => " + systemproperties.get(key));
		}
	}
	
	public static void main(String[] args) {
		Blocks blocks = new Blocks();
	}
}
