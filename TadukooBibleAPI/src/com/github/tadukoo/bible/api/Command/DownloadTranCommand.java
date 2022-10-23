package com.github.tadukoo.bible.api.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.Constants.EnumTranslation;
import com.github.tadukoo.bible.api.Download.DownloadTran;

public class DownloadTranCommand extends Command{
	
	public DownloadTranCommand(){
		super("<Tran:translation>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		Map<String, Object> objs = getArgsAsObjects(args);
		EnumTranslation tran = (EnumTranslation) objs.get("Tran");
		DownloadTran.run(tran);
		return new ArrayList<>();
	}
}
