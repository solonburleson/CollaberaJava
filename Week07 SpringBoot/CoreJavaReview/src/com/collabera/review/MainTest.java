package com.collabera.review;

public class MainTest {

	public static void main(String[] args) {
//		String hello = "hello";
//		System.out.println(vowelExtract(hello));
//
//		printSWords("print all the words which are starting with s in this sentence");
//		
//		printEvens1to100();
//		
//		evenStrCounter("Write a program that prints the integers from 1 to 100. But for multiples of three print \\“Fizz\\” instead of the number, and for the multiples of five print \\“Buzz\\“. For numbers which are multiples of both three and five print \\“FizzBuzz\\“.”");
//
//		fizzBuzz();
		
//		System.out.println(blackjack(9,2,10));
//		System.out.println(blackjack(9,2,11));
//		System.out.println(blackjack(9,5,10));
//		
//		System.out.println(wordRevStringPres("Given a sentence, reverse the letter order of each word in the sentence, while preserving the original order of the words themselves in the sentence.  Print the output to screen."));
	
		System.out.println(fun(new int[] {1, 3, 5}));
		System.out.println(fun(new int[] {4, 5, 6, 7, 8, 9}));
		System.out.println(fun(new int[] {2, 1, 6, 9, 11}));
		System.out.println(fun(new int[] {3, 1, 6, 7, 11}));
	}
	
	public static int fun(int[] arr) {
		boolean check6 = false;
		boolean check9 = false;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 6) {
				check6 = true;
			} else if(arr[i] == 9 && check6 == true) {
				check9 = true;
			}
			
			if(check6 == false) {
				sum += arr[i];
			}
			
			if(check6 == true && check9 == true) {
				check6 = false;
				check9 = false;
			}
			
			
		}
		
		return sum;
	}
	
	public static String blackjack(int c1, int c2, int c3) {
		int sum = c1 + c2 + c3;
		
		if(sum > 21 && c1 != 11 && c2 != 11 && c3 != 11) {
			return "BUST";
		} else if(sum > 21 && c1 == 11 || c2 == 11 || c3 == 11) {
			return sum - 10 + "";
		} else {
			return sum + "";
		}
	}
	
	public static String wordRevStringPres(String msg) {
		String[] split = msg.split(" ");
		StringBuilder newSen = new StringBuilder();
		
		for(int i = 0; i < split.length; i++) {
			StringBuilder sb = new StringBuilder(split[i]);
			sb = sb.reverse();
			if(i < split.length - 1) {
				newSen.append(sb + " ");
			} else {
				newSen.append(sb);
			}
		}
		
		return newSen.toString();
		
	}
	
	public static String vowelExtract(String str) {
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {	
				newStr += c;
			}
		}
		
		return newStr;
	}
	
	public static void printSWords(String msg) {
		String word = "";
		
		for(int i = 0; i < msg.length(); i++) {
			if(msg.charAt(i) == ' ') {
				if(word.charAt(0) == 's') {
					System.out.println(word);
				}
				word = "";
			} else {
				word += msg.charAt(i);
			}
		}
		
		if(word.charAt(0) == 's') {
			System.out.println(word);
		}
	}
	
	public static void printEvens1to100() {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void evenStrCounter(String msg) {
		String word = "";
		int count = 0;
		
		for(int i = 0; i < msg.length(); i++) {
			if(msg.charAt(i) == ' ') {
				if(word.length() % 2 == 0) {
					count++;
				}
				word = "";
			} else {
				word += msg.charAt(i);
			}
		}
		
		if(word.length() % 2 == 0) {
			count++;
		}
		
		System.out.println(count);
	}
	
	public static void fizzBuzz() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
