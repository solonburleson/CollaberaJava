
public class UnoTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("Joe");
		
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
