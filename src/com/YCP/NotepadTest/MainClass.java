package com.YCP.NotepadTest;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class MainClass {
	public static void main(String[] args) {
		try {
			int playerOneScore = 0;
			int playerTwoScore = 0;
			Scanner s = new Scanner(new File("poker.txt"));										//filenaam nog toevoegen
			while (s.hasNext()) {
				ArrayList<ArrayList<String>> hands = new ArrayList<ArrayList<String>>();
			
				for (int i = 0; i < 2; i++) {
					ArrayList<String> currentHand = new ArrayList<String>();
					for (int j = 0; j < 5; j++) {
						currentHand.add(s.next());
					}
					hands.add(currentHand);
				}

				if (checkWinningPlayer(hands.get(0), hands.get(1))) {
					playerOneScore++;
				} else {
					playerTwoScore++;
				}
			}
			System.out.println(playerOneScore + " - " + playerTwoScore);

		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
			System.exit(0);
		}
	}
	

	private static boolean checkWinningPlayer(ArrayList<String> playerOneHand, ArrayList<String> playerTwoHand) {
		Hand handOne = new Hand(playerOneHand);
		Hand handTwo = new Hand(playerTwoHand);
		if (handOne.getValue() > handTwo.getValue()) {
			return true;
		} else if (handOne.getValue() < handTwo.getValue()) {
			return false;
		} else {
			for (int i = 0; i < 5; i++) {
				if (handOne.getHighCard(i) > handTwo.getHighCard(i)) {
					return true;
				} else if (handOne.getHighCard(i) < handTwo.getHighCard(i)) {
					return false;
				}
			}
		}
	}
}