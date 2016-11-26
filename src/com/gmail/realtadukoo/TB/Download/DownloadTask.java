package com.gmail.realtadukoo.TB.Download;

import com.gmail.realtadukoo.TB.Enums.EnumTranslations;

public class DownloadTask implements Runnable{
	private EnumTranslations tran;
	private int bookStart, bookEnd;
	private int chpStart, chpEnd;
	
	public DownloadTask(EnumTranslations tran, int bookStart, int chpStart, int bookEnd, int chpEnd){
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
