package poker.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import poker.AI.parser.JSONParser;
import poker.AI.valueobjects.Response;

public class Connection {
	private static final String baseUrl="http://nolimitcodeem.com/sandbox/players/";
	private static final String[] keys={"deal-phase-key", "flop-phase-key", "turn-phase-key", "river-phase-key"};
	
	private JSONParser parser;
	
	public Connection(JSONParser parser)
	{
		this.parser=parser;
	}
	
	public Response dealPhase()
	{
		return get(keys[0]);
	}
	
	public Response flopPhase()
	{
		return get(keys[1]);
	}
	
	public Response turnPhase()
	{
		return get(keys[2]);
	}
	
	public Response riverPhase()
	{
		return get(keys[3]);
	}
	
	private Response get(String arguments)
	{
		try{
			URL obj = new URL(baseUrl+arguments);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			// optional default is GET
			con.setRequestMethod("GET");
	 
			//add request header
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
	
	public void action(String action) throws Exception {
			 
			String url = baseUrl+keys[2]+"/action";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			//add reuqest header
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	 
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(action);
			wr.flush();
			wr.close();
	 
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + action);
			System.out.println("Response Code : " + responseCode);
	 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
	 
			//print result
			System.out.println(response.toString());
	}
	
}
