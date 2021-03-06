package com.gmail.realtadukoo.TB.Download;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBible;

public class RetrieveFromSite{
	
	public static String getVerse(EnumBible ebook, int chp, int v, EnumTranslations tran){
		String verse = null;
		
		String book = ebook.book();
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
				if(line.contains(tran.getName())){
					line = line.split(tran.getName() + "</a></span><br />")[1];
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
