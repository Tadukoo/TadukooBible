package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Download.RetrieveFromSite;

public class DownloadCommand extends Command{
	
	public DownloadCommand(){
		super("<Reference:bible reference>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		HashMap<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		String verse = RetrieveFromSite.getVerse(ref.getBook(), ref.getChapter(), ref.getVerse(), ref.getTranslation());
		return new String[]{verse};
	}
}
