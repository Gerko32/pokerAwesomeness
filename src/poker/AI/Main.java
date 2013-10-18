package poker.AI;

import poker.AI.parser.JSONParser;
import poker.AI.strategy.impl.RandomStrategy;
import poker.AI.valueobjects.Action;
import poker.connection.Connection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sam^2 sucks");
		Connection a = new Connection(new JSONParser());
		while (true) {
			try {
				a.action(new RandomStrategy().apply(a
						.action(new Action("check", 0))));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
