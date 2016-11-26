package com.gmail.realtadukoo.TB.Enums;

public enum EnumApocrypha{
	TOBIT("Tobit"),
	JUDITH("Judith"),
	ADDITIONS_TO_ESTHER("Additions to Esther"),
	MACCABEES1("1 Maccabees"),
	MACCABEES2("2 Maccabees"),
	WISDOM("Wisdom"),
	SIRACH("Sirach"),
	BARUCH("Baruch"),
	LETTER_OF_JEREMIAH("Letter of Jeremiah"),
	PRAYER_OF_AZARIAH_AND_SONG_OF_THREE_YOUNG_MEN(
			"Prayer of Azariah and the Song of the Three Young Men"),
	SUSANNA("Susanna"),
	BEL_AND_THE_DRAGON("Bel and the Dragon"),
	ESDRAS1("1 Esdras"),
	ESDRAS2("2 Esdras"),
	MACCABEES3("3 Maccabees"),
	MACCABEES4("4 Maccabees"),
	PSALM151("Psalm 151"),
	ODES("Odes"),
	PRAYER_OF_MANASSEH("Prayer of Manasseh"),
	BARUCH4("4 Baruch"),
	JUBILEES("Jubilees"),
	ENOCH("Enoch"),
	MEQABYAN1("1 Meqabyan"),
	MEQABYAN2("2 Meqabyan"),
	MEQABYAN3("3 Meqabyan");
	
	private String book;
	
	private EnumApocrypha(String book){
		this.book = book;
	}
	
	public String book(){
		return book;
	}
	
	public static EnumApocrypha fromString(String book){
		for(EnumApocrypha e: EnumApocrypha.values()){
			if(e.book().replaceAll(" ", "").equalsIgnoreCase(book.replaceAll(" ", ""))){
				return e;
			}
		}
		return null;
	}
}
