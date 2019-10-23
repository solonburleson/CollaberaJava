package regex;

import java.util.regex.Pattern;

public class Match10Digits {

	public static void main(String[] args) {
		System.out.println("by character classes and quantifiers....");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949")); //true
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490")); //false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); //false, starts with 6
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949")); //true
		
		System.out.println("by meta characters....");
		System.out.println(Pattern.matches("[789]{1}\\d[0-9]{9}", "8853038949")); //true
		System.out.println(Pattern.matches("[789]{1}\\d[0-9]{9}", "3853038949")); //false, starts with 3
	}

}
