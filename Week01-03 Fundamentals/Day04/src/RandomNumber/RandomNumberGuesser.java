package RandomNumber;

import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		numberGuesser();
	}
	
	public static void numberGuesser() {
		int num = (int)(Math.random() * 100) + 1;
		int tries = 0;
		int guess = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(guess != num) {
			System.out.println("Guess a number between 1 an 100:");
			guess = scanner.nextInt();
			tries++;
			if(guess < num) {
				System.out.println("Guess is lower.");
			}
			else if(guess > num) {
				System.out.println("Guess is higher");
			}
		}
		
		System.out.println("Number of guesses to get " + num + ": " + tries);
		scanner.close();
	}

}
