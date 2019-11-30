
//USER STORY 2

package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

	public static List<Jet> atAirField = new ArrayList<>(); // create a new list of Jet objects located at AirField

	static void populateAirField(Jet Jet) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Jets.txt"));
			String line;
			while ((line = reader.readLine()) != null) {

				String[] split = line.split("\t");
				String id = (split[0]);
				String model = (split[1]);
				int speed = Integer.parseInt(split[2]);
				int range = Integer.parseInt(split[3]);
				int price = Integer.parseInt(split[4]);
				int crew = Integer.parseInt(split[5]);
				int capacity = Integer.parseInt(split[6]);

				Jet newJet = null;

				if (split[0].contentEquals("FIGHTER")) {
					newJet = new FighterJet(id, model, speed, range, price, crew, capacity);
				} else {
					if (split[0].contentEquals("CARGO")) {
						newJet = new CargoPlane(id, model, speed, range, price, crew, capacity);
					}
				}

				atAirField.add(newJet);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
