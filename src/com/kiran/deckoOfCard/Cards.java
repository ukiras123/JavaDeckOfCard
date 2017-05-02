package com.kiran.deckoOfCard;

import com.kiran.deckoOfCard.Types.Rank;
import com.kiran.deckoOfCard.Types.Suites;

public class Cards {
	Suites s;
	Rank r;

	public Cards(Suites s, Rank r) {
		this.s = s;
		this.r = r;
	}
	
	@Override
	public String toString() {

		return  r +" of "+ s;
	}

}
