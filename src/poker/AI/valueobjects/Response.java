package poker.AI.valueobjects;

public class Response {
	private PlayersAtTable[] players_at_table;
	private boolean your_turn;
	private String name;
	private int initial_stack;
	private int stack;
	private int current_bet;
	private int call_amount;
	private String[] hand;
	private String betting_phase;
	private int total_players_remaining;
	private int table_id;
	private int round_id;
	private Round[] round_history;
	private String lost_at;
	private String[] community_cards;

	public PlayersAtTable[] getPlayersAtTable() {
		return players_at_table;
	}

	public boolean isYourTurn() {
		return your_turn;
	}

	public String getName() {
		return name;
	}

	public int getInitialStack() {
		return initial_stack;
	}

	public int getStack() {
		return stack;
	}

	public int getCurrentBet() {
		return current_bet;
	}

	public int getCallAmount() {
		return call_amount;
	}

	public String[] getHand() {
		return hand;
	}

	public String getBettingPhase() {
		return betting_phase;
	}

	public int getTotalPlayersRemaining() {
		return total_players_remaining;
	}

	public int getTableId() {
		return table_id;
	}

	public int getRoundId() {
		return round_id;
	}

	public Round[] getRoundHistory() {
		return round_history;
	}

	public String getLostAt() {
		return lost_at;
	}

	public String[] getCommunityCards() {
		return community_cards;
	}

}
