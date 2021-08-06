import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cardsInDeck;
	private String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	
	public Deck () {
		this.cardsInDeck = new ArrayList<Card>();
		for (int i = 2; i <= 14; i++) {
			int value = i;
			for (int j = 0; j < 4; j++) {
				Card card = new Card(value, suits[j]);
				this.cardsInDeck.add(card);
			}
		}
	}

	public void Shuffle() {
		Collections.shuffle(this.cardsInDeck);
	}
	
	public Card drawTopCard() {
		return cardsInDeck.remove(0);
	}
	
	public void printDeck() {
		for (int i = 0; i >= 0 && i < 52; i++) {
			Card thisCard = cardsInDeck.get(i);
			thisCard.describeCard();
		}
	}
}

