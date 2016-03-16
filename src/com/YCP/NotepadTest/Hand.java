package com.YCP.NotepadTest;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	private int Handvalue;
	private ArrayList<int> highCardList;


	public Hand(ArrayList<String> handList) {
		cards = new ArrayList<Card>(5);

		for(String s : handList) {
			cards.add(new Card(s));
		}
	}


	public int getValue() {
		if (checkStraightFlush()) {
			return 9;
		} else if (checkFourOfAKind()) {
			return 8;
		} else if (checkFullHouse()) {
			return 7;
		} else if (checkFlush()) {
			return 6;
		} else if (checkStraight()) {
			return 5;
		} else if (checkThreeOfAKind()) {
			return 4;
		} else if (checkTwoPair()) {
			return 3;
		} else if (checkPair()) {
			return 2;
		} else {
			return 1;
		}
	}


	public int getHighCard(int i) {
		return highCardList(i);
	}


	private boolean checkStraightFlush() {
		if (checkStraight() && checkFlush()) {
			return true
		}
	}




}