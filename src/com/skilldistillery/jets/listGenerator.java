package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class listGenerator {


	static void listGenerator() {
		
		List<String> Jets = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String regex = "(\\b|\\w+\\S\\w+)\\,";
			Jets.add(regex = br.readLine());
			String[] split = new String[(Jets.size())];
			
			Jet Raptor = new FighterJet(0, regex, 0, 0, 0);
			
			
			System.out.println(Jets);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
