package asahapde_lab06;


public class asahapde_lab06_q3 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.printCards();
	}

}

class Card {
	private int denomination;
	private char suit;

	public Card(int denomination, char suit) {
		this.denomination = denomination;
		this.suit = suit;
	}

	public String face() {
		String card = null;
		if (denomination == 1)
			card = "A";
		else if (denomination == 11)
			card = "J";
		else if (denomination == 12)
			card = "Q";
		else if (denomination == 13)
			card = "K";
		else
			card = Integer.toString(denomination);
		return card.concat(Character.toString(this.suit));
	}
}

class Deck {
	public Card cards[] = new Card[52];
	private char suits[] = new char[4];
	private int denominations = 13;

	public Deck() {
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < denominations; j++) {
				cards[j+(i*denominations)] = new Card(j+1,suits[i]);
			}
		}		
	}

	public void printCards() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < denominations; j++) {
				System.out.print(cards[j+(i*denominations)].face());
				if (j != denominations - 1)
					System.out.print(", ");
			}
			System.out.print("\n");
		}
	}

}
