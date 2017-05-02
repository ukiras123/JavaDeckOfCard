package com.kiran.deckoOfCard.game;

import java.util.ArrayList;

import com.kiran.deckoOfCard.Cards;

/**
 * Computer Entity. If a user plays against the computer, create an object of
 * Computer.
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class Computer implements Entity {

	private int money = 1000;
	private String name;
	ArrayList<Cards> cards;
	int cardValue;

	public Computer() {
		this.name = "Computer";
		cards = new ArrayList<>();
	}

	public void addCard(Cards c) {
		cards.add(c);
	}

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Cards> getCards() {
		return cards;
	}

	@Override
	public void clearCard() {
		cards.clear();
	}

	@Override
	public void removeMoney(int money) {
		this.money -= money;
	}

	@Override
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	@Override
	public int getCardValue() {
		return cardValue;
	}

	@Override
	public String toString() {
		return "Name: " + name + ". Money: $" + money;
	}

}
