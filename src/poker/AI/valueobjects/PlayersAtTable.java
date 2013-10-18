package poker.AI.valueobjects;

public class PlayersAtTable extends Response {
	private String player_name;
	private int initial_stack;
	private int current_bet;
	private boolean folded;
	private int stack;
	private Action[] actions;

	public String getPlayer_name() {
		return player_name;
	}

	public int getInitialStack() {
		return initial_stack;
	}

	public int getCurrentBet() {
		return current_bet;
	}

	public boolean isFolded() {
		return folded;
	}

	public int getStack() {
		return stack;
	}

	public Action[] getActions() {
		return actions;
	}
}
