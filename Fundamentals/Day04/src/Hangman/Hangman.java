package Hangman;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		playHangman();
	}
	
	public static void playHangman() {
		String word = "HANGMAN";
		String wordSoFar = "", correctLetters = "";
		String letterGuess;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hangman:");
		for(int i = 0; i < word.length(); i++) {
			wordSoFar += "-";
		}
		
		System.out.println();
		System.out.println(wordSoFar);
		System.out.println();
		
		while(!wordSoFar.equals(word)) {
			System.out.println("Enter a letter: ");
			letterGuess = scanner.next();
			letterGuess = letterGuess.toUpperCase();
			if(letterGuess.length() == 1) {
				if(word.contains(letterGuess)) {
					correctLetters += letterGuess;
					wordSoFar = "";
					for(int i = 0; i < word.length(); i++) {
						if(correctLetters.indexOf(word.charAt(i)) != -1) {
							wordSoFar += word.charAt(i);
						} else {
							wordSoFar += "-";
						}
					}
				}
			} else {
				System.out.println("You guessed more than one letter!");
			}
			System.out.println(wordSoFar);
		}
		
		System.out.println("Congratulations you won!");
		scanner.close();
	}
}
