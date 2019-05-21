package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

import com.gmail.realtadukoo.TB.FindMissing;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;

public class MissingCommand extends Command{
	
	public MissingCommand(){
		super("<Tran:translation>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		HashMap<String, Object> objs = getArgsAsObjects(args);
		EnumTranslations tran = (EnumTranslations) objs.get("Tran");
		FindMissing.run(tran);
		return new String[]{};
	}
}
