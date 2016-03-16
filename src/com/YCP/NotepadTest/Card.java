package com.YCP.NotepadTest;

public class Card {
	private char suit;
	private int cardValue;

	public Card(String s) {
		suit = s.charAt(1);

		char tester = s.charAt(0);

		switch (tester) {
			case '2': 	cardValue = 2;
					break;
			case '3': 	cardValue = 3;
					break;
			case '4': 	cardValue = 4;
					break;
			case '5': 	cardValue = 5;
					break;
			case '6': 	cardValue = 6;
					break;
			case '7': 	cardValue = 7;
					break;
			case '8': 	cardValue = 8;
					break;
			case '9': 	cardValue = 9;
					break;
			case 'T': 	cardValue = 10;
					break;
			case 'J': 	cardValue = 11;
					break;
			case 'Q': 	cardValue = 12;
					break;
			case 'K': 	cardValue = 13;
					break;
			case 'A': 	cardValue = 14;
					break;
			default: 	System.out.println("Invalid card");
		} 
	}
	
	public int getCardValue(){
		return cardValue;
	}

	public char getCardSuit(){
		return suit;
	}

}