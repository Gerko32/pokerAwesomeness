package poker.AI.valueobjects;

public class Suit {

	public final int value;

	public Suit(char c) {
		value = Integer.parseInt("" + c);
	}

}
