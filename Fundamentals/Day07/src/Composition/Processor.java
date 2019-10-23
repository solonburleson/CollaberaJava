package Composition;

public class Processor {
	private String model;
	
	public Processor(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return "Processor{model=" + model + "}";
	}
}
