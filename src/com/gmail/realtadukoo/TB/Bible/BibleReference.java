package com.gmail.realtadukoo.TB.Bible;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;

public class BibleReference{
	private EnumBible book;
	private int chapter;
	private int verse;
	private EnumTranslation translation;
	
	public BibleReference(){
		this.book = null;
		this.chapter = -1;
		this.verse = -1;
		this.translation = null;
	}
	
	public BibleReference(EnumBible book, int chapter, int verse, EnumTranslation translation){
		this.book = book;
		this.chapter = chapter;
		this.verse = verse;
		this.translation = translation;
	}
	
	public EnumBible getBook(){
		return book;
	}
	
	public void setBook(EnumBible book){
		this.book = book;
	}
	
	public int getChapter(){
		return chapter;
	}
	
	public void setChapter(int chapter){
		this.chapter = chapter;
	}
	
	public int getVerse(){
		return verse;
	}
	
	public void setVerse(int verse){
		this.verse = verse;
	}
	
	public EnumTranslation getTranslation(){
		return translation;
	}
	
	public void setTranslation(EnumTranslation translation){
		this.translation = translation;
	}
}
