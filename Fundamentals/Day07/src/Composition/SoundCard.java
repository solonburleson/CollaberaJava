package Composition;

public class SoundCard {
	private String brand;
	
	public SoundCard(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "SoundCard{brand=" + brand + "}";
	}
}
