package com.gmail.realtadukoo.TB;

public enum EnumAliases{
	BIBLE("Bible");
	
	private String[] aliases;
	
	private EnumAliases(String ... aliases){
		this.aliases = aliases;
	}
	
	public String[] aliases(){
		return aliases;
	}
}
