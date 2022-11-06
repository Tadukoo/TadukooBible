package com.github.tadukoo.bible.api.download;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.util.logger.EasyLogger;
import com.github.tadukoo.util.parallel.ParallelWorker;
import com.github.tadukoo.util.parallel.Queue;

public class DownloadTranWorker extends ParallelWorker<BibleChapter>{
	
	public DownloadTranWorker(EasyLogger logger, Queue<BibleChapter> todo, Queue<BibleChapter> done){
		super(logger, todo, done);
	}
	
	@Override
	protected boolean checkToContinueWork(BibleChapter work){
		return work.getRef() != null;
	}
	
	@Override
	protected void doWork(BibleChapter work){
		BibleReference ref = work.getRef();
		work.setVerses(work.getRetriever().getVerses(ref));
	}
}
