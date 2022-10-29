package com.github.tadukoo.bible.api.download;

import com.github.tadukoo.bible.api.Bible.BibleReference;
import com.github.tadukoo.bible.api.Constants.EnumBible;
import com.github.tadukoo.bible.api.Constants.EnumTranslation;
import com.github.tadukoo.bible.api.Files.VerseFile;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSiteBH;
import com.github.tadukoo.util.parallel.ParallelRunner;
import com.github.tadukoo.util.parallel.Queue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DownloadTranParallel extends ParallelRunner<BibleChapter>{
	private final EnumTranslation tran;
	
	public DownloadTranParallel(EnumTranslation tran){
		super(1189, 10, DownloadTranWorker.class);
		this.tran = tran;
	}
	
	@Override
	protected void doWork(Queue<BibleChapter> todo, Queue<BibleChapter> done) throws InterruptedException{
		// Send out work
		RetrieveChapterFromSite retriever = new RetrieveChapterFromSiteBH();
		for(EnumBible book: EnumBible.values()){
			for(int chp = 1; chp <= book.getNumChapters(); chp++){
				BibleReference ref = BibleReference.builder()
						.book(book).chapter(chp).translation(tran)
						.build();
				todo.enqueue(new BibleChapter(ref, retriever));
			}
		}
			
		// Receive work
		Map<String, Properties> verses = new HashMap<>();
		for(EnumBible book: EnumBible.values()){
			verses.put(book.getName(), new Properties());
		}
		for(EnumBible book: EnumBible.values()){
			for(int chp = 1; chp <= book.getNumChapters(); chp++){
				BibleChapter chapter = done.dequeue();
				BibleReference ref = chapter.getRef();
				Map<Integer, String> versesInChp = chapter.getVerses();
				System.out.println("Received " + ref.toString());
				for(int v: versesInChp.keySet()){
					verses.get(ref.getBook().getName())
							.setProperty("ch" + ref.getChapter() + "v" + v, versesInChp.get(v));
				}
			}
		}
		// Store results
		for(EnumBible book: EnumBible.values()){
			try{
				VerseFile.saveBook(verses.get(book.getName()), book, tran);
				System.out.println("Saved " + book.getName());
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void sendTerminateInfo(Queue<BibleChapter> todo) throws InterruptedException{
		todo.enqueue(new BibleChapter(null, null));
	}
}
