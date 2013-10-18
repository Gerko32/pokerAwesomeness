package poker.AI.valueobjects;

public class Action {
	private String action;
	private int amount;
	
	public Action(String action, int amount) {
		this.action = action;
		this.amount = amount;
	}

	public String getAction() {
		return action;
	}

	public int getAmount() {
		return amount;
	}

}
