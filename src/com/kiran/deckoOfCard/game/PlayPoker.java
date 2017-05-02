package com.kiran.deckoOfCard.game;

import java.util.Iterator;
import java.util.Scanner;

import com.kiran.deckoOfCard.Cards;
import com.kiran.deckoOfCard.DeckOfCards;

/**
 * This is a simple almost poker game where user gets three card, and computer
 * gets three card. User can bet money against computer and if he wins, he gets
 * money. Winning card = sum of total value of card.
 * 
 * @author Kiran
 * @version 1.0 May 1, 2017
 */
public class PlayPoker {
	DeckOfCards cards;
	Entity player;
	Entity computer;
	Scanner scan;

	public PlayPoker() {
		scan = new Scanner(System.in);
		cards = new DeckOfCards();
		createPlayers(getUserInfo());
		createComputer();
	}

	public void initiateGame() {
		DeckOfCards.suffle();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("===Welcome to Betting Game===");
		PlayPoker poker = new PlayPoker();
		boolean stop = false;
		while (stop == false) {
			poker.initiateGame();
			for (int i = 0; i < 3; i++) // Three cards each
			{
				poker.player.addCard(poker.cards.deal());
				poker.computer.addCard(poker.cards.deal());
			}
			poker.calculateEntityCardsValue(poker.player);
			poker.calculateEntityCardsValue(poker.computer);
			System.out.println("=============================");
			System.out.println("You playing against: \n" + poker.computer);
			System.out.println("=============================");
			System.out.println(
					"It's you: \n" + poker.player + "\nYour cards are: \n" + poker.player.getCards().toString());
			System.out.println("=============================");
			int userBetAmount = poker.checkIfUserBets();
			if (poker.player.getCardValue() > poker.computer.getCardValue()) {
				poker.playerWinsDialogue(userBetAmount);
			} else {
				poker.computerWinsDialogue(userBetAmount);
			}

			stop = poker.askToStop();
		}
		System.out.println("Thank for Playing");
	}

	public void calculateEntityCardsValue(Entity entity) {
		int totalCardValue = 0;
		Iterator<Cards> iter = entity.getCards().iterator();
		while (iter.hasNext()) {
			totalCardValue += iter.next().getRank().value;
		}
		entity.setCardValue(totalCardValue);
	}

	public void createPlayers(String name) {
		player = new Player(name); // For now, only one player can play the
									// game. No multiplayer
	}

	public void createComputer() {
		computer = new Computer();
	}

	public void playerWinsDialogue(int money) {
		System.out.println("**********************************");
		System.out.println("Awesome, you won the bet!");
		System.out.println("Computer Cards:\n" + computer.getCards().toString());
		player.addMoney(money);
		computer.removeMoney(money);
		System.out.println(computer);
		System.out.println(player);
		System.out.println("**********************************");
	}

	public void computerWinsDialogue(int money) {
		System.out.println("**********************************");
		System.out.println("Sorry, you lost the bet!");
		System.out.println("Computer Cards:\n" + computer.getCards().toString());
		player.removeMoney(money);
		computer.addMoney(money);
		System.out.println(computer);
		System.out.println(player);
		System.out.println("**********************************");
	}

	public String getUserInfo() {
		scan = new Scanner(System.in);
		System.out.println("Whats your name? ");
		String name = scan.next();
		return name;
	}

	public int checkIfUserBets() {
		scan = new Scanner(System.in);
		System.out.println("How much you wanna bet? ");
		int amount = scan.nextInt();
		return amount;
	}

	public boolean askToStop() {
		scan = new Scanner(System.in);
		System.out.println("Want to stop the game? (Y) ");
		String userInput = scan.next();
		return userInput.equals("Y") ? true : false;
	}

}
