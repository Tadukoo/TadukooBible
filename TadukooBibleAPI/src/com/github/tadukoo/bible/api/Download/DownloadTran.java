package com.github.tadukoo.bible.api.Download;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.github.tadukoo.bible.api.Files.VerseFile;
import com.github.tadukoo.bible.api.Constants.EnumBible;
import com.github.tadukoo.bible.api.Constants.EnumTranslation;

public class DownloadTran{
	
	public static void run(EnumTranslation tran){
		int threadNum = 11;
		int chpNum = 1189/threadNum;
		System.out.println("ChpNum: " + chpNum);
		int nextBookStart = 1;
		int nextChpStart = 1;
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < threadNum; i++){
			System.out.println("Thread Num: " + i);
			System.out.println("bookStart: " + nextBookStart);
			System.out.println("chpStart: " + nextChpStart);
			int bookStart = nextBookStart, chpStart = nextChpStart;
			int bookEnd, chpEnd;
			if(i == threadNum - 1){
				bookEnd = 66;
				chpEnd = EnumBible.REVELATION.getNumChapters();
			}else{
				bookEnd = bookStart;
				chpEnd = chpStart + chpNum;
				while(chpEnd > EnumBible.fromInt(bookEnd).getNumChapters()){
					chpEnd -= EnumBible.fromInt(bookEnd).getNumChapters();
					bookEnd++;
				}
				nextBookStart = bookEnd;
				if(chpEnd == EnumBible.fromInt(bookEnd).getNumChapters()){
					nextChpStart = 1;
					nextBookStart++;
				}else{
					nextChpStart = chpEnd + 1;
				}
			}
			System.out.println("bookEnd: " + bookEnd);
			System.out.println("chpEnd: " + chpEnd);
			threads.add(new Thread(new DownloadTask(tran, bookStart, chpStart, bookEnd, chpEnd)));
			threads.get(i).start();
		}
		for(int i = 0; i < threadNum; i++){
			try{
				threads.get(i).join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void runBooks(EnumTranslation tran, int bookStart, int chpStart, int bookEnd, 
			int chpEnd){
		for(int i = bookStart; i <= bookEnd; i++){
			EnumBible book = EnumBible.fromInt(i);
			int thisChpStart = 1;
			int thisChpEnd = book.getNumChapters();
			if(i == bookStart){
				thisChpStart = chpStart;
			}else if(i == bookEnd){
				thisChpEnd = chpEnd;
			}
			runBookPart(tran, book, thisChpStart, thisChpEnd);
		}
		System.out.println("Finished " + EnumBible.fromInt(bookStart).getName() + " " + chpStart +
				" through " + EnumBible.fromInt(bookEnd).getName() + " " + chpEnd);
	}
	
	private static void runBookPart(EnumTranslation tran, EnumBible book, int chpStart, int chpEnd){
		Properties verses = new Properties();
		for(int j = chpStart; j <= chpEnd; j++){
			for(int k = 1; k <= book.getNumVersesInChp(j); k++){
				String verse = RetrieveFromSite.getVerse(book, j, k, tran);
				if(verse != null){
					verses.setProperty("ch" + j + "v" + k, verse);
				}
			}
			System.out.println("Finished Chapter " + j + " of " + book.getName());
		}
		try{
			VerseFile.saveBook(verses, book, tran);
			System.out.println("Finished " + book.getName() + " Chapters " + chpStart + " through " +
					chpEnd);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void runBooks(EnumTranslation tran, int iStart, int iEnd){
		for(int i = iStart; i <= iEnd; i++){
			EnumBible book = EnumBible.fromInt(i);
			runBook(tran, book);
		}
	}
	
	private static void runBook(EnumTranslation tran, EnumBible book){
		Properties verses = new Properties();
		for(int j = 1; j <= book.getNumChapters(); j++){
			for(int k = 1; k <= book.getNumVersesInChp(j); k++){
				verses.setProperty("ch" + j + "v" + k, RetrieveFromSite.getVerse(book, j, k, tran));
			}
			System.out.println("Finished Chapter " + j + " of " + book.getName());
		}
		try{
			VerseFile.saveBook(verses, book, tran);
			System.out.println("Finished " + book.getName());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
