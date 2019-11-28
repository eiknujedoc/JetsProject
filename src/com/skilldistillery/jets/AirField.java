
//USER STORY 2

package com.skilldistillery.jets;

import java.util.LinkedList;
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
	
	private List<Jet> jets;
	
	public AirField() {
		jets = new ArrayList<>();	// create a new list of jets

		 
	}
		  public List<Jet> run() {     // populate the list with 5 jets from the Jets.txt file

		    for (int i = 0; i < 5; i++) {
		      jets.add((null)); // TODO: null needs to be some way of reading name from Jets.txt
		    }

		    return jets;
		  }
		

	}

