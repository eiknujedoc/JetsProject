
//USER STORY 2

package com.skilldistillery.jets;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AirField {

//	USER STORY 3
//	On program startup, populate the AirField with at least 5 Jets of different types.
//
//	These jets must be read from a text file, where each line in the file contains data for a single Jet object.
//
//	This file exists at the root of your Eclipse project. It can be comma- or tab-separated;
//	either implementation is acceptable.
//	The method to parse a file into Jet objects should return a List<Jet>. Its parameter can be a String file name.
//	Remember to use String.split(regex) to break each line in the file into data to create an individual jet.

//	public List<Jet> run() { // populate the list with 5 jets from the Jets.txt file

	public static List<Jet> atAirField = new ArrayList<>(); // create a new list of Jet objects located at AirField

	private static List<String> fighterjets = new ArrayList<>(); // create a new list of strings
	private static List<String> cargojets = new ArrayList<>();
	private static String[] anArrayofStrings = new String[25]; // create an array of strings contained in the list
	private static String[] anotherArrayofStrings = new String[25];
	protected static void listFighterJetatAirField(Jet Jet) {
		int numLines = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("fighterJets.txt"));
			String regex = "(\\b|\\w+\\S\\w+)\\,";
			while ((regex = reader.readLine()) != null) {
				
				fighterjets.add(numLines, regex);
//				System.out.println(fighterjets);
				anArrayofStrings[numLines] = fighterjets.get(numLines);
				String[] split = anArrayofStrings[numLines].split("\t");
//				System.out.println(anArrayofStrings[numLines]);
//				System.out.println(split[(numLines - numLines)]);

				String id = (split[0]);
				String model = split[numLines - (numLines - 1)];
				int speed = Integer.parseInt(split[numLines - (numLines - 2)]);
				int range = Integer.parseInt(split[numLines - (numLines - 3)]);
				int price = Integer.parseInt(split[numLines - (numLines - 4)]);
				
//				int load = Integer.parseInt(split[5]);
//				int capacity = Integer.parseInt(split[6]);
				
				FighterJet Fighter = new FighterJet(id, model, speed, range, price);
				atAirField.add(Fighter);
//				System.out.println(atAirField);

				numLines++;

				if (reader != null) {

				}
			}
//			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}
	
	
	protected static void listCargoJetatAirField(Jet Jet) {
		int enumLines = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("CargoJets.txt"));
			String regex = "(\\b|\\w+\\S\\w+)";
			while ((regex = reader.readLine()) != null) {
				
				cargojets.add(enumLines, regex);
				System.out.println(cargojets);
				anotherArrayofStrings[enumLines] = cargojets.get(enumLines);
				String[] split = anotherArrayofStrings[enumLines].split("\t");
				System.out.println(split[0]);
				System.out.println(split[1]);

				String id = (split[0]);
				String model = (split[1]);
				double speed = Integer.parseInt(split[2]);
				int range = Integer.parseInt(split[3]);
				long price = Integer.parseInt(split[4]);
				int crew = Integer.parseInt(split[5]);
				int capacity = Integer.parseInt(split[6]);
				
				System.out.println(split[enumLines]);
//				int load = Integer.parseInt(split[5]);
//				int capacity = Integer.parseInt(split[6]);
				
				CargoCarrier Hauler = new CargoPlane(id, model, speed, range, price, crew, capacity);
				atAirField.add((com.skilldistillery.jets.Jet) Hauler);
				System.out.println(atAirField);

				enumLines++;

				if (reader != null) {

				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}
}
