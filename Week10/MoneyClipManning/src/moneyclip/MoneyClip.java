package moneyclip;
import cards.Card;

public class MoneyClip {
	
	public Card card1;
	public Card card2;
	
	public MoneyClip() {
		
	}

	public void addCard(Card n) {
		if (card1 == null) {
			Card card1 = new Card();
		}
		else if (card2 == null) {
			Card card2 = new Card();
		}
	}
	
	public String formatCards(Card card1, Card card2) {
		return card1 + "|" + card2;
	}
	
	public int getExpiredCardCount(Card card1, Card card2) {
		int count = 0;
		if (card1.isExpired()) {
			count++;
		}
		if (card2.isExpired()) {
			count++;
		}
		return count;
	}

}
