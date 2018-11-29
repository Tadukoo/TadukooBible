package com.gmail.realtadukoo.TB.command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Download.DownloadTran;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;

public class DownloadTranCommand extends Command{
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		EnumTranslations tran = ArgumentParsing.isTranslation(args);
		DownloadTran.run(tran);
		return new String[]{};
	}
}
