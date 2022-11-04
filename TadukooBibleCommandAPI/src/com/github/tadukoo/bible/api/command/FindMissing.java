package com.github.tadukoo.bible.api.command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;
import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.verse.VerseRetrieval;
import com.github.tadukoo.util.StringUtil;

public class FindMissing extends Command{
	
	public FindMissing(){
		super("<Tran:translation>");
	}
	
	@Override
	public List<String> runCommand(List<String> args) throws Throwable{
		// Get arguments
		Map<String, Object> objs = getArgsAsObjects(args);
		EnumTranslation tran = (EnumTranslation) objs.get("Tran");
		
		// Do work
		findMissing(tran);
		
		// Return
		return new ArrayList<>();
	}
	
	public void findMissing(EnumTranslation tran) throws Throwable{
		Properties missing = new Properties();
		int count = 1;
		for(int i = 1; i <= 66; i++){
			EnumBible book = EnumBible.fromInt(i);
			if(book == null){
				logger.logDebugFine("Failed to find Bible book #" + i + " in EnumBible");
				continue;
			}
			for(int j = 1; j <= book.getNumChapters(); j++){
				for(int k = 1; k <= book.getNumVersesInChp(j); k++){
					BibleReference ref = BibleReference.builder()
														.book(book)
														.chapter(j)
														.verse(k)
														.translation(tran)
														.build();
					VerseRetrieval verseRetrieval = new VerseRetrieval(settings);
					if(StringUtil.isBlank(verseRetrieval.getVerse(ref))){
						logger.logDebugFine("Missing " + book.getName() + " " + j + ":" + k);
						missing.setProperty(tran.getAbbreviation() + count, 
								book.getName() + " " + j + ":" + k);
						count++;
					}
				}
			}
			logger.logDebugFine("Checked " + book.getName() + " for missing verses");
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
