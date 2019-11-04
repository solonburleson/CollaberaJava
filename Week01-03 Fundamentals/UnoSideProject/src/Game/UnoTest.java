package Game;

import DLL.DLL;

public class UnoTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("Joe");
		Player p2 = new Player("Sally");
		DLL turns = new DLL();
		
		
		deck.shuffle();
		p1.drawCard(deck);
		p1.drawCard(deck);
		p1.drawCard(deck);
		p1.drawCard(deck);
		p1.drawCard(deck);
		p1.drawCard(deck);
		p1.showHand();
	}

}
