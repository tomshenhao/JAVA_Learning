package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.spark.co.nz/abc");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("User-Agent", "Chrome");
			connection.setReadTimeout(30000);
						
			int responseCode = connection.getResponseCode();
			System.out.println("Response code: "+responseCode);
			if(responseCode != 200) {
				System.out.println("Error reading web page");
				System.out.println(connection.getResponseCode());
				return;
			}
			
			BufferedReader inputReader = new BufferedReader(
					new InputStreamReader(connection.getInputStream()));
			
			String line;
			
			while((line=inputReader.readLine())!= null) {
				System.out.println(line);
			}
			
			inputReader.close();
			
		} catch(MalformedURLException e) {
			System.out.println("Malformated URL: "+e.getMessage());
			
		} catch(IOException e) {
			System.out.println("IOException"+e.getMessage());
		}
		
	}

}