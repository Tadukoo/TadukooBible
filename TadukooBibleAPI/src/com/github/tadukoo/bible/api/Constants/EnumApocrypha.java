package com.github.tadukoo.bible.api.Constants;

import com.github.tadukoo.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

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
			ListUtil.createList("Tobias")),
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
			ListUtil.createList("1 Machabees")),
	/**
	 * <b><u>2 Maccabees</u></b>
	 * <br>Aliases: 2 Machabees
	 */
	SECOND_MACCABEES("2 Maccabees",
			ListUtil.createList("2 Machabees")),
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
			ListUtil.createList("Ecclesiasticus")),
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
			ListUtil.createList("Letter of Baruch")),
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
			ListUtil.createList("3 Esdras", "3 Ezra")),
	/**
	 * <b><u>2 Esdras</u></b>
	 * <br>Aliases: 4 Esdras, 4 Ezra, 5 Ezra, 6 Ezra
	 */
	SECOND_ESDRAS("2 Esdras",
			ListUtil.createList("4 Esdras", "4 Ezra", "5 Ezra", "6 Ezra")),
	/**
	 * <b><u>3 Maccabees</u></b>
	 * <br>Aliases: 3 Machabees
	 */
	THIRD_MACCABEES("3 Maccabees",
			ListUtil.createList("3 Machabees")),
	/**
	 * <b><u>4 Maccabees</u></b>
	 * <br>Aliases: 4 Machabees
	 */
	FOURTH_MACCABEES("4 Maccabees",
			ListUtil.createList("4 Machabees")),
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
			ListUtil.createList("Rest of Baruch", "Paralipomena of Jeremiah")),
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
			ListUtil.createList("1 Enoch")),
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
	
	/** The name of the book */
	private final String name;
	/** A list of aliases for the book */
	private final List<String> aliases;
	
	/**
	 * Constructs an EnumApocrypha with the given book name.
	 * <br>Aliases is initialized as an empty list (since there are
	 * no aliases).
	 * 
	 * @param name The name of the book
	 */
	EnumApocrypha(String name){
		this.name = name;
		aliases = new ArrayList<>();
	}
	
	/**
	 * Constructs an EnumApocrypha with the given book name and aliases.
	 * 
	 * @param name The name of the book
	 * @param aliases The aliases of this book
	 */
	EnumApocrypha(String name, List<String> aliases){
		this.name = name;
		this.aliases = aliases;
	}
	
	/**
	 * @return The name of this book
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return The list of aliases for this book
	 */
	public List<String> getAliases(){
		return aliases;
	}
	
	/**
	 * Find an EnumApocrypha based on the book name.
	 * 
	 * @param bookName The book name to find
	 * @return The found EnumApocrypha, or null if none could be found
	 */
	public static EnumApocrypha fromBook(String bookName){
		// Search through the existing EnumApocryphas for the book name
		for(EnumApocrypha book: EnumApocrypha.values()){
			if(book.getName().equalsIgnoreCase(bookName)){
				return book;
			}
		}
		
		// Return null if nothing matched
		return null;
	}
	
	/**
	 * Find an EnumApocrypha based on text that may be the book name or an alias.
	 * 
	 * @param text The text to find
	 * @return The found EnumApocrypha, or null if none could be found
	 */
	public static EnumApocrypha fromString(String text){
		// Search through the existing EnumApocrypha values for the text
		for(EnumApocrypha book: EnumApocrypha.values()){
			// Check against the book name
			if(book.getName().equalsIgnoreCase(text)){
				return book;
			}
			// Check against the aliases
			for(String alias: book.aliases){
				if(alias.equalsIgnoreCase(text)){
					return book;
				}
			}
		}
		
		// Return null if nothing matched
		return null;
	}
	
	public static EnumApocrypha fromInt(int i){
		// TODO: Add range check
		// Return the EnumApocrypha book corresponding to the given book number
		return EnumApocrypha.values()[i+1];
	}
}
