package com.gmail.realtadukoo.TB.Command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;
import com.gmail.realtadukoo.TB.Constants.EnumBible;

public class FindMissing extends Command{
	
	public FindMissing(){
		super("<Tran:translation>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		// Get arguments
		HashMap<String, Object> objs = getArgsAsObjects(args);
		EnumTranslations tran = (EnumTranslations) objs.get("Tran");
		
		// Do work
		findMissing(tran);
		
		// Return
		return new String[]{};
	}
	
	public static void findMissing(EnumTranslations tran){
		Properties missing = new Properties();
		int count = 1;
		for(int i = 1; i <= 66; i++){
			EnumBible book = EnumBible.fromInt(i);
			for(int j = 1; j <= book.getChps().length; j++){
				for(int k = 1; k <= book.getNum(j); k++){
					if(GetVerse.getVerse(new BibleReference(book, j, k, tran)) == null){
						System.out.println("Missing " + book.getBook() + " " + j + ":" + k);
						missing.setProperty(tran.getAbbreviation() + count, 
								book.getBook() + " " + j + ":" + k);
						count++;
					}
				}
			}
			System.out.println("Checked " + book.getBook());
		}
		OutputStream os;
		try{
			os = new FileOutputStream("resource/Bible/missing.properties");
			missing.store(os, "No Comment");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
