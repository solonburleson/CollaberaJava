package Game;
import java.util.ArrayList;

public class Player {
	public String name;
	private ArrayList<Card> hand;
	
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
	}
	
	public void drawCard(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void showHand() {
		for(int i = 0; i < hand.size(); i++) {
			hand.get(i).showCard();
		}
	}
}
