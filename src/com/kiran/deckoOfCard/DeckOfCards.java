package com.kiran.deckoOfCard;

import java.util.Random;

import com.kiran.deckoOfCard.Types.Rank;
import com.kiran.deckoOfCard.Types.Suites;

public class DeckOfCards {

	private Cards[] card;
	private final static int total = 52;
	private Random rand;
	private static int cardLeft = 52;

	public DeckOfCards() {
		this(total);
	}
	
	public DeckOfCards(int total) {
		card = new Cards[total];
		int start = 0;
		for (Suites s : Suites.values()) {
			for (Rank n : Rank.values()) {
				card[start] = new Cards(s, n);
				start++;
			}
		}
	}
	
	

	public void suffle() {
		for (int i = 0; i < total; i++) {
			rand = new Random();
			int random = rand.nextInt(total - 1) + 1;
			Cards temp = card[i];
			card[i] = card[random];
			card[random] = temp;
		}
	}

	public String deal() throws Exception {
		if (cardLeft < 1)
			throw new Exception("No more card left");
		String value = card[cardLeft - 1].toString();
		cardLeft--;
		return value;
	}
	
	public int cardLeft()
	{
		return cardLeft;
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < total; i++) {
			output += card[i].toString() + "\n";
		}
		return output;
	}
}
