import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        boolean cont = true;
        int cpu;
        int win = 0;
        int loss = 0;
        int draw = 0;
        while(cont == true) {
        	System.out.println("Let's play a game!");
            System.out.println("Rock Paper Scissors");
            System.out.println("(1) Rock");
            System.out.println("(2) Paper");
            System.out.println("(3) Scissors");
            System.out.println("Enter your choice [1-3]:");
            int p1 = 0;
            do {    
                p1 = input.nextInt();
                if(p1 != 1 && p1 != 2 && p1 != 3) {
                    System.out.println("You're pulling my leg! Enter a value from 1 to 3:");
                }
            }while(p1 != 1 && p1 != 2 && p1 != 3);
            String[] choice = {"Rock", "Paper", "Scissors"};
            cpu = rand.nextInt(3);
            System.out.println("So, you chose " + choice[p1-1]);    
            System.out.println("And I chose " + choice[cpu]);
            cpu += 1;
            if(p1 == cpu) {
                System.out.println("Well, well, well, looks like a DRAW!");
                draw++;
            }
            if(p1 == 1) {
                if(cpu == 2) {
                    System.out.println("Too bad! You lose!");
                    loss++;
                }
                if(cpu == 3) {
                    System.out.println("Oof! You beat me!");
                    win++;
                }
            }
            if(p1 == 2) {
                if(cpu == 1) {
                    System.out.println("Oof! You beat me!");
                    win++;
                }
                if(cpu == 3) {
                    System.out.println("Too bad! You lose!");
                    loss++;
                }
            }
            if(p1 == 3) {
                if(cpu == 1) {
                    System.out.println("Too bad! You lose!");
                    loss++;
                }
                if(cpu == 2) {
                    System.out.println("Oof! You beat me!");
                    win++;
                }
            }
            System.out.println("Continue? (Y/N)");
            String resume = input.next();
            System.out.println(resume);
            if(resume != "Y") {
            	cont = false;
            }
        }
        
        
        System.out.println("Record: "+ win +"-" + loss + "-" + draw);
        input.close();

	}

}
