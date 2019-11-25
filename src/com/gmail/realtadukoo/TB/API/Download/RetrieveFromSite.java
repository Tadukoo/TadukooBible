package com.gmail.realtadukoo.TB.API.Download;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.gmail.realtadukoo.TB.API.Constants.EnumBible;
import com.gmail.realtadukoo.TB.API.Constants.EnumTranslation;

public class RetrieveFromSite{
	
	public static String getVerse(EnumBible ebook, int chp, int v, EnumTranslation tran){
		String verse = null;
		
		String book = ebook.getBook();
		book = book.toLowerCase();
		book = book.replace(" ", "_");
		if(book.equals("song_of_songs")){
			book = "songs";
		}
		
		URL site = null;
		try{
			site = new URL("https://biblehub.com/" + book + "/" + chp + "-" + v + ".htm");
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
				if(line.contains(tran.getSiteString())){
					line = line.split(tran.getSiteString() + "</a></span><br />")[1];
					line = line.split("<span class=")[0];
					line = line.replaceAll("<i>", "");
					line = line.replaceAll("</i>", "");
					verse = line;
					cont = false;
				}
			}else{
				cont = false;
			}
		}
		
		return verse;
	}
}
