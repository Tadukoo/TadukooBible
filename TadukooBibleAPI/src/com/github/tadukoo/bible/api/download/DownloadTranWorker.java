package com.github.tadukoo.bible.api.download;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.util.parallel.ParallelWorker;
import com.github.tadukoo.util.parallel.Queue;

public class DownloadTranWorker extends ParallelWorker<BibleChapter>{
	
	public DownloadTranWorker(Queue<BibleChapter> todo, Queue<BibleChapter> done){
		super(todo, done);
	}
	
	@Override
	protected boolean checkForTerminateWork(BibleChapter work){
		return work.getRef() != null;
	}
	
	@Override
	protected void doWork(BibleChapter work){
		BibleReference ref = work.getRef();
		work.setVerses(work.getRetriever().getVerses(ref));
	}
}
