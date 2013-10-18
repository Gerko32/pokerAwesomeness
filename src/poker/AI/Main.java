package poker.AI;

import poker.AI.parser.JSONParser;
import poker.AI.strategy.impl.RandomStrategy;
import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;
import poker.connection.Connection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection a = new Connection(new JSONParser());
		while(true){
			try {
				Response r=a.get();
				if(r.isYourTurn())
				{
					a.action(new Action("raise",0));
				}
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("hello");
			}
		}
		/*while (true) {
			try {
				a.action(new RandomStrategy().apply(a
						.action(new Action("check", 0))));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
