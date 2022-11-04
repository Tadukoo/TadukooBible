package com.github.tadukoo.bible.api.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.constant.EnumTranslation;
import com.github.tadukoo.bible.api.download.DownloadTranParallel;
import com.github.tadukoo.util.ListUtil;

public class DownloadTranCommand extends Command{
	
	public DownloadTranCommand(){
		super("<Tran:translation>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		Map<String, Object> objs = getArgsAsObjects(args);
		EnumTranslation tran = (EnumTranslation) objs.get("Tran");
		try{
			DownloadTranParallel par = new DownloadTranParallel(settings, tran);
			par.runParallelWork();
		}catch(Throwable t){
			logger.logError("Error in running download translation for translation '" + tran.getName() + "'", t);
			return ListUtil.createList("Something went wrong in downloading the translation. " +
					"Check the logs for more details");
		}
		return ListUtil.createList();
	}
}
