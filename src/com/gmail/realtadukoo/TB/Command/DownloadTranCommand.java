package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

import com.gmail.realtadukoo.TB.Constants.EnumTranslation;
import com.gmail.realtadukoo.TB.Download.DownloadTran;

public class DownloadTranCommand extends Command{
	
	public DownloadTranCommand(){
		super("<Tran:translation>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		HashMap<String, Object> objs = getArgsAsObjects(args);
		EnumTranslation tran = (EnumTranslation) objs.get("Tran");
		DownloadTran.run(tran);
		return new String[]{};
	}
}
