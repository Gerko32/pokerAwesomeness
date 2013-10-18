package poker.AI;

import java.util.ArrayList;
import java.util.HashMap;

public class CardCombinations {

	public static int GetActualValue(String[] hand, String[] table) {
		HashMap<Character, Integer> cards = new HashMap<>();
		for (int x = 0; x < hand.length; x++) {
			if (cards.containsKey(hand[x].charAt(0))) {
				cards.put(hand[x].charAt(0), cards.get(hand[x].charAt(0)) + 1);
			} else {
				cards.put(hand[x].charAt(0), 1);
			}
		}
		int maxCount = 0;
		for (Integer i : cards.values()) {
			if (i.intValue() / 2 > maxCount) {
				maxCount = i.intValue() / 2;
			}
		}
		return maxCount * 2;

	}

	private class Card {
		char suit;
		char value;

		public Card(String s) {
			suit = s.charAt(0);
			value = s.charAt(1);
		}
	}

}
