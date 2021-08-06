import java.util.ArrayList;

public class Player {
	
	private String name;
	private int score = 0;
	private ArrayList<Card> hand = new ArrayList<>();
	
	public Player(String name) {
		this.name = name;
		this.score = getScore();
		this.hand = getHand();
	}
	
	public void describePlayer() {
		System.out.println(this.name);
		System.out.println("Score: " + this.score);
		System.out.println("Hand:");
		for (int i = 0; i < hand.size(); i++) {
			System.out.print("|" + hand.get(i).getValue() + " of " + hand.get(i).getSuit() + "|");
		}
	}
	
	public Card Flip(ArrayList<Card> playerHand) {
		playerHand = hand;
		return playerHand.remove(0);
	}
	
	public void Draw(Deck deck) {
		Card topCard = deck.drawTopCard();
//		topCard.describeCard();
		this.hand.add(topCard);
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}
