package poker.AI;

import java.util.ArrayList;
import java.util.HashMap;

import poker.AI.valueobjects.Response;

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
		for (int x = 0; x < table.length; x++) {
			if (cards.containsKey(table[x].charAt(0))) {
				cards.put(table[x].charAt(0), cards.get(table[x].charAt(0)) + 1);
			} else {
				cards.put(table[x].charAt(0), 1);
			}
		}
		int maxCount = 0;
		for (Integer i : cards.values()) {
			if (i.intValue() > maxCount) {
				maxCount = i.intValue();
			}
		}
		if(maxCount==1) return 0;
		if(maxCount==2) return maxCount;
		if(maxCount==3) return maxCount*2;
		return Integer.MAX_VALUE;
	}
	
	public static int isPairOrMore(Response r) {
		HashMap<Character, Integer> cards = new HashMap<>();
		for (int x = 0; x < r.getHand().length; x++) {
			if (cards.containsKey(r.getHand()[x].charAt(0))) {
				cards.put(r.getHand()[x].charAt(0), cards.get(r.getHand()[x].charAt(0)) + 1);
			} else {
				cards.put(r.getHand()[x].charAt(0), 1);
			}
		}
		for (int x = 0; x < r.getCommunityCards().length; x++) {
			if (cards.containsKey(r.getCommunityCards()[x].charAt(0))) {
				cards.put(r.getCommunityCards()[x].charAt(0), cards.get(r.getCommunityCards()[x].charAt(0)) + 1);
			} else {
				cards.put(r.getCommunityCards()[x].charAt(0), 1);
			}
		}
		int maxCount = 0;
		for (Integer i : cards.values()) {
			if (i.intValue() > maxCount) {
				maxCount = i.intValue();
			}
		}
		return maxCount;
	}
	
	public static int quantityOfPairs(Response r) {
		HashMap<Character, Integer> cards = new HashMap<>();
		for (int x = 0; x < r.getHand().length; x++) {
			if (cards.containsKey(r.getHand()[x].charAt(0))) {
				cards.put(r.getHand()[x].charAt(0), cards.get(r.getHand()[x].charAt(0)) + 1);
			} else {
				cards.put(r.getHand()[x].charAt(0), 1);
			}
		}
		for (int x = 0; x < r.getCommunityCards().length; x++) {
			if (cards.containsKey(r.getCommunityCards()[x].charAt(0))) {
				cards.put(r.getCommunityCards()[x].charAt(0), cards.get(r.getCommunityCards()[x].charAt(0)) + 1);
			} else {
				cards.put(r.getCommunityCards()[x].charAt(0), 1);
			}
		}
		int qtyMaxCount=0;
		for (Integer i : cards.values()) {
			if (i.intValue()==2) {
				qtyMaxCount++;
			}
		}
		return qtyMaxCount;
	}
	
	public static int qtySameColor(Response r) {
		HashMap<Character, Integer> cards = new HashMap<>();
		for (int x = 0; x < r.getHand().length; x++) {
			if (cards.containsKey(r.getHand()[x].charAt(1))) {
				cards.put(r.getHand()[x].charAt(1), cards.get(r.getHand()[x].charAt(1)) + 1);
			} else {
				cards.put(r.getHand()[x].charAt(1), 1);
			}
		}
		for (int x = 0; x < r.getCommunityCards().length; x++) {
			if (cards.containsKey(r.getCommunityCards()[x].charAt(1))) {
				cards.put(r.getCommunityCards()[x].charAt(1), cards.get(r.getCommunityCards()[x].charAt(1)) + 1);
			} else {
				cards.put(r.getCommunityCards()[x].charAt(1), 1);
			}
		}
		int maxCount=0;
		for (Integer i : cards.values()) {
			if (i.intValue()>maxCount) {
				maxCount=i.intValue();
			}
		}
		return maxCount;
	}
	
	public static int GetActualValueV2(String[] hand, String[] table,int callAmout,int stack) {
		/*Card[] cards=new Card[hand.length+table.length];
		
		for (int x = 0; x < hand.length; x++) {
			cards[x]=new Card(hand[x]);
		}
		for (int x = 0; x < table.length; x++) {
			cards[x+hand.length-1]=new Card(table[x]);
		}*/
		return 0;
	}

	private class Card {
		char suit;
		char value;

		public Card(String s) {
			suit = s.charAt(1);
			value = s.charAt(0);
		}
	}

}
