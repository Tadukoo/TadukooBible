package com.gmail.realtadukoo.TB.Enums;

public enum EnumCmdAliases{
	BIBLE("Bible");
	
	private String[] aliases;
	
	private EnumCmdAliases(String ... aliases){
		this.aliases = aliases;
	}
	
	public String[] aliases(){
		return aliases;
	}
}
