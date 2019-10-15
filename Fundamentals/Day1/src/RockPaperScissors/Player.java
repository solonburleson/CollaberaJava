package RockPaperScissors;

public class Player {
	private String selection;
	public int wins;
	public int loss;
	public int draw;
	
	public Player() {
		selection = "";
	}
	
	public String getSelection() {
		return selection;
	}
	
	public void setSelection(String str) {
		selection = str;
	}
	
	public void shoot(int choice) {
		if(choice == 1) {
			selection ="Rock";
		}
		if(choice == 2) {
			selection = "Paper";
		}
		if(choice == 3) {
			selection = "Scissors";
		}
	}
}
