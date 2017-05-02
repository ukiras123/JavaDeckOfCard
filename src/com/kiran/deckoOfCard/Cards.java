package com.kiran.deckoOfCard;

import com.kiran.deckoOfCard.Types.Num;
import com.kiran.deckoOfCard.Types.Suites;

public class Cards {
	Suites s;
	Num n;

	public Cards(Suites s, Num n) {
		this.s = s;
		this.n = n;
	}
	
	@Override
	public String toString() {

		return  s +" "+ n;
	}

}
