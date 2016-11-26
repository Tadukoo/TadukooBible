package com.gmail.realtadukoo.TB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RetrieveFromSite{
	
	public static String getVerse(String book, int chp, int v, String tran){
		String verse = null;
		
		book = book.toLowerCase();
		book = book.replace(" ", "_");
		if(book.equals("song_of_songs")){
			book = "songs";
		}
		
		URL site = null;
		try{
			site = new URL("http://biblehub.com/" + book + "/" + chp + "-" + v + ".htm");
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new InputStreamReader(site.openStream()));
		}catch(IOException e){
			e.printStackTrace();
		}
		
		boolean cont = true;
		while(cont){
			String line = null;
			try{
				line = reader.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			if(line != null){
				if(line.contains(tran)){
					line = line.split(tran + "</a></span><br />")[1];
					line = line.split("<span class=")[0];
					verse = line;
					cont = false;
				}
			}
		}
		
		return verse;
	}
}
