package regex;

public class Split {

	public static void main(String[] args) {
		String source = "There are thirty_three big-apple";
		String[] tokens = source.split("\\s+|-"); //whitespace or -
		for(String token : tokens) {
			System.out.println(token);
		}
		
		String date = "10-24-2019";
		String[] dateTokens = date.split("-");
		for(String token : dateTokens) {
			System.out.println(token);
		}
	}
}
