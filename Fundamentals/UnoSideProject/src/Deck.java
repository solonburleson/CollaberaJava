import java.util.Random;

public class Deck {
	private Card[] deckOfCards;
	private int topOfDeck;
	private String[] values = {"0","1","2","3","4","5","6","7","8","9","Draw Two","Skip","Reverse","Wild","Wild Draw Four"};
	private String[] colors = {"red","green","blue","yellow"};
	
	public Deck() {
		deckOfCards = new Card[108];
		topOfDeck = deckOfCards.length - 1;
		newDeck();
	}
	
	private void newDeck() {
		int idx = 0;
		for(int i = 0; i < values.length; i++) {
			switch(values[i]) {
			case "0":
				for(int j = 0; j < colors.length; j++) {
					Card card = new Card(values[i],colors[j]);
					deckOfCards[idx] = card;
					idx++;
				}
				break;
			case "Wild":
			case "Wild Draw Four":
				for(int k = 0; k < 4; k++) {
					Card card = new Card(values[i], "Wild");
					deckOfCards[idx] = card;
					idx++;
				}
				break;
			default:
				for(int j = 0; j < colors.length; j++) {
					for(int k = 0; k < 2; k++) {
						Card card = new Card(values[i],colors[j]);
						deckOfCards[idx] = card;
						idx++;
					}
				}
				break;
			}
		}
	}
	
	public Card[] getDeck() {
		return deckOfCards;
	}
	
	public void shuffle() {
	Random rand = new Random();
		for(int i = 0; i < deckOfCards.length; i++) {
			int swap = rand.nextInt(deckOfCards.length);
			Card c1 = deckOfCards[i];
			Card c2 = deckOfCards[swap];
			deckOfCards[i] = c2;
			deckOfCards[swap] = c1;
		}
	}
	
	public void printDeck() {
		for(int i = 0; i < deckOfCards.length; i++) {
			if(deckOfCards[i] == null) {
				break;
			} else {
				deckOfCards[i].showCard();
			}
		}
	}
	
	public Card draw() {
		Card card = deckOfCards[topOfDeck];
		deckOfCards[topOfDeck] = null;
		topOfDeck--;
		return card;
	}
}
