package com.gmail.realtadukoo.TB.Enums;

public enum EnumBible{
	GENESIS("Genesis", "Moses"),
	EXODUS("Exodus", "Moses"),
	LEVITICUS("Leviticus", "Moses"),
	NUMBERS("Numbers", "Moses"),
	DEUTERONOMY("Deuteronomy", "Moses"),
	JOSHUA("Joshua", "Joshua"),
	JUDGES("Judges", "Samuel"),
	RUTH("Ruth", "Samuel"),
	SAMUEL1("1 Samuel", "Unknown"),
	SAMUEL2("2 Samuel", "Unknown"),
	KINGS1("1 Kings", "Unknown"),
	KINGS2("2 Kings", "Unknown"),
	CHRONICLES1("1 Chronicles", "Ezra"),
	CHRONICLES2("2 Chronicles", "Ezra"),
	EZRA("Ezra", "Ezra"),
	NEHEMIAH("Nehemiah", "Ezra"),
	ESTHER("Esther", "Unknown"),
	JOB("Job", "Unknown"),
	PSALMS("Psalms", "Many people"),
	PROVERBS("Proverbs", "Solomon"),
	ECCLESIASTES("Ecclesiastes", "Solomon"),
	SONGOFSONGS("Song of Songs", "Solomon"),
	ISAIAH("Isaiah", "Isaiah"),
	JEREMIAH("Jeremiah", "Jeremiah"),
	LAMENTATIONS("Lamentations", "Jeremiah"),
	EZEKIEL("Ezekiel", "Ezekiel"),
	DANIEL("Daniel", "Daniel"),
	HOSEA("Hosea", "Hosea"),
	JOEL("Joel", "Joel"),
	AMOS("Amos", "Amos"),
	OBADIAH("Obadiah", "Obadiah"),
	JONAH("Jonah", "Jonah"),
	MICAH("Micah", "Micah"),
	NAHUM("Nahum", "Nahum"),
	HABAKKUK("Habakkuk", "Habakkuk"),
	ZEPHANIAH("Zephaniah", "Zephaniah"),
	HAGGAI("Haggai", "Haggai"),
	ZECHARIAH("Zechariah", "Zechariah"),
	MALACHI("Malachi", "Malachi"),
	MATTHEW("Matthew", "Matthew"),
	MARK("Mark", "John Mark"),
	LUKE("Luke", "Luke"),
	JOHN("John", "John"),
	ACTS("Acts", "Luke"),
	ROMANS("Romans", "Paul"),
	CORINTHIANS1("1 Corinthians", "Paul"),
	CORINTHIANS2("2 Corinthians", "Paul"),
	GALATIANS("Galatians", "Paul"),
	EPHESIANS("Ephesians", "Paul"),
	PHILIPPIANS("Philippians", "Paul"),
	COLOSSIANS("Colossians", "Paul"),
	THESSALONIANS1("1 Thessalonians", "Paul"),
	THESSALONIANS2("2 Thessalonians", "Paul"),
	TIMOTHY1("1 Timothy", "Paul"),
	TIMOTHY2("2 Timothy", "Paul"),
	TITUS("Titus", "Paul"),
	PHILEMON("Philemon", "Paul"),
	HEBREWS("Hebrews", "Unknown"),
	JAMES("James", "James"),
	PETER1("1 Peter", "Peter"),
	PETER2("2 Peter", "Peter"),
	JOHN1("1 John", "John"),
	JOHN2("2 John", "John"),
	JOHN3("3 John", "John"),
	JUDE("Jude", "Jude"),
	REVELATION("Revelation", "John");
	
	private String book;
	private String author;
	
	private EnumBible(String book, String author){
		this.book = book;
		this.author = author;
	}
	
	public String book(){
		return book;
	}
	
	public String author(){
		return author;
	}
	
	public static EnumBible fromString(String name){
		for(EnumBible e: EnumBible.values()){
			if(e.book().replaceAll(" ", "").equalsIgnoreCase(name.replaceAll(" ", ""))){
				return e;
			}
		}
		return null;
	}
	
	public static EnumBible fromInt(int i){
		for(EnumBible e: EnumBible.values()){
			if(e.ordinal() == i - 1){
				return e;
			}
		}
		return null;
	}
}
