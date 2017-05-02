package com.kiran.deckoOfCard;

import com.kiran.deckoOfCard.Types.Rank;
import com.kiran.deckoOfCard.Types.Suites;

/**
 * Cards class that represents the uniqueness of each card
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class Cards {
	Suites s;
	Rank r;

	public Cards(Suites s, Rank r) {
		this.s = s;
		this.r = r;
	}

	@Override
	public String toString() {
		return r + "(" + r.value + ")" + " of " + s;
	}

	public Rank getRank() {
		return r;
	}

}
