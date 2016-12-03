package com.gmail.realtadukoo.TB.Download;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.gmail.realtadukoo.TB.VerseReading;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBibleChps;

public class DownloadTran{
	
	public static void run(EnumTranslations tran){
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
				chpEnd = EnumBibleChps.REVELATION.getChps().length;
			}else{
				bookEnd = bookStart;
				chpEnd = chpStart + chpNum;
				while(chpEnd > 
					EnumBibleChps.fromString(EnumBible.fromInt(bookEnd).book()).getChps().length){
					chpEnd -= EnumBibleChps.fromString(
							EnumBible.fromInt(bookEnd).book()).getChps().length;
					bookEnd++;
				}
				nextBookStart = bookEnd;
				if(chpEnd == EnumBibleChps.fromString(
						EnumBible.fromInt(bookEnd).book()).getChps().length){
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
	
	public static void runBooks(EnumTranslations tran, int bookStart, int chpStart, int bookEnd, 
			int chpEnd){
		for(int i = bookStart; i <= bookEnd; i++){
			EnumBible book = EnumBible.fromInt(i);
			EnumBibleChps echp = EnumBibleChps.fromString(book.book());
			int thisChpStart = 1;
			int thisChpEnd = echp.getChps().length;
			if(i == bookStart){
				thisChpStart = chpStart;
			}else if(i == bookEnd){
				thisChpEnd = chpEnd;
			}
			runBookPart(tran, book, echp, thisChpStart, thisChpEnd);
		}
		System.out.println("Finished " + EnumBible.fromInt(bookStart).book() + " " + chpStart + 
				" through " + EnumBible.fromInt(bookEnd).book() + " " + chpEnd);
	}
	
	private static void runBookPart(EnumTranslations tran, EnumBible book, EnumBibleChps echp, 
			int chpStart, int chpEnd){
		Properties verses = new Properties();
		for(int j = chpStart; j <= chpEnd; j++){
			for(int k = 1; k <= echp.getNum(j); k++){
				String verse = RetrieveFromSite.getVerse(book, j, k, tran);
				if(verse != null){
					verses.setProperty("ch" + j + "v" + k, verse);
				}
			}
			System.out.println("Finished Chapter " + j + " of " + book.book());
		}
		try{
			VerseReading.saveBook(verses, book, tran);
			System.out.println("Finished " + book.book() + " Chapters " + chpStart + " through " + 
					chpEnd);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void runBooks(EnumTranslations tran, int iStart, int iEnd){
		for(int i = iStart; i <= iEnd; i++){
			EnumBible book = EnumBible.fromInt(i);
			EnumBibleChps echp = EnumBibleChps.fromString(book.book());
			runBook(tran, book, echp);
		}
	}
	
	private static void runBook(EnumTranslations tran, EnumBible book, EnumBibleChps echp){
		Properties verses = new Properties();
		for(int j = 1; j <= echp.getChps().length; j++){
			for(int k = 1; k <= echp.getNum(j); k++){
				verses.setProperty("ch" + j + "v" + k, RetrieveFromSite.getVerse(book, j, k, tran));
			}
			System.out.println("Finished Chapter " + j + " of " + book.book());
		}
		try{
			VerseReading.saveBook(verses, book, tran);
			System.out.println("Finished " + book.book());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
