package com.qa.assessment;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Starting the game...");
		System.out.println("You wake up in the middle of an infinte swap. You have no resources avaliable to you.");
		System.out.println("You croutch down to find a magic compass that tells you how far away the next feature of interest in order to find the treasure chest.");
		System.out.println("You can either go North, East, South of West.");
		

		int gridSize = 0;
		
		boolean bool = true;
		while (bool) {
			System.out.println("Decide what size grid you'd like the foggy mist to be?");
			String sizeNew = sc.nextLine();
			
			try {
				gridSize = Integer.parseInt(sizeNew);
				bool = false;
			} catch (NumberFormatException e) {
				System.out.println("Invalid entry, please input an integer");
			}
		}
		
		System.out.println("You have generated a " + gridSize + "x" + gridSize + " map to navigate through.");
		
		//Need to generate a board from the user input gridSize
		
		//GeneratingBoard board = new GeneratingBoard(gridSize);
		
		ArrayList<String> formGrid = new ArrayList<String>();
		for(double i=0; i < gridSize; i++) {
		formGrid.add("~");
					
		}
		
		System.out.println(formGrid);
		
		double maxXPlayerCordinate = gridSize;
		double min = 1;
		double range = gridSize - min + 1;
		
		for (double i = 0; i < 1; i++) {
			
			double randXPlayer = (int)(Math.random() * range) + min;
			double randYPlayer = (int)(Math.random() * range) + min;
			
			double randXTreasure = (int)(Math.random() * range) + min;
			double randYTreasure = (int)(Math.random() * range) + min;
			
			if(randXPlayer == randYPlayer || randXPlayer == randXTreasure || randXPlayer == randYTreasure) {
				//NEED THIS LINE TO REPEAT THE FOR LOOP TO GIVE ANOTHER COORDINATE 
				break;
			}else if(randYPlayer == randXTreasure || randYPlayer == randYTreasure) {
				//SAME FOR HERE
				break;
			}
			
			System.out.println("Your starting position in the mist is " + randXPlayer + "," + randYPlayer);
			
			//System.out.println("The Treasure starting position is " + randXTreasure + "," + randYTreasure); //Player isn't meant to see the starting position.
			
			double xDistanceAwayFromTreasure = Math.abs(randXTreasure - randXPlayer);
			double yDistanceAwayFromTreasure = Math.abs(randYTreasure - randYPlayer);
			
			double totalDistanceAway = xDistanceAwayFromTreasure + yDistanceAwayFromTreasure;
			
			System.out.println("You are currently " + totalDistanceAway + " blocks from the treasure!");
			
			//I need to set up an array for the grid 
			
		}
			
	}
		
}