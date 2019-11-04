package regex;

import java.util.regex.Pattern;

public class MatchAlphaNumOnly {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Hello4")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Hello")); //false, 5 characters long
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Hello[")); // false, [ not in regex
		
		System.out.println(Pattern.matches("[a-zA-Z0-9._]*@[a-zA-Z0-9]*.[a-z]{3}", "solon.burleson@gmail.com")); //true, simple email regex
	}

}
