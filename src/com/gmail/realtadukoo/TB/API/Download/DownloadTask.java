package com.gmail.realtadukoo.TB.API.Download;

import com.gmail.realtadukoo.TB.API.Constants.EnumTranslation;

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
