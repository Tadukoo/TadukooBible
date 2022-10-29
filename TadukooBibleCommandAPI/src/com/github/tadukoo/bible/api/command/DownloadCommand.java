package com.github.tadukoo.bible.api.command;

import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSiteBH;
import com.github.tadukoo.util.ListUtil;

public class DownloadCommand extends Command{
	
	public DownloadCommand(){
		super("<Reference:bible reference>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		Map<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		RetrieveChapterFromSite retriever = new RetrieveChapterFromSiteBH();
		Map<Integer, String> verses = retriever.getVerses(ref);
		String verse = verses.get(ref.getVerse());
		return ListUtil.createList(verse);
	}
}
