package com.gmail.realtadukoo.TB.command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Download.RetrieveFromSite;
import com.gmail.realtadukoo.TB.Enums.Bible.BibleReference;

public class DownloadCommand extends Command{
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		BibleReference ref = ArgumentParsing.isBibleReference(args);
		String verse = RetrieveFromSite.getVerse(ref.getBook(), ref.getChapter(), ref.getVerse(), ref.getTranslation());
		return new String[]{verse};
	}
}
