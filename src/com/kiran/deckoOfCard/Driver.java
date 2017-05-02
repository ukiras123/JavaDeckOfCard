package com.kiran.deckoOfCard;

public class Driver {

	public static void main(String[] args) throws Exception {
		DeckOfCards player1 = new DeckOfCards();
		DeckOfCards player2 = new DeckOfCards();
		System.out.println(player1.deal());
		System.out.println(player2.deal());
		System.out.println(player1.cardLeft());
	}

}
