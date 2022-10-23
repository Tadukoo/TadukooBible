package com.github.tadukoo.bible.api.Command;

import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.Download.RetrieveFromSite;
import com.github.tadukoo.bible.api.Bible.BibleReference;
import com.github.tadukoo.util.ListUtil;

public class DownloadCommand extends Command{
	
	public DownloadCommand(){
		super("<Reference:bible reference>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		Map<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		String verse = RetrieveFromSite.getVerse(ref.getBook(), ref.getChapter(), ref.getVerse(), ref.getTranslation());
		return ListUtil.createList(verse);
	}
}
