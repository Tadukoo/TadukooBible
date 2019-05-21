package com.gmail.realtadukoo.TB;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Bible.EnumBibleChapters;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;

public class FindMissing{
	
	public static void run(EnumTranslations tran){
		Properties missing = new Properties();
		int count = 1;
		for(int i = 1; i <= 66; i++){
			EnumBible book = EnumBible.fromInt(i);
			EnumBibleChapters echp = EnumBibleChapters.fromBook(book.getBook());
			for(int j = 1; j <= echp.getChps().length; j++){
				for(int k = 1; k <= echp.getNum(j); k++){
					if(VerseReading.getVerse(new BibleReference(book, j, k, tran)) == null){
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
