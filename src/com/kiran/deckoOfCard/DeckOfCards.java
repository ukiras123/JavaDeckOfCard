package com.kiran.deckoOfCard;

import java.util.Random;

import com.kiran.deckoOfCard.Types.Num;
import com.kiran.deckoOfCard.Types.Suites;

public class DeckOfCards {

	Cards[] card;
	private int total = 52;
	Random rand;
	int cardLeft = 52;

	public DeckOfCards() {
		card = new Cards[total];
		int start = 0;
		for (Suites s : Suites.values()) {
			for (Num n : Num.values()) {
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

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < total; i++) {
			output += card[i].toString() + "\n";
		}
		return output;
	}
}
