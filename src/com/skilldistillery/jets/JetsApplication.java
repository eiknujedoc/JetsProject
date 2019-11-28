package com.skilldistillery.jets;

import java.util.Scanner;


//
//On program startup, populate the AirField with at least 5 Jets of different types.
//
//These jets must be read from a text file, where each line in the file contains data for a single Jet object.
//
//This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
//The method to parse a file into Jet objects should return a List<Jet>. Its parameter can be a String file name.
//Remember to use String.split(regex) to break each line in the file into data to create an individual jet.
//


public class JetsApplication {

	public static void main(String[] args) {		//USER STORY 1

		// USER STORY 4
		System.out.println("1. List Fleet ");
		System.out.println("2. Fly all jets ");
		System.out.println("3. View fastest jet ");
		System.out.println("4. Load all Cargo Jets ");
		System.out.println("5. Dogfight! ");
		System.out.println("6. Add a jet to Fleet ");
		System.out.println("7. Remove a jet from Fleet ");
		System.out.println("8. Quit ");
		System.out.println();

		Scanner input = new Scanner(System.in);
		int userSelection = input.nextInt();

		switch (userSelection) {
		case 1:
			listFleet();
			break;
		case 2:
			flyAllJets();
			break;
		case 3:
			viewFastestJet();
			break;
		case 4:
			loadAllCargoJets();
			break;
		case 5:
			dogFightJets();
			break;
		case 6:
			addFleetJet();
			break;
		case 7:
			remFleetJet();
			break;
		case 8:
			quit(); // a reminder to change this to a while loop.
			break;

		}
	}

	private static void listFleet() {

	}

	private static void flyAllJets() {
//		User Story #6
//
//		Fly all Jets calls the fly() method on the entire fleet of jets. ****>>> create fly() method for Jet.java.
//		
		
	}

	private static void viewFastestJet() {

	}

	private static void viewLongestRangeJet() {

	}

	private static void loadAllCargoJets() {

	}

	private static void dogFightJets() {

	}

	private static void addFleetJet() {

	}

	private static void remFleetJet() {

	}

	private static void quit() {

	}
}
