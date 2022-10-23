package com.github.tadukoo.bible.api.Download;

import com.github.tadukoo.bible.api.Constants.EnumTranslation;

public class DownloadTask implements Runnable{
	private EnumTranslation tran;
	private int bookStart, bookEnd;
	private int chpStart, chpEnd;
	
	public DownloadTask(EnumTranslation tran, int bookStart, int chpStart, int bookEnd, int chpEnd){
		this.tran = tran;
		this.bookStart = bookStart;
		this.chpStart = chpStart;
		this.bookEnd = bookEnd;
		this.chpEnd = chpEnd;
	}
	
	@Override
	public void run(){
		DownloadTran.runBooks(tran, bookStart, chpStart, bookEnd, chpEnd);
	}
}
