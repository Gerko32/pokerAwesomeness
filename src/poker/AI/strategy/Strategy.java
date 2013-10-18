package poker.AI.strategy;

import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;

public abstract class Strategy {
	public abstract Action apply(Response r);
}
