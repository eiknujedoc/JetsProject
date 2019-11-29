
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

	private static List<String> jets = new ArrayList<>(); // create a new list of strings

	private static String[] anArrayofStrings = new String[5]; // create an array of strings contained in the list

	protected static void listAirCraftatAirField(Jet Jet) {
		int numLines = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Jets.txt"));
			String regex = "(\\b|\\w+\\S\\w+)\\,";
			while ((regex = reader.readLine()) != null) {
				jets.add(numLines, regex);
				System.out.println(jets);
				anArrayofStrings[numLines] = jets.get(numLines);
				String[] split = anArrayofStrings[numLines].split("\t");
				System.out.println(anArrayofStrings[numLines]);
				System.out.println(split[0]);

				int id = Integer.parseInt(split[0]);
				String model = split[1];
				int speed = Integer.parseInt(split[2]);
				int range = Integer.parseInt(split[3]);
				int price = Integer.parseInt(split[4]);
				Jet Fighter = new FighterJet(id, model, speed, range, price);
				atAirField.add(Fighter);
				System.out.println(atAirField);

				numLines++;

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
