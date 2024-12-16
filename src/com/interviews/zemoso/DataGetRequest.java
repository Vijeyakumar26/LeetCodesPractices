package com.interviews.zemoso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class DataGetRequest {

	public static void main(String[] args) {
		System.setProperty("http.agent", "Chrome");
	    try { 
	      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
	      try {
	        URLConnection connection = url.openConnection();
	        InputStream inputStream = connection.getInputStream();
	        String result = new BufferedReader(new InputStreamReader(inputStream))
	        		   .lines().collect(Collectors.joining("\n"));	
	        
	        System.out.println(result.toString());
	        
	      } catch (IOException ioEx) {
	        System.out.println(ioEx);
	      }
	    } catch (MalformedURLException malEx) {
	      System.out.println(malEx);
	    }

	}

}
