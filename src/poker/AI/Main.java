package poker.AI;

import poker.AI.parser.JSONParser;
import poker.connection.Connection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sam^2 sucks");
		Connection a=new Connection(new JSONParser());
		a.turnPhase();
		try {
			a.action("bet=1000");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
