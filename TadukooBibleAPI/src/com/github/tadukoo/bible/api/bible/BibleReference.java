package com.github.tadukoo.bible.api.bible;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.bible.api.constant.EnumTranslation;

/**
 * A POJO used for storing a Bible reference, including 
 * book as EnumBible, 
 * chapter as an int, 
 * verse as an int, and
 * translation as EnumTranslation
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT (Definitely earlier)
 */
public class BibleReference{
	
	/**
	 * Builder for constructing a {@link BibleReference} object.
	 * <br><br>
	 * <b>MUST</b> specify the following:
	 * <ul>
	 * <li>NOTHING is required for this builder</li>
	 * </ul>
	 * Defaults are:
	 * <ul>
	 * <li>book = null</li>
	 * <li>chapter = null</li>
	 * <li>verse = null</li>
	 * <li>translation = null</li>
	 * </ul>
	 * 
	 * @author Logan Ferree (Tadukoo)
	 */
	public static class BibleReferenceBuilder{
		/** The book of the Bible in this reference */
		private BibleBooks book = null;
		/** The chapter for this reference */
		private Integer chapter = null;
		/** The verse for this reference */
		private Integer verse = null;
		/** The translation for this reference */
		private EnumTranslation translation = null;
		
		// Cannot create BibleReferenceBuilder outside of BibleReference
		private BibleReferenceBuilder(){ }
		
		/**
		 * Set the book to be used on the BibleReference object
		 * 
		 * @param book The EnumBible book for the BibleReference object
		 */
		public BibleReferenceBuilder book(BibleBooks book){
			this.book = book;
			return this;
		}
		
		/**
		 * Set the book to be used on the BibleReference object, using the given 
		 * book name. Uses {@link BibleBooks#fromName} to set the book to use.
		 * 
		 * @param bookName The book name for the BibleReference object
		 */
		public BibleReferenceBuilder bookFromName(String bookName){
			this.book = BibleBooks.fromName(bookName);
			return this;
		}
		
		/**
		 * Set the book to be used on the BibleReference object, using the given 
		 * string. Uses {@link BibleBooks#fromString} to set the book to use.
		 * 
		 * @param text The book name or alias for the BibleReference object
		 */
		public BibleReferenceBuilder bookFromString(String text){
			this.book = BibleBooks.fromString(text);
			return this;
		}
		
		/**
		 * Set the book to be used on the BibleReference object, using the given 
		 * book number. Uses {@link BibleBooks#fromInt} to set the book to use.
		 * 
		 * @param bookNum The book number for the BibleReference object
		 */
		public BibleReferenceBuilder bookFromNumber(int bookNum){
			this.book = BibleBooks.fromInt(bookNum);
			return this;
		}
		
		/**
		 * Set the chapter to be used on the BibleReference object.
		 * 
		 * @param chapter The chapter for the BibleReference object
		 */
		public BibleReferenceBuilder chapter(int chapter){
			this.chapter = chapter;
			return this;
		}
		
		/**
		 * Set the verse to be used on the BibleReference object.
		 * 
		 * @param verse The verse for the BibleReference object
		 */
		public BibleReferenceBuilder verse(int verse){
			this.verse = verse;
			return this;
		}
		
		/**
		 * Set the translation to be used on the BibleReference object.
		 * 
		 * @param translation The translation for the BibleReference object
		 */
		public BibleReferenceBuilder translation(EnumTranslation translation){
			this.translation = translation;
			return this;
		}
		
		/**
		 * Set the translation to be used on the BibleReference object, using the given 
		 * translation name. Uses {@link EnumTranslation#fromName} to set the translation to use.
		 * 
		 * @param tranName The translation name for the BibleReference object
		 */
		public BibleReferenceBuilder translationFromName(String tranName){
			this.translation = EnumTranslation.fromName(tranName);
			return this;
		}
		
		/**
		 * Set the translation to be used on the BibleReference object, using the given 
		 * abbreviation. Uses {@link EnumTranslation#fromAbbreviation} to set the translation to use.
		 * 
		 * @param abbreviation The translation abbreviation for the BibleReference object
		 */
		public BibleReferenceBuilder translationFromAbbreviation(String abbreviation){
			this.translation = EnumTranslation.fromAbbreviation(abbreviation);
			return this;
		}
		
		/**
		 * Builds the BibleReference object based on the input data.
		 * 
		 * @return The built BibleReference object
		 */
		public BibleReference build(){
			return new BibleReference(book, chapter, verse, translation);
		}
	}
	
	/**
	 * Constructs a {@link BibleReferenceBuilder} to create a BibleReference object.
	 * 
	 * @return A new BibleReferenceBuilder
	 */
	public static BibleReferenceBuilder builder(){
		return new BibleReferenceBuilder();
	}
	
	/** The book for this Bible Reference (includes other useful info in EnumBible) */
	private BibleBooks book;
	/** The chapter for this Bible Reference */
	private Integer chapter;
	/** The verse for this Bible Reference */
	private Integer verse;
	/** The translation for this Bible Reference (includes other useful info in EnumTranslation) */
	private EnumTranslation translation;
	
	/**
	 * Constructs a Bible Reference with the given information.
	 * 
	 * @param book The book as an EnumBible
	 * @param chapter The chapter as an int
	 * @param verse The verse as an int
	 * @param translation The translation as an EnumTranslation
	 */
	private BibleReference(BibleBooks book, Integer chapter, Integer verse, EnumTranslation translation){
		this.book = book;
		this.chapter = chapter;
		this.verse = verse;
		this.translation = translation;
	}
	
	/**
	 * @return The EnumBible book for this Bible Reference
	 */
	public BibleBooks getBook(){
		return book;
	}
	
	/**
	 * Sets the EnumBible book for this Bible Reference
	 * 
	 * @param book The new EnumBible book
	 */
	public void setBook(BibleBooks book){
		this.book = book;
	}
	
	/**
	 * @return The chapter for this Bible Reference
	 */
	public Integer getChapter(){
		return chapter;
	}
	
	/**
	 * Sets the chapter for this Bible Reference
	 * 
	 * @param chapter The new chapter number
	 */
	public void setChapter(int chapter){
		this.chapter = chapter;
	}
	
	/**
	 * @return The verse for this Bible Reference
	 */
	public Integer getVerse(){
		return verse;
	}
	
	/**
	 * Sets the verse for this Bible Reference
	 * 
	 * @param verse The new verse number
	 */
	public void setVerse(int verse){
		this.verse = verse;
	}
	
	/**
	 * @return The EnumTranslation translation for this Bible Reference
	 */
	public EnumTranslation getTranslation(){
		return translation;
	}
	
	/**
	 * Sets the EnumTranslation translation for this Bible Reference
	 * 
	 * @param translation The new EnumTranslation translation
	 */
	public void setTranslation(EnumTranslation translation){
		this.translation = translation;
	}
	
	@Override
	public String toString(){
		StringBuilder refString = new StringBuilder();
		
		// Add book if we have it
		if(book != null){
			refString.append(book.getName());
		}
		
		// Add chapter if we have it
		if(chapter != null){
			if(!refString.isEmpty()){
				refString.append(' ');
			}
			refString.append(chapter);
		}
		
		// Add verse if we have it
		if(verse != null){
			if(chapter == null){
				refString.append(' ');
			}
			refString.append(':').append(verse);
		}
		
		// Add translation if we have it
		if(translation != null){
			if(!refString.isEmpty()){
				refString.append(' ');
			}
			refString.append(translation.getName());
		}
		
		return refString.toString();
	}
}
