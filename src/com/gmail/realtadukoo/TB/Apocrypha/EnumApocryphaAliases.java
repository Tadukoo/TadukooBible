package com.gmail.realtadukoo.TB.Apocrypha;

public enum EnumApocryphaAliases{
	TOBIT("Tobit", "Tobias"),
	JUDITH("Judith"),
	ADDITIONS_TO_ESTHER("Additions to Esther"),
	MACCABEES1("1 Maccabees", "1 Machabees"),
	MACCABEES2("2 Maccabees", "2 Machabees"),
	WISDOM("Wisdom"),
	SIRACH("Sirach", "Ecclesiasticus"),
	BARUCH("Baruch"),
	LETTER_OF_JEREMIAH("Letter of Jeremiah", "Letter of Baruch"),
	PRAYER_OF_AZARIAH_AND_SONG_OF_THREE_YOUNG_MEN(
			"Prayer of Azariah and the Song of the Three Young Men"),
	SUSANNA("Susanna"),
	BEL_AND_THE_DRAGON("Bel and the Dragon"),
	ESDRAS1("1 Esdras", "3 Esdras", "3 Ezra"),
	ESDRAS2("2 Esdras", "4 Esdras", "4 Ezra", "5 Ezra", "6 Ezra"),
	MACCABEES3("3 Maccabees", "3 Machabees"),
	MACCABEES4("4 Maccabees", "4 Machabees"),
	PSALM151("Psalm 151"),
	ODES("Odes"),
	PRAYER_OF_MANASSEH("Prayer of Manasseh"),
	BARUCH4("4 Baruch", "Rest of Baruch", "Paralipomena of Jeremiah"),
	JUBILEES("Jubilees"),
	ENOCH("Enoch", "1 Enoch"),
	MEQABYAN1("1 Meqabyan"),
	MEQABYAN2("2 Meqabyan"),
	MEQABYAN3("3 Meqabyan");
	
	private String book;
	private String[] aliases;
	
	private EnumApocryphaAliases(String book, String ... aliases){
		this.book = book;
		this.aliases = aliases;
	}
	
	public static String getBookFromAlias(String alias){
		for(EnumApocryphaAliases e: EnumApocryphaAliases.values()){
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
