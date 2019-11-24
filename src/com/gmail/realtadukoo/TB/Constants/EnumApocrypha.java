package com.gmail.realtadukoo.TB.Constants;

/**
 * Contains information about the books in the Apocrypha, Deuterocanon, 
 * Pseudepigrapha, etc.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT
 */
public enum EnumApocrypha{
	/**
	 * <b><u>Tobit</u></b>
	 * <br>Aliases: Tobias
	 */
	TOBIT("Tobit",
			new String[]{"Tobias"}),
	/**
	 * <b><u>Judith</u></b>
	 * <br>Aliases: None
	 */
	JUDITH("Judith"),
	/**
	 * <b><u>Additions to Esther</u></b>
	 * <br>Aliases: None
	 */
	ADDITIONS_TO_ESTHER("Additions to Esther"),
	/**
	 * <b><u>1 Maccabees</u></b>
	 * <br>Aliases: 1 Machabees
	 */
	FIRST_MACCABEES("1 Maccabees",
			new String[]{"1 Machabees"}),
	/**
	 * <b><u>2 Maccabees</u></b>
	 * <br>Aliases: 2 Machabees
	 */
	SECOND_MACCABEES("2 Maccabees",
			new String[]{"2 Machabees"}),
	/**
	 * <b><u>Wisdom</u></b>
	 * <br>Aliases: None
	 */
	WISDOM("Wisdom"),
	/**
	 * <b><u>Sirach</u></b>
	 * <br>Aliases: Ecclesiasticus
	 */
	SIRACH("Sirach",
			new String[]{"Ecclesiasticus"}),
	/**
	 * <b><u>Baruch</u></b>
	 * <br>Aliases: None
	 */
	BARUCH("Baruch"),
	/**
	 * <b><u>Letter of Jeremiah</u></b>
	 * <br>Aliases: Letter of Baruch
	 */
	LETTER_OF_JEREMIAH("Letter of Jeremiah",
			new String[]{"Letter of Baruch"}),
	/**
	 * <b><u>Prayer of Azariah and the Song of the Three Young Men</u></b>
	 * <br>Aliases: None
	 */
	PRAYER_OF_AZARIAH_AND_SONG_OF_THREE_YOUNG_MEN(
			"Prayer of Azariah and the Song of the Three Young Men"),
	/**
	 * <b><u>Susanna</u></b>
	 * <br>Aliases: None
	 */
	SUSANNA("Susanna"),
	/**
	 * <b><u>Bel and the Dragon</u></b>
	 * <br>Aliases: None
	 */
	BEL_AND_THE_DRAGON("Bel and the Dragon"),
	/**
	 * <b><u>1 Esdras</u></b>
	 * <br>Aliases: 3 Esdras, 3 Ezra
	 */
	FIRST_ESDRAS("1 Esdras",
			new String[]{"3 Esdras", "3 Ezra"}),
	/**
	 * <b><u>2 Esdras</u></b>
	 * <br>Aliases: 4 Esdras, 4 Ezra, 5 Ezra, 6 Ezra
	 */
	SECOND_ESDRAS("2 Esdras",
			new String[]{"4 Esdras", "4 Ezra", "5 Ezra", "6 Ezra"}),
	/**
	 * <b><u>3 Maccabees</u></b>
	 * <br>Aliases: 3 Machabees
	 */
	THIRD_MACCABEES("3 Maccabees",
			new String[]{"3 Machabees"}),
	/**
	 * <b><u>4 Maccabees</u></b>
	 * <br>Aliases: 4 Machabees
	 */
	FOURTH_MACCABEES("4 Maccabees",
			new String[]{"4 Machabees"}),
	/**
	 * <b><u>Psalm 151</u></b>
	 * <br>Aliases: None
	 */
	PSALM_151("Psalm 151"),
	/**
	 * <b><u>Odes</u></b>
	 * <br>Aliases: None
	 */
	ODES("Odes"),
	/**
	 * <b><u>Prayer of Manasseh</u></b>
	 * <br>Aliases: None
	 */
	PRAYER_OF_MANASSEH("Prayer of Manasseh"),
	/**
	 * <b><u>4 Baruch</u></b>
	 * <br>Aliases: Rest of Baruch, Paralipomena of Jeremiah
	 */
	FOURTH_BARUCH("4 Baruch",
			new String[]{"Rest of Baruch", "Paralipomena of Jeremiah"}),
	/**
	 * <b><u>Jubilees</u></b>
	 * <br>Aliases: None
	 */
	JUBILEES("Jubilees"),
	/**
	 * <b><u>Enoch</u></b>
	 * <br>Aliases: 1 Enoch
	 */
	ENOCH("Enoch",
			new String[]{"1 Enoch"}),
	/**
	 * <b><u>1 Meqabyan</u></b>
	 * <br>Aliases: None
	 */
	FIRST_MEQABYAN("1 Meqabyan"),
	/**
	 * <b><u>2 Meqabyan</u></b>
	 * <br>Aliases: None
	 */
	SECOND_MEQABYAN("2 Meqabyan"),
	/**
	 * <b><u>3 Meqabyan</u></b>
	 * <br>Aliases: None
	 */
	THIRD_MEQABYAN("3 Meqabyan");
	
	private String book;
	private String[] aliases;
	
	private EnumApocrypha(String book){
		this.book = book;
		aliases = new String[0];
	}
	
	private EnumApocrypha(String book, String[] aliases){
		this.book = book;
		this.aliases = aliases;
	}
	
	public String getBook(){
		return book;
	}
	
	public String[] getAliases(){
		return aliases;
	}
	
	public static EnumApocrypha fromBook(String book){
		for(EnumApocrypha e: EnumApocrypha.values()){
			if(e.getBook().equalsIgnoreCase(book)){
				return e;
			}
		}
		return null;
	}
	
	public static EnumApocrypha fromString(String text){
		for(EnumApocrypha e: EnumApocrypha.values()){
			if(e.getBook().equalsIgnoreCase(text)){
				return e;
			}
			for(String alias: e.getAliases()){
				if(alias.equalsIgnoreCase(text)){
					return e;
				}
			}
		}
		return null;
	}
	
	public static EnumApocrypha fromInt(int i){
		for(EnumApocrypha e: EnumApocrypha.values()){
			if(e.ordinal() == i - 1){
				return e;
			}
		}
		return null;
	}
}
