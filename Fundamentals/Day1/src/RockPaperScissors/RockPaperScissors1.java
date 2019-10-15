package RockPaperScissors;

public class RockPaperScissors1 {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player cpu = new Player();
		GameLoop gameLoop = new GameLoop(p1, cpu);
		
		while(gameLoop.getCont()) {
			gameLoop.intro();
	        gameLoop.cpuShoot();
	        gameLoop.playerSelections();
	        gameLoop.compare();
	        gameLoop.playAgain();
	        gameLoop.clearSelections();
		}
		
		gameLoop.end();
	}

}
