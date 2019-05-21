package com.gmail.realtadukoo.TB.Bible;

public enum EnumTranslations{
	AKJV("American King James Version", "AKJV"),
	ASV("American Standard Version", "ASV"),
	DBT("Darby Bible Translation", "DBT"),
	DRB("Douay-Rheims Bible", "DRB"),
	ERV("English Revised Version", "ERV"),
	ESV("English Standard Version", "ESV"),
	// This has weird formatting so it can be retrieved from biblehub.com
	GWT("GOD'S WORD&reg; Translation", "GWT"),
	HCSB("Holman Christian Standard Bible", "HCSB"),
	ISV("International Standard Version", "ISV"),
	JPS("JPS Tanakh 1917", "JPS"),
	JUB("Jubilee Bible 2000", "JUB"),
	// Although KJV is for version, biblehub.com uses Bible instead.
	KJV("King James Bible", "KJV"),
	KJ2000("King James 2000 Bible", "KJ2000"),
	NASB("New American Standard Bible", "NASB"),
	NASB77("New American Standard 1977", "NASB77"),
	NET("NET Bible", "NET"),
	NHEB("New Heart English Bible", "NHEB"),
	NIV("New International Version", "NIV"),
	NLT("New Living Translation", "NLT"),
	WBT("Webster's Bible Translation", "WBT"),
	WEB("World English Bible", "WEB"),
	YLT("Young's Literal Translation", "YLT");
	
	private String tran;
	private String abbreviation;
	
	private EnumTranslations(String name, String abbreviation){
		this.tran = name;
		this.abbreviation = abbreviation;
	}
	
	public String getName(){
		return tran;
	}
	
	public String getAbbreviation(){
		return abbreviation;
	}
	
	public static EnumTranslations fromAbbreviation(String abbreviation){
		for(EnumTranslations e: EnumTranslations.values()){
			if(e.getAbbreviation().equalsIgnoreCase(abbreviation)){
				return e;
			}
		}
		return null;
	}
}
