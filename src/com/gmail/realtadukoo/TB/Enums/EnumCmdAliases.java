package com.gmail.realtadukoo.TB.Enums;

public enum EnumCmdAliases{
	APOCRYPHA("Apocrypha"),
	BIBLE("Bible"),
	
	GET("get"),
	DOWNLOAD("download"),
	DOWNLOADTRAN("downloadtran");
	
	private String cmd;
	private String[] aliases;
	
	private EnumCmdAliases(String cmd, String ... aliases){
		this.cmd = cmd;
		this.aliases = aliases;
	}
	
	public String cmd(){
		return cmd;
	}
	
	public String[] aliases(){
		String[] a = new String[aliases.length + 1];
		for(int i = 0; i < aliases.length + 1; i++){
			if(i == aliases.length){
				a[i] = cmd;
			}else{
				a[i] = aliases[i];
			}
		}
		return a;
	}
	
	public static EnumCmdAliases fromString(String cmd){
		for(EnumCmdAliases e: EnumCmdAliases.values()){
			if(e.cmd().equalsIgnoreCase(cmd)){
				return e;
			}
			for(String a: e.aliases()){
				if(a.equalsIgnoreCase(cmd)){
					return e;
				}
			}
		}
		return null;
	}
}
