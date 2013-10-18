package poker.AI.valueobjects;

public class Card {
	public final Suit suit;
	public final Value value;

	public Card(String data) {
		value = new Value(data.toCharArray()[0]);
		suit = new Suit(data.toCharArray()[1]);
	}
}
