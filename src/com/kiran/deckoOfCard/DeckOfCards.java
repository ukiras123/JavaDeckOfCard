package com.kiran.deckoOfCard;

import java.util.Random;

import com.kiran.deckoOfCard.Types.Rank;
import com.kiran.deckoOfCard.Types.Suites;

/**
 * Class that holds deck of cards.
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class DeckOfCards {

	private static Cards[] card;
	private final static int total = 52;
	private static Random rand;
	private static int cardLeft = 52;
	public int a = 4;

	public DeckOfCards() {
		this(total);
	}

	private DeckOfCards(int total) {
		card = new Cards[total];
		int start = 0;
		for (Suites s : Suites.values()) {
			for (Rank n : Rank.values()) {
				card[start] = new Cards(s, n);
				start++;
			}
		}
	}

	public static void suffle() {
		cardLeft = 52;
		for (int i = 0; i < total; i++) {
			rand = new Random();
			int random = rand.nextInt(total - 1) + 1;
			Cards temp = card[i];
			card[i] = card[random];
			card[random] = temp;
		}
	}

	public Cards deal() throws Exception {
		if (cardLeft < 1)
			throw new Exception("No more card left");
		Cards newCard = card[cardLeft - 1];
		cardLeft--;
		return newCard;
	}

	public int cardLeft() {
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
