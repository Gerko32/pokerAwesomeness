package poker.AI.strategy.impl;

import java.util.Random;

import poker.AI.strategy.Strategy;
import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;

public class RandomStrategy extends Strategy {

	private static final String[] options = { "bet", "check", "fold" };

	@Override
	public Action apply(Response r) {
		Random rand = new Random();
		int idx = rand.nextInt(options.length);
		String option = options[idx];
		int bet = 0;
		if (idx == 0) {
			bet = rand.nextInt(r.getStack());
		}
		return new Action(option, bet);
	}

}
