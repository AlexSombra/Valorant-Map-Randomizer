// Created by Alex Vasquez 6/10/24
import java.util.Scanner;
import java.util.Random;
public class main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		// all_maps needs to be updates after the release of a new map
		// curr_maps needs to be updates at the start of each new Act (season)
		String all_maps[] = {"Ascent", "Bind", "Breeze", "Fracture", "Haven", "Icebox", "Lotus", "Pearl", "Split", "Sunset"};
		String curr_maps[] = {"Ascent", "Bind", "Breeze", "Icebox", "Lotus", "Split", "Sunset"};
		int choice = 0;
		int select = 0;
		
		// text speed I generally like to use is 65. however for
		// this project I use 40 given how short the project actually is
		text_manager(40, "Welcome to the Valorant Map Randomizer");
		// delay the program by 1 second
		text_manager(1000);
		text_manager(40, "Would you like to use the current maps in rotation, or all maps?\n");
		System.out.println("1. Current Maps\n2. All Maps");
		choice = reader.nextInt();
		
		// while the user has not chosen a valid option, ask the user to
		// input either 1 or 2 for their choice
		while(choice != 1 && choice != 2) {
			System.out.println("Please input 1 for current map rotation or 2 for all maps.");
			System.out.println("1. Current Maps\n2. All Maps");
			choice = reader.nextInt();
		}
		
		if(choice == 1) {
			//create random integer in range of 0 to 6
			select = rand.nextInt(7);
			text_manager(40, "Selected Map: " + curr_maps[select]);
		}
		else {
			//create random integer in range of 0 to 9
			select = rand.nextInt(10);
			text_manager(40, "Selected Map: " + all_maps[select]);
		}
	
		reader.close();
	}
	
	
	// overloaded function that delays the program 
	// for a certain amount of seconds
	public static void text_manager(int num) {
		// note, time is measured in milliseconds. 
		// 1000 milliseconds equals 1 second.
		long startTime = System.currentTimeMillis();
		long newTime = startTime;
		// program delays for a certain amount of milliseconds
		// and then the next line of code will occur after the loop is done
		while (newTime < startTime + num) {
			newTime = System.currentTimeMillis();
		}
	}
	
	// overloaded function that delays the output between each character in
	// a given string which gives a video game like effect to slow down text output
	public static void text_manager(int num, String sentence) {
		long startTime = System.currentTimeMillis();
		long newTime = startTime;
		for (int i = 0; i < sentence.length(); i++) {
				System.out.print(sentence.charAt(i));
				startTime = System.currentTimeMillis();
				// program delays for a certain amount of milliseconds
				// and then the next character in the string will print
				while (newTime < startTime + num) {
					newTime = System.currentTimeMillis();
				}
		}
		
		System.out.println();
		
	}
	
}
