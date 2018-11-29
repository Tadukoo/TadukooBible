package com.gmail.realtadukoo.TB.command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.FindMissing;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;

public class MissingCommand extends Command{
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		EnumTranslations tran = ArgumentParsing.isTranslation(args);
		FindMissing.run(tran);
		return new String[]{};
	}
}
