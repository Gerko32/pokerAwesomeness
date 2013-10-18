package poker.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import poker.AI.parser.JSONParser;
import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;

public class Connection {
	private static final String baseUrl="http://nolimitcodeem.com/sandbox/players/";
	
	private JSONParser parser;
	
	public Connection(JSONParser parser){
		this.parser=parser;
	}
	
	private Response get(String arguments)
	{
		try{
			URL obj = new URL(baseUrl+arguments);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
	 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
	 
			//print result
			return parser.parse(response.toString(), Response.class);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public Response action(Action action) throws Exception {

			String url = baseUrl+"/action";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			//add reuqest header
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	 
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes("action_name="+action.getAction());
			if(!action.getAction().equals("fold")){
				wr.writeBytes("amount="+action.getAmount());
			}
			wr.flush();
			wr.close();
	 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return parser.parse(response.toString(), Response.class);
	}
}
