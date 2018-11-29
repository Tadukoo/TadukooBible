package com.gmail.realtadukoo.TB;

import java.io.IOException;

import com.gmail.realtadukoo.TB.Download.DownloadTran;
import com.gmail.realtadukoo.TB.Download.RetrieveFromSite;
import com.gmail.realtadukoo.TB.Enums.EnumCmdAliases;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Minecraft.GenerateBook;

public class CmdHandler{
	
	public static String[] handleCommand(String command) throws IOException{
		if(command.startsWith("/")){
			String[] parts = command.split(" ");
			for(String s: EnumCmdAliases.BIBLE.aliases()){
				if(parts[0].equalsIgnoreCase("/" + s)){
					if(parts[1].equalsIgnoreCase("get")){
						String verse = VerseReading.getVerse(EnumBible.fromBook(parts[2]), 
								Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), 
								EnumTranslations.fromAbbreviation(parts[5]));
						System.out.println(verse);
						return new String[]{verse};
					}else if(parts[1].equalsIgnoreCase("download")){
						String verse = RetrieveFromSite.getVerse(EnumBible.fromBook(parts[2]), 
								Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), 
								EnumTranslations.fromAbbreviation(parts[5]));
						System.out.println(verse);
						return new String[]{verse};
					}else if(parts[1].equalsIgnoreCase("downloadtran")){
						DownloadTran.run(EnumTranslations.fromAbbreviation(parts[2]));
						return new String[]{};
					}else if(parts[1].equalsIgnoreCase("missing")){
						FindMissing.run(EnumTranslations.fromAbbreviation(parts[2]));
						return new String[]{};
					}else if(parts[1].equalsIgnoreCase("Minecraft")){
						GenerateBook.generateWholeTranslation(
								EnumTranslations.fromAbbreviation(parts[2]));
						return new String[]{};
					}
				}
			}
			throw new IllegalArgumentException("Command not found.");
		}else{
			throw new IllegalArgumentException("Not a command. Commands start with /");
		}
	}
}
