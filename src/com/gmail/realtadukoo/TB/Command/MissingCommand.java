package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.FindMissing;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;

public class MissingCommand extends Command{
	
	public MissingCommand(){
		// TODO: THIS
		super("");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		EnumTranslations tran = ArgumentParsing.isTranslation(args);
		FindMissing.run(tran);
		return new String[]{};
	}
}
