package poker.AI.strategy.impl;

import poker.AI.strategy.Strategy;
import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;

public class AllIn extends Strategy {

	@Override
	public Action apply(Response r) {
		return new Action("bet", r.getStack());
	}

}
