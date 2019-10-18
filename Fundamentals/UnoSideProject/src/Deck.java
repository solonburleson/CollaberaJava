import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private String[] values = {"0","1","2","3","4","5","6","7","8","9","Draw Two","Skip","Reverse","Wild","Wild Draw Four"};
	private String[] colors = {"red","green","blue","yellow"};
	
	public Deck() {
		newDeck();
	}
	
	private void newDeck() {
		for(int i = 0; i < values.length; i++) {
			switch(values[i]) {
			case "0":
				for(int j = 0; j < colors.length; j++) {
					Card card = new Card(values[i],colors[j]);
					deckOfCards.add(card);
				}
				break;
			case "Wild":
			case "Wild Draw Four":
				for(int k = 0; k < 4; k++) {
					Card card = new Card(values[i], "Wild");
					deckOfCards.add(card);
				}
				break;
			default:
				for(int j = 0; j < colors.length; j++) {
					for(int k = 0; k < 2; k++) {
						Card card = new Card(values[i],colors[j]);
						deckOfCards.add(card);
					}
				}
				break;
			}
		}
	}
	
	public void printDeck() {
		for(int i = 0; i < deckOfCards.size(); i++) {
			deckOfCards.get(i).showCard();
		}
	}
}
