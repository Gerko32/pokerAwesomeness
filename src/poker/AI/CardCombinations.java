package poker.AI;

import java.util.ArrayList;
import java.util.HashMap;

public class CardCombinations {

	public static int GetActualValue(String[] hand,String[] table){
		HashMap<Character,Character> cards=new HashMap();
		for(int x=0;x<hand.length;x++)
		{
			if(cards.containsKey(hand[x].charAt(0))){
				//((hand[x].charAt(0), 1);
			}
		}
		for(int x=0;x<table.length;x++)
		{
			cards.put(table[x].charAt(0), table[x].charAt(1));
		}
		for(Character key : cards.keySet()){
			//if(cards.get)
		}
		return 0;
	}
	
	private class Card{
		char suit;
		char value;
		
		public Card(String s)
		{
			suit=s.charAt(0);
			value=s.charAt(1);
		}
	}

}
