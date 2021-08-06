public class App {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		
		System.out.println("This is War");
		System.out.println("");
		System.out.println("Player 1 vs Player 2");
		System.out.println("");
		
		System.out.println("Full Deck:");
		myDeck.printDeck();
		
		myDeck.Shuffle();
				
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.Draw(myDeck);
			} else {
				player2.Draw(myDeck);
			}
		}
		
		System.out.println("");
		player1.describePlayer();
		System.out.println("");
		System.out.println("");
		player2.describePlayer();
		System.out.println("");
		System.out.println("");
		System.out.println("Game:");
		
		for (int j = 0; j < 26; j++) {
			int p1c = player1.Flip(player1.getHand()).getValue();
			System.out.println(p1c);
			int p2c = player2.Flip(player2.getHand()).getValue();
			System.out.println(p2c);
			if (p1c == p2c) {
				System.out.println("Draw");
			} else if (p1c < p2c) {
				System.out.println("Player 2 wins round");
				player2.incrementScore();
			} else {
				System.out.println("Player 1 wins round");
				player1.incrementScore();
			}
		}
		System.out.println("");
		System.out.println("Player 1 Score: " + player1.getScore());;
		System.out.println("Player 2 Score: " + player2.getScore());
		System.out.println("");
		
		if (player1.getScore() == player2.getScore()) {
			System.out.println("Final: Draw");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println("Final: Player 1 Wins");
		} else {
			System.out.println("Final: Player 2 Wins");
		}
	}
}