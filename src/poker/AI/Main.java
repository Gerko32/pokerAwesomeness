package poker.AI;

import poker.AI.parser.JSONParser;
import poker.AI.valueobjects.Action;
import poker.connection.Connection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sam^2 sucks");
		Connection a=new Connection(new JSONParser());
		try {
			/*Action action=new Action();
			action.s
			a.action(new Action());*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
