
public class Card {
	private String value;
	private String color;
	
	public Card(String val, String clr) {
		this.setValue(val);
		this.setColor(clr);
	}
	
	public String getValue(){
		return value;
	}
	
	private void setValue(String val){
		value = val;
	}
	
	public String getColor(){
		return color;
	}
	
	private void setColor(String clr){
		color = clr;
	}
	
	public void showCard() {
		System.out.println(value + " of " + color);
	}
}
