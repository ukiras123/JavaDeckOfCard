package com.kiran.deckoOfCard.game;

import java.util.ArrayList;

import com.kiran.deckoOfCard.Cards;

/**
 * Entity represents any player or computer player and everyone should have
 * these functionality.
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 *
 */
public interface Entity {
	/**
	 * Money an entity has
	 */
	int money = 1000;

	/**
	 * Once a card is distributed to the entity, its added
	 * 
	 * @param c
	 *            Card
	 */
	public void addCard(Cards c);

	/**
	 * Clear all the cards of the player if we played again
	 */
	public void clearCard();

	/**
	 * Setting the total card value of the total cards in hand.
	 * 
	 * @param cardValue
	 */
	public void setCardValue(int cardValue);

	/**
	 * Getting the total card value of the total cards in hand.
	 * 
	 */
	public int getCardValue();

	/**
	 * Add money once a player wins the game.
	 * 
	 * @param money
	 *            Money
	 */
	public void addMoney(int money);

	/**
	 * Remove money once a player loses the game.
	 * 
	 * @param money
	 *            Money
	 */
	public void removeMoney(int money);

	/**
	 * Get how much money an entity has
	 * 
	 * @return money
	 */
	public int getMoney();

	/**
	 * Get all the card a player has
	 * 
	 * @return list of cards a player has
	 */
	public ArrayList<Cards> getCards();
}
