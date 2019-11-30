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

	public static void main(String[] args) { // USER STORY 1
		AirField.populateAirField(null);
		menu();

	}

	// USER STORY 4
	public static void menu() {
		boolean running = true;
		do {

			System.out.println("1. List Fleet ");
			System.out.println("2. Fly all jets ");
			System.out.println("3. View fastest jet ");
			System.out.println("4. View jet with the longest range ");
			System.out.println("5. Load all Cargo Jets ");
			System.out.println("6. Dogfight! ");
			System.out.println("7. Add a jet to Fleet ");
			System.out.println("8. Remove a jet from Fleet ");
			System.out.println("9. Quit ");
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
				viewLongestRangeJet();
				break;
			case 5:
				loadAllCargoJets(0);
				break;
			case 6:
				dogFightJets();
				break;
			case 7:
				addFleetJet();
				break;
			case 8:
				remFleetJet();
				break;
			case 9:
				exit(0);
			}
		} while (running = true);
	}

	protected static void listFleet() {

		for (int j = 0; j < AirField.atAirField.size(); j++) {
			AirField.atAirField.get(j).radioCheck(); // Lets have each jet list itself.
		}

	}

	private static void flyAllJets() {
//		User Story #6
//
//		Fly all Jets calls the fly() method on the entire fleet of jets. ****>>> create fly() method for Jet.java.
//		
		for (int j = 0; j < AirField.atAirField.size(); j++) {
			AirField.atAirField.get(j).fly();
		}

	}

	private static void viewFastestJet() {

//		User Story #7
//
//		The view fastest jet and longest range options both print out all of the information about a jet.
//
//		Note: these methods must search the collection of jets to find the appropriate jet.
		Jet fastestJet = null;
		for (int i = 0; i < AirField.atAirField.size(); i++) {
			if (i == 0) {
				fastestJet = AirField.atAirField.get(i);

			} else {

				if (fastestJet.getSpeed() < AirField.atAirField.get(i).getSpeed()) {
					fastestJet = AirField.atAirField.get(i);
				}
			}
		}
		System.out.println("The fastest jet in FLEET is:_");
		fastestJet.radioCheck();
	}

	private static void viewLongestRangeJet() {

		Jet furthestJet = null;
		for (int i = 0; i < AirField.atAirField.size(); i++) {
			if (i == 0) {
				furthestJet = AirField.atAirField.get(i);

			} else {

				if (furthestJet.getSpeed() < AirField.atAirField.get(i).getRange()) {
					furthestJet = AirField.atAirField.get(i);
				}
			}
		}
		System.out.println("The jet with the greatest range in FLEET is:_");
		furthestJet.radioCheck();

	}

	private static void loadAllCargoJets(int CargoPlane) {
		
		
		for (int i = 0; i < AirField.atAirField.size(); i++) {
			if(AirField.atAirField.get(i) instanceof CargoCarrier)
			{
				CargoPlane cargoJetToLoad = null;
				cargoJetToLoad = (CargoPlane) AirField.atAirField.get(i);
				cargoJetToLoad.loadCargo();
			}
			
			}
		}

	private static void dogFightJets() {
		
		for (int j = 0; j < AirField.atAirField.size(); j++) {
			if (AirField.atAirField.get(j) instanceof FighterJet) {
				FighterJet Maverick = (FighterJet) AirField.atAirField.get(j);
				Maverick.dogFight();
			}
				}
		
	}

	private static void addFleetJet() {

//		User Story #9
//
//		A user can add custom jets to the fleet.
//
//		This can be a JetImpl.
		System.out.println("WELCOME TO THE SILK ROAD MILITARY AIRCRAFT SURPLUS.");
		System.out.println("THIS SITE USES COOKIES TO ENHANCE YOUR EXPERIENCE.");
		System.out.println("IF YOU DO NOT CONSENT TO THE USE OF COOKIES WE SUGGEST YOU CLOSE YOUR TEXT BROWSER NOW.");
		
		System.out.println("******************************");
		System.out.println("ENTER AIRCRAFT CLASSIFICATION: [F]IGHTER/[C]ARGO_");
		JetImpl generic = new JetImpl("GENERIC", "Some_Fighter", 200, 400, 100000, 2, 10000);
		Scanner input = new Scanner(System.in);
		String inputChecked = input.next(); 
		switch (inputChecked) {
		case "F":
		case "f":
			generic.setId("FIGHTER");
			break;
		case "C":
		case "c":
			generic.setId("CARGO");
			break; 
			}
		System.out.println("ENTER AIRCRAFT MODEL DESCRIPTION (NO SPACES, USE '_' FOR CONCATINATION) :_ ");
		generic.setModel(input.next());
		System.out.println("ENTER AIRCRAFT MAXIMUM SPEED (MPH):_");
		generic.setSpeed(input.nextInt());
		System.out.println("ENTER AIRCRAFT MAXIMUM RANGE (nMILES):_ ");
		generic.setRange(input.nextInt());
		System.out.println("ENTER AIRCRAFT UNIT PRICE (U.S.D.):_");
		generic.setRange(input.nextInt());
		System.out.println("ENTER AIRCRAFT NUMBER OF CREW:_");
		generic.setCrew(input.nextInt());
		System.out.println("ENTER AIRCRAFT LOAD CAPACITY (LBS):_ ");
		generic.setCapacity(input.nextInt());
		
		AirField.atAirField.add(generic);
		System.out.println("LOCATING PARKING...PARKING LOCATED.");
	}
//		Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
//		Users then enter information for the Jet, and it is added to the AirField.


	private static void remFleetJet() {

//		User Story #10
//
//		A user can remove a jet from the fleet.
//		The user is presented with a sub-menu to select a jet to delete by number.
//		
		Scanner input = new Scanner(System.in);
		listFleet();
		System.out.println("Select a hangar number to remove from FLEET:_");

		try {
			int removalSelection = (input.nextInt() - 1);
			if (removalSelection > (AirField.atAirField.size()) | removalSelection <= 1) {
				System.out.println("INVALID SELECTION");
				System.out.println("Returning to FLEET MENU");
				menu();
			} else {
				Jet removed = AirField.atAirField.get(removalSelection);
				System.out.println("Remove " + removed.model
						+ " from FLEET?_ \n\nTHIS CAN NOT BE UNDONE.\n\n TYPE 'YES' TO CONFIRM.");
				String confirm = input.next();
				if (confirm.equals("YES")) {
					AirField.atAirField.remove(removalSelection);
					System.out.println("Removed " + removed.model + " from FLEET.");
					menu();
				} else {
					menu();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Returning to FLEET MENU");

		}

//		Stretch Goal: a user can remove a jet (or jets) by name.

	}

	public static void exit(int status) {

//		User Story #11
//
//		Quit exits the program.
		Runtime.getRuntime().exit(0);
	}
}
