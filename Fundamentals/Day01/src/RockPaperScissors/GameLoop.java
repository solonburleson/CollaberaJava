package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class GameLoop {
	public Player p1;
	public Player cpu;
	private boolean cont;
	
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	public GameLoop(Player p1, Player cpu) {
		this.p1 = p1;
		this.cpu = cpu;
		cont = true;
	}
	
	public void intro() {
		System.out.println("Let's play a game!");
        System.out.println("Rock Paper Scissors");
        System.out.println("(1) Rock");
        System.out.println("(2) Paper");
        System.out.println("(3) Scissors");
        System.out.println("Enter your choice [1-3]:");
        do {
        	int choice = scanner.nextInt();
        	p1.shoot(choice);
        	if(p1.getSelection() == "") {
        		System.out.println("You're pulling my leg! Enter a value from 1 to 3:");
        	}
        }while(p1.getSelection() == "");
	}
	
	public void cpuShoot() {
		int cpuChoice = rand.nextInt(3) + 1;
        cpu.shoot(cpuChoice);
	}
	
	public void playerSelections() {
		System.out.println("So, you chose " + p1.getSelection());    
        System.out.println("And I chose " + cpu.getSelection());
	}
	
	public void compare() {
		if(p1.getSelection() == cpu.getSelection()) {
			p1.draw++;
			cpu.draw++;
			System.out.println("Well, well, well, looks like a DRAW!");
		}
		if(p1.getSelection() == "Rock") {
			if(cpu.getSelection() == "Paper") {
				p1.loss++;
				cpu.wins++;
				System.out.println("Too bad! You lose!");
			}
			if(cpu.getSelection() == "Scissors"){
				p1.wins++;
				cpu.loss++;
				System.out.println("Oof! You beat me!");
			}
		}
		else if(p1.getSelection() == "Paper") {
			if(cpu.getSelection() == "Scissors") {
				p1.loss++;
				cpu.wins++;
				System.out.println("Too bad! You lose!");
			}
			if(cpu.getSelection() == "Rock"){
				p1.wins++;
				cpu.loss++;
				System.out.println("Oof! You beat me!");
			}
		}
		else if(p1.getSelection() == "Scissors") {
			if(cpu.getSelection() == "Rock") {
				p1.loss++;
				cpu.wins++;
				System.out.println("Too bad! You lose!");
			}
			if(cpu.getSelection() == "Paper"){
				p1.wins++;
				cpu.loss++;
				System.out.println("Oof! You beat me!");
			}
		}
	}
	
	public boolean getCont() {
		return cont;
	}
	
	public void playAgain() {
		System.out.println("Continue? (Y/N)");
        String resume = scanner.next();
        if(resume.equals("N")) {
        	cont = false;
        }
	}
	
	public void clearSelections() {
		p1.setSelection("");
		cpu.setSelection("");		
	}
	
	public void end() {
		System.out.println("Record: " + p1.wins + "-" + p1.loss + "-" + p1.draw);
		scanner.close();
	}
}
