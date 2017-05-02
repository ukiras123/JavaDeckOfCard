package com.kiran.deckoOfCard;

/**
 * Class of ENUMs that denotes several feature of cards.
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class Types {
	public enum Suites {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public enum Rank {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(11), QUEEN(
				12), KING(13);
		public int value;

		private Rank(int value) {
			this.value = value;
		}

	}
}
