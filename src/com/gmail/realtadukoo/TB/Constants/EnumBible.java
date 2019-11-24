package com.gmail.realtadukoo.TB.Constants;

/**
 * Contains information about the books of the Bible.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT (Definitely earlier)
 */
public enum EnumBible{
	/*
	 * =================
	 * The Old Testament
	 * =================
	 */
	
	/*
	 * The Pentateuch (1st 5 Books, traditionally believed to be written by Moses)
	 */
	
	/**
	 * <b><u>Genesis</u></b>
	 * <br>Author: Moses
	 * <br>Aliases: Gen, Ge
	 * <br>50 Chapters
	 */
	GENESIS("Genesis", "Moses", 
			new String[]{"Gen", "Ge"},
			new int[]{
					31, 25, 24, 26, 32, 22, 24, 22, 29, 32, 
					32, 20, 18, 24, 21, 16, 27, 33, 38, 18, 
					34, 24, 20, 67, 34, 35, 46, 22, 35, 43, 
					55, 32, 20, 31, 29, 43, 36, 30, 23, 23, 
					57, 38, 34, 34, 28, 34, 31, 22, 33, 26
			}),
	/**
	 * <b><u>Exodus</u></b>
	 * <br>Author: Moses
	 * <br>Aliases: Exo, Ex
	 * <br>40 Chapters
	 */
	EXODUS("Exodus", "Moses",
			new String[]{"Exo", "Ex"},
			new int[]{
					22, 25, 22, 31, 23, 30, 25, 32, 35, 29, 
					10, 51, 22, 31, 27, 36, 16, 27, 25, 26, 
					36, 31, 33, 18, 40, 37, 21, 43, 46, 38, 
					18, 35, 23, 35, 35, 38, 29, 31, 43, 38
			}),
	/**
	 * <b><u>Leviticus</u></b>
	 * <br>Author: Moses
	 * <br>Aliases: Lev, Le
	 * <br>27 Chapters
	 */
	LEVITICUS("Leviticus", "Moses",
			new String[]{"Lev", "Le"},
			new int[]{
					17, 16, 17, 35, 19, 30, 38, 36, 24, 20, 
					47, 8, 59, 57, 33, 34, 16, 30, 37, 27, 
					24, 33, 44, 23, 55, 46, 34
			}),
	/**
	 * <b><u>Numbers</u></b>
	 * <br>Author: Moses
	 * <br>Aliases: Num, Nu
	 * <br>36 Chapters
	 */
	NUMBERS("Numbers", "Moses",
			new String[]{"Num", "Nu"},
			new int[]{
					54, 34, 51, 49, 31, 27, 89, 26, 23, 36, 
					35, 16, 33, 45, 41, 50, 13, 32, 22, 29, 
					35, 41, 30, 25, 18, 65, 23, 31, 40, 16, 
					54, 42, 56, 29, 34, 13
			}),
	/**
	 * <b><u>Deuteronomy</u></b>
	 * <br>Author: Moses
	 * <br>Aliases: Deu, De
	 * <br>34 Chapters
	 */
	DEUTERONOMY("Deuteronomy", "Moses",
			new String[]{"Deu", "De"},
			new int[]{
					46, 37, 29, 49, 33, 25, 26, 20, 29, 22, 
					32, 32, 18, 29, 23, 22, 20, 22, 21, 20, 
					23, 30, 25, 22, 19, 19, 26, 68, 29, 20, 
					30, 52, 29, 12
			}),
	
	/*
	 * History Books
	 */
	
	/**
	 * <b><u>Joshua</u></b>
	 * <br>Author: Joshua
	 * <br>Aliases: Jos
	 * <br>24 Chapters
	 */
	JOSHUA("Joshua", "Joshua",
			new String[]{"Jos"},
			new int[]{
					18, 24, 17, 24, 15, 27, 26, 35, 27, 43, 
					23, 24, 33, 15, 63, 10, 18, 28, 51, 9, 
					45, 34, 16, 33
			}),
	/**
	 * <b><u>Judges</u></b>
	 * <br>Author: Samuel
	 * <br>Aliases: Jud
	 * <br>21 Chapters
	 */
	JUDGES("Judges", "Samuel",
			new String[]{"Jud"},
			new int[]{
					36, 23, 31, 24, 31, 40, 25, 35, 57, 18, 
					40, 15, 25, 20, 20, 31, 13, 31, 30, 48, 
					25
			}),
	/**
	 * <b><u>Ruth</u></b>
	 * <br>Author: Samuel
	 * <br>Aliases: Ru
	 * <br>4 Chapters
	 */
	RUTH("Ruth", "Samuel",
			new String[]{"Ru"},
			new int[]{
					22, 23, 18, 22
			}),
	/**
	 * <b><u>1 Samuel</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: 1Sam, 1Sa
	 * <br>31 Chapters
	 */
	FIRST_SAMUEL("1 Samuel", "Unknown",
			new String[]{"1Sam", "1Sa"},
			new int[]{
					28, 36, 21, 22, 12, 21, 17, 22, 27, 27, 
					15, 25, 23, 52, 35, 23, 58, 30, 24, 42, 
					15, 23, 29, 22, 44, 25, 12, 25, 11, 31, 
					13
			}),
	/**
	 * <b><u>2 Samuel</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: 2Sam, 2Sa
	 * <br>24 Chapters
	 */
	SECOND_SAMUEL("2 Samuel", "Unknown",
			new String[]{"2Sam", "2Sa"},
			new int[]{
					27, 32, 39, 12, 25, 23, 29, 18, 13, 19, 
					27, 31, 39, 33, 37, 23, 29, 33, 43, 26, 
					22, 51, 39, 25
			}),
	/**
	 * <b><u>1 Kings</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: 1Ki
	 * <br>22 Chapters
	 */
	FIRST_KINGS("1 Kings", "Unknown",
			new String[]{"1Ki"},
			new int[]{
					53, 46, 28, 34, 18, 38, 51, 66, 28, 29, 
					43, 33, 34, 31, 34, 34, 24, 46, 21, 43, 
					29, 53
			}),
	/**
	 * <b><u>2 Kings</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: 2Ki
	 * <br>25 Chapters
	 */
	SECOND_KINGS("2 Kings", "Unknown",
			new String[]{"2Ki"},
			new int[]{
					18, 25, 27, 44, 27, 33, 20, 29, 37, 36, 
					21, 21, 25, 29, 38, 20, 41, 37, 37, 21, 
					26, 20, 37, 20, 30
			}),
	/**
	 * <b><u>1 Chronicles</u></b>
	 * <br>Author: Ezra
	 * <br>Aliases: 1Chron, 1Ch
	 * <br>29 Chapters
	 */
	FIRST_CHRONICLES("1 Chronicles", "Ezra",
			new String[]{"1Chron", "1Ch"},
			new int[]{
					54, 55, 24, 43, 26, 81, 40, 40, 44, 14, 
					47, 40, 14, 17, 29, 43, 27, 17, 19, 8, 
					30, 19, 32, 31, 31, 32, 34, 21, 30
			}),
	/**
	 * <b><u>2 Chronicles</u></b>
	 * <br>Author: Ezra
	 * <br>Aliases: 2Chron, 2Ch
	 * <br>36 Chapters
	 */
	SECOND_CHRONICLES("2 Chronicles", "Ezra",
			new String[]{"2Chron", "2Ch"},
			new int[]{
					17, 18, 17, 22, 14, 42, 22, 18, 31, 19, 
					23, 16, 22, 15, 19, 14, 19, 34, 11, 37, 
					20, 12, 21, 27, 28, 23, 9, 27, 36, 27, 
					21, 33, 25, 33, 27, 23
			}),
	/**
	 * <b><u>Ezra</u></b>
	 * <br>Author: Ezra
	 * <br>Aliases: Ezr
	 * <br>10 Chapters
	 */
	EZRA("Ezra", "Ezra",
			new String[]{"Ezr"},
			new int[]{
					11, 70, 13, 24, 17, 22, 28, 36, 15, 44
			}),
	/**
	 * <b><u>Nehemiah</u></b>
	 * <br>Author: Ezra
	 * <br>Aliases: Neh, Ne
	 * <br>13 Chapters
	 */
	NEHEMIAH("Nehemiah", "Ezra",
			new String[]{"Neh", "Ne"},
			new int[]{
					11, 20, 32, 23, 19, 19, 73, 18, 38, 39, 
					36, 47, 31
			}),
	/**
	 * <b><u>Esther</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: Est, Es
	 * <br>10 Chapters
	 */
	ESTHER("Esther", "Unknown",
			new String[]{"Est", "Es"},
			new int[]{
					22, 23, 15, 17, 14, 14, 10, 17, 32, 3
			}),
	
	/*
	 * Poetry and Writings
	 */
	
	/**
	 * <b><u>Job</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: None
	 * <br>42 Chapters
	 */
	JOB("Job", "Unknown", 
			new int[]{
					22, 13, 26, 21, 27, 30, 21, 22, 35, 22, 
					20, 25, 28, 22, 35, 22, 16, 21, 29, 29, 
					34, 30, 17, 25, 6, 14, 23, 28, 25, 31, 
					40, 22, 33, 37, 16, 33, 24, 41, 30, 24, 
					34, 17
			}),
	/**
	 * <b><u>Psalms</u></b>
	 * <br>Author: Many people
	 * <br>Aliases: Psalm, Psa, Ps
	 * <br>150 Chapters
	 */
	PSALMS("Psalms", "Many people",
			new String[]{"Psalm", "Psa", "Ps"},
			new int[]{
					6, 12, 8, 8, 12, 10, 17, 9, 20, 18, 
					7, 8, 6, 7, 5, 11, 15, 50, 14, 9, 
					13, 31, 6, 10, 22, 12, 14, 9, 11, 12, 
					24, 11, 22, 22, 28, 12, 40, 22, 13, 17, 
					13, 11, 5, 26, 17, 11, 9, 14, 20, 23, //50
					19, 9, 6, 7, 23, 13, 11, 11, 17, 12, 
					8, 12, 11, 10, 13, 20, 7, 35, 36, 5, 
					24, 20, 28, 23, 10, 12, 20, 72, 13, 19, 
					16, 8, 18, 12, 13, 17, 7, 18, 52, 17, 
					16, 15, 5, 23, 11, 13, 12, 9, 9, 5, //100
					8, 28, 22, 35, 45, 48, 43, 13, 31, 7, 
					10, 10, 9, 8, 18, 19, 2, 29, 176, 7, 
					8, 9, 4, 8, 5, 6, 5, 6, 8, 8, 
					3, 18, 3, 3, 21, 26, 9, 8, 24, 13, 
					10, 7, 12, 15, 21, 10, 20, 14, 9, 6
			}),
	/**
	 * <b><u>Proverbs</u></b>
	 * <br>Author: Solomon
	 * <br>Aliases: Pro, Pr
	 * <br>31 Chapters
	 */
	PROVERBS("Proverbs", "Solomon",
			new String[]{"Pro", "Pr"},
			new int[]{
					33, 22, 35, 27, 23, 35, 27, 36, 18, 32, 
					31, 28, 25, 35, 33, 33, 28, 24, 29, 30, 
					31, 29, 35, 34, 28, 28, 27, 28, 27, 33, 
					31
			}),
	/**
	 * <b><u>Ecclesiastes</u></b>
	 * <br>Author: Solomon
	 * <br>Aliases: Ecc, Ec
	 * <br>12 Chapters
	 */
	ECCLESIASTES("Ecclesiastes", "Solomon",
			new String[]{"Ecc", "Ec"},
			new int[]{
					18, 26, 22, 16, 20, 12, 29, 17, 18, 20, 
					10, 14
			}),
	/**
	 * <b><u>Song of Songs</u></b>
	 * <br>Author: Solomon
	 * <br>Aliases: Song of Solomon, Song, So
	 * <br>8 Chapters
	 */
	SONG_OF_SONGS("Song of Songs", "Solomon",
			new String[]{"Song of Solomon", "Song", "So"},
			new int[]{
					17, 17, 11, 16, 16, 13, 13, 14
			}),
	
	/*
	 * Major Prophets
	 */
	
	/**
	 * <b><u>Isaiah</u></b>
	 * <br>Author: Isaiah
	 * <br>Aliases: Isa, Is
	 * <br>66 Chapters
	 */
	ISAIAH("Isaiah", "Isaiah",
			new String[]{"Isa", "Is"},
			new int[]{
					31, 22, 26, 6, 30, 13, 25, 22, 21, 34, 
					16, 6, 22, 32, 9, 14, 14, 7, 25, 6, 
					17, 25, 18, 23, 12, 21, 13, 29, 24, 33, 
					9, 20, 24, 17, 10, 22, 38, 22, 8, 31, 
					29, 25, 28, 28, 25, 13, 15, 22, 26, 11, 
					23, 15, 12, 17, 13, 12, 21, 14, 21, 22, 
					11, 12, 19, 12, 25, 24
			}),
	/**
	 * <b><u>Jeremiah</u></b>
	 * <br>Author: Jeremiah
	 * <br>Aliases: Jer, Je
	 * <br>52 Chapters
	 */
	JEREMIAH("Jeremiah", "Jeremiah",
			new String[]{"Jer", "Je"},
			new int[]{
					19, 37, 25, 31, 31, 30, 34, 22, 26, 25, 
					23, 17, 27, 22, 21, 21, 27, 23, 15, 18, 
					14, 30, 40, 10, 38, 24, 22, 17, 32, 24, 
					40, 44, 26, 22, 19, 32, 21, 28, 18, 16, 
					18, 22, 13, 30, 5, 28, 7, 47, 39, 46, 
					64, 34
			}),
	/**
	 * <b><u>Lamentations</u></b>
	 * <br>Author: Jeremiah
	 * <br>Aliases: Lam, La
	 * <br>5 Chapters
	 */
	LAMENTATIONS("Lamentations", "Jeremiah",
			new String[]{"Lam", "La"},
			new int[]{
					22, 22, 66, 22, 22
			}),
	/**
	 * <b><u>Ezekiel</u></b>
	 * <br>Author: Ezekiel
	 * <br>Aliases: Eze
	 * <br>48 Chapters
	 */
	EZEKIEL("Ezekiel", "Ezekiel",
			new String[]{"Eze"},
			new int[]{
					28, 10, 27, 17, 17, 14, 27, 18, 11, 22, 
					25, 28, 23, 23, 8, 63, 24, 32, 14, 49, 
					32, 31, 49, 27, 17, 21, 36, 26, 21, 26, 
					18, 32, 33, 31, 15, 38, 28, 23, 29, 49, 
					26, 20, 27, 31, 25, 24, 23, 35
			}),
	/**
	 * <b><u>Daniel</u></b>
	 * <br>Author: Daniel
	 * <br>Aliases: Dan, Da
	 * <br>12 Chapters
	 */
	DANIEL("Daniel", "Daniel",
			new String[]{"Dan", "Da"},
			new int[]{
					21, 49, 30, 37, 31, 28, 28, 27, 27, 21, 
					45, 13
			}),
	
	/*
	 * Minor Prophets
	 */
	
	/**
	 * <b><u>Hosea</u></b>
	 * <br>Author: Hosea
	 * <br>Aliases: Hos, Ho
	 * <br>14 Chapters
	 */
	HOSEA("Hosea", "Hosea",
			new String[]{"Hos", "Ho"},
			new int[]{
					11, 23, 5, 19, 15, 11, 16, 14, 17, 15, 
					12, 14, 16, 9
			}),
	/**
	 * <b><u>Joel</u></b>
	 * <br>Author: Joel
	 * <br>Aliases: Joe
	 * <br>3 Chapters
	 */
	JOEL("Joel", "Joel",
			new String[]{"Joe"},
			new int[]{
					20, 32, 21
			}),
	/**
	 * <b><u>Amos</u></b>
	 * <br>Author: Amos
	 * <br>Aliases: Am
	 * <br>9 Chapters
	 */
	AMOS("Amos", "Amos",
			new String[]{"Am"},
			new int[]{
					15, 16, 15, 13, 27, 14, 17, 14, 15
			}),
	/**
	 * <b><u>Obadiah</u></b>
	 * <br>Author: Obadiah
	 * <br>Aliases: Oba, Ob
	 * <br>1 Chapter
	 */
	OBADIAH("Obadiah", "Obadiah",
			new String[]{"Oba", "Ob"},
			new int[]{
					21
			}),
	/**
	 * <b><u>Jonah</u></b>
	 * <br>Author: Jonah
	 * <br>Aliases: Jon
	 * <br>4 Chapters
	 */
	JONAH("Jonah", "Jonah",
			new String[]{"Jon"},
			new int[]{
					17, 10, 10, 11
			}),
	/**
	 * <b><u>Micah</u></b>
	 * <br>Author: Micah
	 * <br>Aliases: Mic
	 * <br>7 Chapters
	 */
	MICAH("Micah", "Micah",
			new String[]{"Mic"},
			new int[]{
					16, 13, 12, 13, 15, 16, 20
			}),
	/**
	 * <b><u>Nahum</u></b>
	 * <br>Author: Nahum
	 * <br>Aliases: Nah, Na
	 * <br>3 Chapters
	 */
	NAHUM("Nahum", "Nahum",
			new String[]{"Nah", "Na"},
			new int[]{
					15, 13, 19
			}),
	/**
	 * <b><u>Habakkuk</u></b>
	 * <br>Author: Habakkuk
	 * <br>Aliases: Hab
	 * <br>3 Chapters
	 */
	HABAKKUK("Habakkuk", "Habakkuk",
			new String[]{"Hab"},
			new int[]{
					17, 20, 19
			}),
	/**
	 * <b><u>Zephaniah</u></b>
	 * <br>Author: Zephaniah
	 * <br>Aliases: Zep
	 * <br>3 Chapters
	 */
	ZEPHANIAH("Zephaniah", "Zephaniah",
			new String[]{"Zep"},
			new int[]{
					18, 15, 20
			}),
	/**
	 * <b><u>Haggai</u></b>
	 * <br>Author: Haggai
	 * <br>Aliases: Hag
	 * <br>2 Chapters
	 */
	HAGGAI("Haggai", "Haggai",
			new String[]{"Hag"},
			new int[]{
					15, 23
			}),
	/**
	 * <b><u>Zechariah</u></b>
	 * <br>Author: Zechariah
	 * <br>Aliases: Zec
	 * <br>14 Chapters
	 */
	ZECHARIAH("Zechariah", "Zechariah",
			new String[]{"Zec"},
			new int[]{
					21, 13, 10, 14, 11, 15, 14, 23, 17, 12, 
					17, 14, 9, 21
			}),
	/**
	 * <b><u>Malachi</u></b>
	 * <br>Author: Malachi
	 * <br>Aliases: Mal
	 * <br>4 Chapters
	 */
	MALACHI("Malachi", "Malachi",
			new String[]{"Mal"},
			new int[]{
					14, 17, 18, 6
			}),
	
	/*
	 * =================
	 * The New Testament
	 * =================
	 */
	
	/*
	 * Gospels (books written about the "Good News" - Gospel - of Jesus)
	 */
	
	/**
	 * <b><u>Matthew</u></b>
	 * <br>Author: Matthew
	 * <br>Aliases: Mat, Mt
	 * <br>28 Chapters
	 */
	MATTHEW("Matthew", "Matthew",
			new String[]{"Mat", "Mt"},
			new int[]{
					25, 23, 17, 25, 48, 34, 29, 34, 38, 42, 
					30, 50, 58, 36, 39, 28, 27, 35, 30, 34, 
					46, 46, 39, 51, 46, 75, 66, 20
			}),
	/**
	 * <b><u>Mark</u></b>
	 * <br>Author: John Mark
	 * <br>Aliases: Mr
	 * <br>16 Chapters
	 */
	MARK("Mark", "John Mark",
			new String[]{"Mr"},
			new int[]{
					45, 28, 35, 41, 43, 56, 37, 38, 50, 52, 
					33, 44, 37, 72, 47, 20
			}),
	/**
	 * <b><u>Luke</u></b>
	 * <br>Author: Luke
	 * <br>Aliases: Lu
	 * <br>24 Chapters
	 */
	LUKE("Luke", "Luke",
			new String[]{"Lu"},
			new int[]{
					80, 52, 38, 44, 39, 49, 50, 56, 62, 42, 
					54, 59, 35, 35, 32, 31, 37, 43, 48, 47, 
					38, 71, 56, 53
			}),
	/**
	 * <b><u>John</u></b>
	 * <br>Author: John
	 * <br>Aliases: Joh
	 * <br>21 Chapters
	 */
	JOHN("John", "John",
			new String[]{"Joh"},
			new int[]{
					51, 25, 36, 54, 47, 71, 53, 59, 41, 42, 
					57, 50, 38, 31, 27, 33, 26, 40, 42, 31, 
					25
			}),
	
	/*
	 * Acts of the Apostles
	 */
	
	/**
	 * <b><u>Acts</u></b>
	 * <br>Author: Luke
	 * <br>Aliases: Ac
	 * <br>28 Chapters
	 */
	ACTS("Acts", "Luke",
			new String[]{"Ac"},
			new int[]{
					26, 47, 26, 37, 42, 15, 60, 40, 43, 48, 
					30, 25, 52, 28, 41, 40, 34, 28, 41, 38, 
					40, 30, 35, 27, 27, 32, 44, 31
			}),
	
	/*
	 * Pauline Epistles (Letters written by Paul)
	 */
	
	/**
	 * <b><u>Romans</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Rom, Ro
	 * <br>16 Chapters
	 */
	ROMANS("Romans", "Paul",
			new String[]{"Rom", "Ro"},
			new int[]{
					32, 29, 31, 25, 21, 23, 25, 39, 33, 21, 
					36, 21, 14, 23, 33, 27
			}),
	/**
	 * <b><u>1 Corinthians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 1Cor, 1Co
	 * <br>16 Chapters
	 */
	FIRST_CORINTHIANS("1 Corinthians", "Paul",
			new String[]{"1Cor", "1Co"},
			new int[]{
					31, 16, 23, 21, 13, 20, 40, 13, 27, 33, 
					34, 31, 13, 40, 58, 24
			}),
	/**
	 * <b><u>2 Corinthians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 2Cor, 2Co
	 * <br>13 Chapters
	 */
	SECOND_CORINTHIANS("2 Corinthians", "Paul",
			new String[]{"2Cor", "2Co"},
			new int[]{
					24, 17, 18, 18, 21, 18, 16, 24, 15, 18, 
					33, 21, 14
			}),
	/**
	 * <b><u>Galatians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Gal, Ga
	 * <br>6 Chapters
	 */
	GALATIANS("Galatians", "Paul",
			new String[]{"Gal", "Ga"},
			new int[]{
					24, 21, 29, 31, 26, 18
			}),
	/**
	 * <b><u>Ephesians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Eph
	 * <br>6 Chapters
	 */
	EPHESIANS("Ephesians", "Paul",
			new String[]{"Eph"},
			new int[]{
					23, 22, 21, 32, 33, 24
			}),
	/**
	 * <b><u>Philippians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Phili, Php
	 * <br>4 Chapters
	 */
	PHILIPPIANS("Philippians", "Paul",
			new String[]{"Phili", "Php"},
			new int[]{
					30, 30, 21, 23
			}),
	/**
	 * <b><u>Colossians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Col
	 * <br>4 Chapters
	 */
	COLOSSIANS("Colossians", "Paul",
			new String[]{"Col"},
			new int[]{
					29, 23, 25, 18
			}),
	/**
	 * <b><u>1 Thessalonians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 1Thes, 1Th
	 * <br>5 Chapters
	 */
	FIRST_THESSALONIANS("1 Thessalonians", "Paul",
			new String[]{"1Thes", "1Th"},
			new int[]{
					10, 20, 13, 18, 28
			}),
	/**
	 * <b><u>2 Thessalonians</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 2Thes, 2Th
	 * <br>3 Chapters
	 */
	SECOND_THESSALONIANS("2 Thessalonians", "Paul",
			new String[]{"2Thes", "2Th"},
			new int[]{
					12, 17, 18
			}),
	/**
	 * <b><u>1 Timothy</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 1Tim, 1Ti
	 * <br>6 Chapters
	 */
	FIRST_TIMOTHY("1 Timothy", "Paul",
			new String[]{"1Tim", "1Ti"},
			new int[]{
					20, 15, 16, 16, 25, 21
			}),
	/**
	 * <b><u>2 Timothy</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: 2Tim, 2Ti
	 * <br>4 Chapters
	 */
	SECOND_TIMOTHY("2 Timothy", "Paul",
			new String[]{"2Tim", "2Ti"},
			new int[]{
					18, 26, 17, 22
			}),
	/**
	 * <b><u>Titus</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Tit
	 * <br>3 Chapters
	 */
	TITUS("Titus", "Paul",
			new String[]{"Tit"},
			new int[]{
					16, 15, 15
			}),
	/**
	 * <b><u>Philemon</u></b>
	 * <br>Author: Paul
	 * <br>Aliases: Phile, Phm
	 * <br>1 Chapter
	 */
	PHILEMON("Philemon", "Paul",
			new String[]{"Phile", "Phm"},
			new int[]{
					25
			}),
	
	/*
	 * General Epistles (Letters written by other people)
	 */
	
	/**
	 * <b><u>Hebrews</u></b>
	 * <br>Author: Unknown
	 * <br>Aliases: Heb
	 * <br>13 Chapters
	 */
	HEBREWS("Hebrews", "Unknown",
			new String[]{"Heb"},
			new int[]{
					14, 18, 19, 16, 14, 20, 28, 13, 28, 39, 
					40, 29, 25
			}),
	/**
	 * <b><u>James</u></b>
	 * <br>Author: James
	 * <br>Aliases: Jas
	 * <br>5 Chapters
	 */
	JAMES("James", "James",
			new String[]{"Jas"},
			new int[]{
					27, 26, 18, 17, 20
			}),
	/**
	 * <b><u>1 Peter</u></b>
	 * <br>Author: Peter
	 * <br>Aliases: 1Pe
	 * <br>5 Chapters
	 */
	FIRST_PETER("1 Peter", "Peter",
			new String[]{"1Pe"},
			new int[]{
					25, 25, 22, 19, 14
			}),
	/**
	 * <b><u>2 Peter</u></b>
	 * <br>Author: Peter
	 * <br>Aliases: 2Pe
	 * <br>3 Chapters
	 */
	SECOND_PETER("2 Peter", "Peter",
			new String[]{"2Pe"},
			new int[]{
					21, 22, 18
			}),
	/**
	 * <b><u>1 John</u></b>
	 * <br>Author: John
	 * <br>Aliases: 1Jo
	 * <br>5 Chapters
	 */
	FIRST_JOHN("1 John", "John",
			new String[]{"1Jo"},
			new int[]{
					10, 29, 24, 21, 21
			}),
	/**
	 * <b><u>2 John</u></b>
	 * <br>Author: John
	 * <br>Aliases: 2Jo
	 * <br>1 Chapter
	 */
	SECOND_JOHN("2 John", "John",
			new String[]{"2Jo"},
			new int[]{
					13
			}),
	/**
	 * <b><u>3 John</u></b>
	 * <br>Author: John
	 * <br>Aliases: 3Jo
	 * <br>1 Chapter
	 */
	THIRD_JOHN("3 John", "John",
			new String[]{"3Jo"},
			new int[]{
					14
			}),
	/**
	 * <b><u>Jude</u></b>
	 * <br>Author: Jude
	 * <br>Aliases: None
	 * <br>1 Chapter
	 */
	JUDE("Jude", "Jude",
			new int[]{
					25
			}),
	
	/*
	 * Apocalyptic Literature (books about end-time events)
	 */
	
	/**
	 * <b><u>Revelation</u></b>
	 * <br>Author: John
	 * <br>Aliases: Rev, Re
	 * <br>22 Chapters
	 */
	REVELATION("Revelation", "John",
			new String[]{"Rev", "Re"},
			new int[]{
					20, 29, 22, 11, 14, 17, 17, 13, 21, 11, 
					19, 17, 18, 20, 8, 21, 18, 24, 21, 15, 
					27, 21
			});
	
	/** The name of the book */
	private String book;
	/** The author of the book */
	private String author;
	/** An array of aliases for the book */
	private String[] aliases;
	/** An array of the number of verses in each chapter */
	private int[] chps;
	
	/**
	 * Constructs an EnumBible with the given book name, author, and 
	 * array of number of verses in each chapter.
	 * <br>Aliases is initialized as an empty array (since there are 
	 * no aliases).
	 * 
	 * @param book The name of the book
	 * @param author The author of the book
	 * @param chps The number of verses in each chapter of this book
	 */
	private EnumBible(String book, String author, int[] chps){
		this.book = book;
		this.author = author;
		aliases = new String[0];
		this.chps = chps;
	}
	
	/**
	 * Constructs an EnumBible with the given book name, author, aliases, 
	 * and array of number of verses in each chapter.
	 * 
	 * @param book The name of the book
	 * @param author The author of the book
	 * @param aliases The aliases of this book
	 * @param chps The number of verses in each chapter of this book
	 */
	private EnumBible(String book, String author, String[] aliases, int[] chps){
		this.book = book;
		this.author = author;
		this.aliases = aliases;
		this.chps = chps;
	}
	
	/**
	 * @return The name of this book
	 */
	public String getBook(){
		return book;
	}
	
	/**
	 * @return The author of this book
	 */
	public String getAuthor(){
		return author;
	}
	
	/**
	 * @return The array of aliases for this book
	 */
	public String[] getAliases(){
		return aliases;
	}
	
	/**
	 * @return The array of number of verses per chapter
	 */
	public int[] getChps(){
		return chps;
	}
	
	/**
	 * @returnThe number of chapters in this book
	 */
	public int getNumChapters(){
		return chps.length;
	}
	
	/**
	 * @return The number of verses in the given chapter
	 */
	public int getNumVersesInChp(int chp){
		return chps[chp - 1];
	}
	
	/**
	 * Find an EnumBible based on the book name.
	 * 
	 * @param bookName The book name to find
	 * @return The found EnumBible, or null if none could be found
	 */
	public static EnumBible fromBook(String bookName){
		// Search through the existing EnumBibles for the book name
		for(EnumBible book: EnumBible.values()){
			if(book.getBook().equalsIgnoreCase(bookName)){
				return book;
			}
		}
		
		// Return null if nothing matched
		return null;
	}
	
	/**
	 * Find an EnumBible based on text that may be the book name or an alias.
	 * 
	 * @param text The text to find
	 * @return The found EnumBible, or null if none could be found
	 */
	public static EnumBible fromString(String text){
		// Search through the existing EnumBibles for the text
		for(EnumBible book: EnumBible.values()){
			// Check against the book name
			if(book.getBook().equalsIgnoreCase(text)){
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
	
	/**
	 * Find an EnumBible based on the book number.
	 * 
	 * @param bookName The book number of the book to grab
	 * @return The found EnumBible, or null if it's an invalid book number
	 */
	public static EnumBible fromInt(int bookNum){
		// Check that bookNum is between 1 and 66
		if(bookNum > 0 && bookNum < 67){
			// Return the EnumBible book corresponding to the given book number
			return EnumBible.values()[bookNum-1];
		}else{
			// Return null - invalid book number
			return null;
		}
	}
}
