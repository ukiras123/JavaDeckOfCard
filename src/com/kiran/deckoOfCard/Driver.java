package com.kiran.deckoOfCard;

/**
 * Driver class for some testing
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class Driver {

	public static void main(String[] args) throws Exception {
		DeckOfCards player1 = new DeckOfCards();
		DeckOfCards player2 = new DeckOfCards();
		System.out.println(player1.deal());
		System.out.println(player2.deal());
		System.out.println(player1.deal().getRank().value);
	}

}
