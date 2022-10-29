package com.github.tadukoo.bible.api.Command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.tadukoo.bible.api.Constants.EnumBible;
import com.github.tadukoo.bible.api.Constants.EnumTranslation;
import com.github.tadukoo.bible.api.Bible.BibleReference;

public class FindMissing extends Command{
	
	public FindMissing(){
		super("<Tran:translation>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		// Get arguments
		Map<String, Object> objs = getArgsAsObjects(args);
		EnumTranslation tran = (EnumTranslation) objs.get("Tran");
		
		// Do work
		findMissing(tran);
		
		// Return
		return new ArrayList<>();
	}
	
	public static void findMissing(EnumTranslation tran){
		Properties missing = new Properties();
		int count = 1;
		for(int i = 1; i <= 66; i++){
			EnumBible book = EnumBible.fromInt(i);
			if(book == null){
				throw new IllegalStateException("Failed to find Bible book #" + i + " in EnumBible");
			}
			for(int j = 1; j <= book.getNumChapters(); j++){
				for(int k = 1; k <= book.getNumVersesInChp(j); k++){
					BibleReference ref = BibleReference.builder()
														.book(book)
														.chapter(j)
														.verse(k)
														.translation(tran)
														.build();
					if(GetVerse.getVerse(ref) == null){
						System.out.println("Missing " + book.getName() + " " + j + ":" + k);
						missing.setProperty(tran.getAbbreviation() + count, 
								book.getName() + " " + j + ":" + k);
						count++;
					}
				}
			}
			System.out.println("Checked " + book.getName());
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
