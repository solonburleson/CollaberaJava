package regex;

import java.util.regex.Pattern;

public class MatchAlphaOnly {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Welcomed")); //true
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "welcomed")); //false, lower case w
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Welcome")); //false, 7 characters long
	}
}
