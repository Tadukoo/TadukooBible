package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.util.ListUtil;

import java.util.List;

public enum EnumCmdAliases{
	APOCRYPHA("apocrypha"),
	BIBLE("bible"),
	
	GET("get", "getverse", "verseget", "readverse", "verseread", "readv", "vread"),
	DOWNLOAD("download"),
	DOWNLOADTRAN("downloadtran");
	
	private String cmd;
	private List<String> aliases;
	
	private EnumCmdAliases(String cmd, String ... aliases){
		this.cmd = cmd;
		this.aliases = ListUtil.createList(aliases);
	}
	
	public String cmd(){
		return cmd;
	}
	
	public static EnumCmdAliases fromString(String cmd){
		for(EnumCmdAliases e: EnumCmdAliases.values()){
			if(e.cmd().equalsIgnoreCase(cmd)){
				return e;
			}
			for(String a: e.aliases){
				if(a.equalsIgnoreCase(cmd)){
					return e;
				}
			}
		}
		return null;
	}
	
	public static EnumCmdAliases baseFromString(String cmd){
		EnumCmdAliases ecmd = fromString(cmd);
		if(ecmd == APOCRYPHA || ecmd == BIBLE){
			return ecmd;
		}else{
			return null;
		}
	}
}
