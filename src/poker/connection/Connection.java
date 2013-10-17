package poker.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {
	private static final String baseUrl="http://nolimitcodeem.com/sandbox/players/";
	private static final String[] keys={"deal-phase-key", "flop-phase-key", "turn-phase-key", "river-phase-key"};
	
	public Connection()
	{
		
	}
	
	public String dealPhase()
	{
		return get(keys[0]);
	}
	
	public String flopPhase()
	{
		return get(keys[1]);
	}
	
	public String turnPhase()
	{
		return get(keys[2]);
	}
	
	public String riverPhase()
	{
		return get(keys[3]);
	}
	
	private String get(String arguments)
	{
		try{
			 
			URL obj = new URL(baseUrl+keys[0]);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			// optional default is GET
			con.setRequestMethod("GET");
	 
			//add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
	 
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + baseUrl);
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
			return response.toString();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
}
