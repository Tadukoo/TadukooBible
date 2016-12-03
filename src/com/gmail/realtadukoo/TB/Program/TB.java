package com.gmail.realtadukoo.TB.Program;

import java.io.IOException;

import com.gmail.realtadukoo.TB.CmdFiddler;
import com.gmail.realtadukoo.TB.CmdHandler;

public class TB{
	
	public static void main(String[] args){
		Input input = new Input();
		boolean cont = true;
		
		while(cont == true){
			System.out.print("Input command (/stop to quit): ");
			String command = input.getLine();
			if(command.equalsIgnoreCase("/stop")){
				cont = false;
			}else{
				try{
					CmdHandler.handleCommand(CmdFiddler.fiddle(command));
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
