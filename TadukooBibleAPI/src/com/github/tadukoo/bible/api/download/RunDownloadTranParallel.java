package com.github.tadukoo.bible.api.download;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.constant.EnumTranslation;
import com.github.tadukoo.util.ListUtil;
import com.github.tadukoo.util.logger.EasyLogger;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Logger;

public class RunDownloadTranParallel{
	private static final List<EnumTranslation> whitelist = ListUtil.createList(EnumTranslation.JPS);
	private static final boolean useWhitelist = false;
	
	// HCSB appears empty (it's extremely different because of concordance links)
	private static final List<EnumTranslation> blacklist = ListUtil.createList(
			EnumTranslation.HCSB);
	private static final boolean useBlacklist = true;
	
	public static void main(String[] args)
			throws InterruptedException, InvocationTargetException, NoSuchMethodException,
			InstantiationException, IllegalAccessException{
		EasyLogger logger = new EasyLogger(Logger.getLogger(""));
		for(EnumTranslation tran: getTranslationsToRun()){
			DownloadTranParallel parallel = new DownloadTranParallel(logger, new Settings(), tran);
			parallel.runParallelWork();
			System.out.println("Finished " + tran.getName());
		}
	}
	
	private static List<EnumTranslation> getTranslationsToRun(){
		List<EnumTranslation> trans = useWhitelist?whitelist:ListUtil.createList(EnumTranslation.values());
		
		if(useBlacklist){
			trans.removeAll(blacklist);
		}
		
		return trans;
	}
}
