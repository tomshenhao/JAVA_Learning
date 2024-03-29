package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ApacheTest {

	public static void main(String[] args) {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet("https://www.spark.co.nz");
		request.addHeader("User-Agent","Chrome");
				
		try{
			CloseableHttpResponse response = httpClient.execute(request);
			System.out.println("response code ="+response.getStatusLine().getStatusCode());
			
			BufferedReader inputReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));
			
			String line;
			
			while((line = inputReader.readLine())!= null) {
				System.out.println(line);
			}
			
			inputReader.close();
			response.close();
		} catch(IOException e) {
			System.out.println("IOException= "+e.getMessage());
		}
	}
}
