package com.github.tadukoo.bible.api.Constants;

/**
 * Contains information about the supported Bible translations.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT (Definitely earlier)
 */
public enum EnumTranslation{
	/**
	 * <b><u>AKJV</u></b>
	 * <br>American King James Version
	 */
	AKJV("American King James Version", "AKJV"),
	/**
	 * <b><u>ASV</u></b>
	 * <br>American Standard Version
	 */
	ASV("American Standard Version", "ASV"),
	/**
	 * <b><u>DBT</u></b>
	 * <br>Darby Bible Translation
	 */
	DBT("Darby Bible Translation", "DBT"),
	/**
	 * <b><u>DRB</u></b>
	 * <br>Douay-Rheims Bible
	 */
	DRB("Douay-Rheims Bible", "DRB"),
	/**
	 * <b><u>ERV</u></b>
	 * <br>English Revised Version
	 */
	ERV("English Revised Version", "ERV"),
	/**
	 * <b><u>ESV</u></b>
	 * <br>English Standard Version
	 */
	ESV("English Standard Version", "ESV"),
	/**
	 * <b><u>GWT</u></b>
	 * <br>God's Word Translation
	 * <br>Uses "GOD's WORD&reg; Translation" for retrieving from BibleHub.com
	 */
	GWT("God's Word Translation", "GWT", "GOD'S WORD&reg; Translation"),
	/**
	 * <b><u>HCSB</u></b>
	 * <br>Holman Christian Standard Bible
	 */
	HCSB("Holman Christian Standard Bible", "HCSB"),
	/**
	 * <b><u>ISV</u></b>
	 * <br>International Standard Version
	 */
	ISV("International Standard Version", "ISV"),
	/**
	 * <b><u>JPS</u></b>
	 * <br>JPS Tanakh 1917
	 */
	JPS("JPS Tanakh 1917", "JPS"),
	/**
	 * <b><u>JUB</u></b>
	 * <br>Jubilee Bible 2000
	 */
	JUB("Jubilee Bible 2000", "JUB"),
	/**
	 * <b><u>KJV</u></b>
	 * <br>King James Version
	 * <br>Uses "King James Bible" for retrieving from BibleHub.com
	 */
	KJV("King James Version", "KJV", "King James Bible"),
	/**
	 * <b><u>KJV2000</u></b>
	 * <br>King James 2000 Bible
	 */
	KJ2000("King James 2000 Bible", "KJ2000"),
	/**
	 * <b><u>NASB</u></b>
	 * <br> New American Standard Bible
	 */
	NASB("New American Standard Bible", "NASB"),
	/**
	 * <b><u>NASB77</u></b>
	 * <br>New American Standard Bible 1977
	 * <br>Uses "New American Standard 1977" for retrieving from BibleHub.com
	 */
	NASB77("New American Standard Bible 1977", "NASB77", "New American Standard 1977"),
	/**
	 * <b><u>NET</u></b>
	 * <br>NET Bible
	 */
	NET("NET Bible", "NET"),
	/**
	 * <b><u>NHEB</u></b>
	 * <br>New Heart English Bible
	 */
	NHEB("New Heart English Bible", "NHEB"),
	/**
	 * <b><u>NIV</u></b>
	 * <br>New International Version
	 */
	NIV("New International Version", "NIV"),
	/**
	 * <b><u>NLT</u></b>
	 * <br>New Living Translation
	 */
	NLT("New Living Translation", "NLT"),
	/**
	 * <b><u>WBT</u></b>
	 * <br>Webster's Bible Translation
	 */
	WBT("Webster's Bible Translation", "WBT"),
	/**
	 * <b><u>WEB</u></b>
	 * <br>World English Bible
	 */
	WEB("World English Bible", "WEB"),
	/**
	 * <b><u>YLT</u></b>
	 * <br>Young's Literal Translation
	 */
	YLT("Young's Literal Translation", "YLT");
	
	/** The name of the translation */
	private String translation;
	/** The abbreviation for the translation */
	private String abbreviation;
	/** The string that needs to be matched to find the translation on BibleHub.com */
	private String siteString;
	
	/**
	 * Constructs an EnumTranslation with the given translation 
	 * name and abbreviation.
	 * <br>It will then using the translation name as the string to match on 
	 * BibleHub.com as well.
	 * 
	 * @param translation The name of the translation
	 * @param abbreviation The abbreviation for the translation
	 */
	private EnumTranslation(String translation, String abbreviation){
		this.translation = translation;
		this.abbreviation = abbreviation;
		siteString = translation;
	}
	
	/**
	 * Constructs an EnumTranslation with the given translation 
	 * name, abbreviation, and site string.
	 * <br>The site string is used to match against on BibleHub.com to find 
	 * the translation there among others.
	 * 
	 * @param translation The name of the translation
	 * @param abbreviation The abbreviation for the translation
	 * @param siteString The string to match against on BibleHub.com
	 */
	private EnumTranslation(String translation, String abbreviation, String siteString){
		this.translation = translation;
		this.abbreviation = abbreviation;
		this.siteString = siteString;
	}
	
	/**
	 * @return The name of the translation
	 */
	public String getTranslation(){
		return translation;
	}
	
	/**
	 * @return The abbreviation of the translation name
	 */
	public String getAbbreviation(){
		return abbreviation;
	}
	
	/**
	 * @return The string to match against on BibleHub.com
	 */
	public String getSiteString(){
		return siteString;
	}
	
	/**
	 * Find an EnumTranslation based on the translation name.
	 * 
	 * @param translation The translation name to find
	 * @return The found EnumTranslation, or null if none could be found
	 */
	public static EnumTranslation fromTranslation(String translation){
		// Search through the existing EnumTranslations for the translation name
		for(EnumTranslation tran: EnumTranslation.values()){
			if(tran.getTranslation().equalsIgnoreCase(translation)){
				return tran;
			}
		}
		
		// Return null if nothing matched
		return null;
	}
	
	/**
	 * Find an EnumTranslation based on the translation name's abbreviation.
	 * 
	 * @param abbreviation The abbreviation of the translation name to find
	 * @return The found EnumTranslation, or null if none could be found
	 */
	public static EnumTranslation fromAbbreviation(String abbreviation){
		// Search through the existing EnumTranslations for the abbreviation
		for(EnumTranslation tran: EnumTranslation.values()){
			if(tran.getAbbreviation().equalsIgnoreCase(abbreviation)){
				return tran;
			}
		}
		
		// Return null if nothing matched
		return null;
	}
}
