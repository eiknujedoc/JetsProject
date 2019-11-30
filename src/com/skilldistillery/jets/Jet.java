package com.skilldistillery.jets;

import java.io.ObjectInputFilter.Config;
import java.lang.module.Configuration;
import java.text.DecimalFormat;


public abstract class Jet {

	private String id;
	protected String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String id, String model, double speed, int range, long price) {
		super();
		this.id = (id);
		this.model = (model);
		this.speed = speed;
		this.range = range;
		this.price = price;
	}



	public double roundTwoDecimals(double d) {
	DecimalFormat twoDForm = new DecimalFormat("#.##");
	return Double.valueOf(twoDForm.format(d));
	}
	
	public void radioCheck() {
		
		System.out.println();
		System.out.println("Hangar " + (AirField.atAirField.indexOf(this) + 1) +":" );
		System.out.println(model);
		System.out.println(speed);
		System.out.println(range);
		System.out.println(price);
		System.out.println();
		
	}

	public void fly() {

//			fly() prints out the jet details and the amount of time the jet 
//			can fly until it runs out of fuel (based on speed and range).
		System.out.println();
		System.out.println("Model: " + model);
		System.out.println("Maximum Speed: " + speed);
		System.out.println("Maximum Range: " + range);
		System.out.println("Initiating Mission Parameters: PLEASE STANDBY_");
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j <= i; j++)
				; // fun with cpu timers....creating illusion.
		}
		System.out.println("Iniitiate Mission Parameters: SUCCESS");
		System.out.println("Redirecting...");
		System.out.printf("Maximum Flight Time Remaining: " + roundTwoDecimals(range / speed) + " hours");
			System.out.println();
			
		}



	public static void dogFight() {
		// TODO Auto-generated method stub
	}

		
	}
	

