package com.gmail.realtadukoo.TB.Enums.Bible;

public enum EnumBibleAliases{
	GENESIS("Genesis", "Gen", "Ge"),
	EXODUS("Exodus", "Exo", "Ex"),
	LEVITICUS("Leviticus", "Lev", "Le"),
	NUMBERS("Numbers", "Num", "Nu"),
	DEUTERONOMY("Deuteronomy", "Deu", "De"),
	JOSHUA("Joshua", "Jos"),
	JUDGES("Judges", "Jud"),
	RUTH("Ruth", "Ru"),
	SAMUEL1("1 Samuel", "1Sam", "1Sa"),
	SAMUEL2("2 Samuel", "2Sam", "2Sa"),
	KINGS1("1 Kings", "1Ki"),
	KINGS2("2 Kings", "2Ki"),
	CHRONICLES1("1 Chronicles", "1Chron", "1Ch"),
	CHRONICLES2("2 Chronicles", "2Chron", "2Ch"),
	EZRA("Ezra", "Ezr"),
	NEHEMIAH("Nehemiah", "Neh", "Ne"),
	ESTHER("Esther", "Est", "Es"),
	JOB("Job"),
	PSALMS("Psalms", "Psalm", "Psa", "Ps"),
	PROVERBS("Proverbs", "Pro", "Pr"),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec"),
	SONGOFSONGS("Song of Songs", "Song of Solomon", "Song", "So"),
	ISAIAH("Isaiah", "Isa", "Is"),
	JEREMIAH("Jeremiah", "Jer", "Je"),
	LAMENTATIONS("Lamentations", "Lam", "La"),
	EZEKIEL("Ezekiel", "Eze"),
	DANIEL("Daniel", "Dan", "Da"),
	HOSEA("Hosea", "Hos", "Ho"),
	JOEL("Joel", "Joe"),
	AMOS("Amos", "Am"),
	OBADIAH("Obadiah", "Oba", "Ob"),
	JONAH("Jonah", "Jon"),
	MICAH("Micah", "Mic"),
	NAHUM("Nahum", "Nah", "Na"),
	HABAKKUK("Habakkuk", "Hab"),
	ZEPHANIAH("Zephaniah", "Zep"),
	HAGGAI("Haggai", "Hag"),
	ZECHARIAH("Zechariah", "Zec"),
	MALACHI("Malachi", "Mal"),
	MATTHEW("Matthew", "Mat", "Mt"),
	MARK("Mark", "Mr"),
	LUKE("Luke", "Lu"),
	JOHN("John", "Joh"),
	ACTS("Acts", "Ac"),
	ROMANS("Romans", "Rom", "Ro"),
	CORINTHIANS1("1 Corinthians", "1Cor", "1Co"),
	CORINTHIANS2("2 Corinthians", "2Cor", "2Co"),
	GALATIANS("Galatians", "Gal", "Ga"),
	EPHESIANS("Ephesians", "Eph"),
	PHILIPPIANS("Philippians", "Phili", "Php"),
	COLOSSIANS("Colossians", "Col"),
	THESSALONIANS1("1 Thessalonians", "1Thes", "1Th"),
	THESSALONIANS2("2 Thessalonians", "2Thes", "2Th"),
	TIMOTHY1("1 Timothy", "1Tim", "1Ti"),
	TIMOTHY2("2 Timothy", "2Tim", "2Ti"),
	TITUS("Titus", "Tit"),
	PHILEMON("Philemon", "Phile", "Phm"),
	HEBREWS("Hebrews", "Heb"),
	JAMES("James", "Jas"),
	PETER1("1 Peter", "1Pe"),
	PETER2("2 Peter", "2Pe"),
	JOHN1("1 John", "1Jo"),
	JOHN2("2 John", "2Jo"),
	JOHN3("3 John", "3Jo"),
	JUDE("Jude"),
	REVELATION("Revelation", "Rev", "Re");
	
	private String book;
	private String[] aliases;
	
	private EnumBibleAliases(String book, String ... aliases){
		this.book = book;
		this.aliases = aliases;
	}
	
	public static String getBookFromAlias(String alias){
		for(EnumBibleAliases e: EnumBibleAliases.values()){
			if(e.book.replaceAll(" ", "").equalsIgnoreCase(alias.replaceAll(" ", ""))){
				return e.book;
			}
			for(String s: e.aliases){
				if(s.replaceAll(" ", "").equalsIgnoreCase(alias.replaceAll(" ", ""))){
					return e.book;
				}
			}
		}
		return null;
	}
}
