package com.gmail.realtadukoo.TB;

import java.io.IOException;
import java.util.Random;

public class TB{
	
	public static void main(String[] args){
		Input input = new Input();
		int screen = 0;
		boolean cont = true;
		
		while(cont == true){
			System.out.print("Input command (/stop to quit): ");
			String command = input.getLine();
			if(command.equalsIgnoreCase("/stop")){
				cont = false;
			}else{
				try{
					CommandHandler.handleCommand(command);
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
		/*while(screen != -1){
			if(screen == 0){
				System.out.println("Pick an option: (-1 to quit)");
				System.out.println("1. Read a verse.");
				System.out.println("2. Get a random verse.");
				System.out.println("3. Get statistics about the Bible.");
				System.out.println("4. Get a list of books.");
				screen = input.getInt();
			}else if(screen == 1){
				System.out.print("What book? ");
				String name = input.getLine();
				EnumBooks book = EnumBooks.fromString(name);
				
				System.out.print("What chapter? ");
				int chp = input.getInt();
				
				System.out.print("What verse? ");
				int v = input.getInt();
				
				boolean good = verifyVerseRef(book, chp, v);
				
				if(good){
					try{
						System.out.println(VerseReading.getVerse(book, chp, v));
					}catch(IOException e){
						e.printStackTrace();
					}
				}else{
					System.out.println("That verse doesn't exist.");
				}
				System.out.println("-1 to quit, any other number to continue");
				int i = input.getInt();
				if(i == -1){
					screen = 0;
				}
			}else if(screen == 2){
				Random rand = new Random();
				int b = rand.nextInt(66) + 1;
				System.out.println("B: " + b);
				EnumBooks book = EnumBooks.fromInt(b);
				int chp = rand.nextInt(EnumChps.fromString(book.bookName()).getChps().length) 
						+ 1;
				System.out.println("C: " + chp);
				int v = rand.nextInt(EnumChps.fromString(book.bookName()).getNum(chp)) + 1;
				System.out.println("V: " + v);
				try{
					System.out.println(VerseReading.getVerse(book, chp, v));
				}catch(IOException e){
					e.printStackTrace();
				}
				System.out.println("-1 to quit, any other number to continue");
				int i = input.getInt();
				if(i == -1){
					screen = 0;
				}
			}else if(screen == 3){
				int chps = 0, verses = 0;
				
				for(int i = 1; i <= 66; i++){
					EnumBooks book = EnumBooks.fromInt(i);
					int chp = EnumChps.fromString(book.bookName()).getChps().length;
					chps += chp;
					for(int j = 1; j <= chp; j++){
						verses += EnumChps.fromString(book.bookName()).getNum(j);
					}
				}
				System.out.println("Number of book in the Bible: " + 66);
				System.out.println("Number of chapters in the Bible: " + chps);
				System.out.println("Number of verses in the Bible: " + verses);
				
				screen = 0;
			}else{
				System.out.println("Error");
				screen = 0;
			}
		}*/
	}
	
	
	
	public static boolean verifyVerseRef(EnumBooks book, int chp, int verse){
		if(book == null){
			return false;
		}else{
			if(EnumChps.fromString(book.bookName()).getChps().length < chp){
				return false;
			}else{
				if(EnumChps.fromString(book.bookName()).getNum(chp) < verse){
					return false;
				}else{
					return true;
				}
			}
		}
	}
}
