package com.gmail.realtadukoo.TB.Program;

import java.util.Scanner;

public class Input{
	private Scanner keyboard;
	
	public Input(){
		keyboard = new Scanner(System.in);
	}
	
	public int getInt(){
		int i = keyboard.nextInt();
		keyboard.nextLine();
		return i;
	}
	
	public String getLine(){
		return keyboard.nextLine();
	}
}
