package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
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
			quit();			//a reminder to change this to a while loop.
			break;
		
		}
		}
	
	
	
//		List fleet
//		Fly all jets
//		View fastest jet
//		View jet with longest range
//		Load all Cargo Jets
//		Dogfight!
//		Add a jet to Fleet
//		Remove a jet from Fleet
//		Quit
	private static void listFleet() {
	
	}
	
	private static void flyAllJets() {
		
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
