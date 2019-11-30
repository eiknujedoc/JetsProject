package com.skilldistillery.jets;

import java.io.ObjectInputFilter.Config;
import java.lang.module.Configuration;
import java.text.DecimalFormat;


public abstract class Jet {

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public int getRange() {
		return range;
	}



	public void setRange(int range) {
		this.range = range;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}



	private String id;
	protected String model;
	private double speed;
	private int range;
	private long price;
	private int crew;
	private double capacity;

	public Jet(String id, String model, double speed, int range, long price, int crew, double capacity) {
		super();
		this.id = (id);
		this.model = (model);
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.setCrew(crew);
		this.setCapacity(capacity);
	}



	public double roundTwoDecimals(double d) {
	DecimalFormat twoDForm = new DecimalFormat("#.##");
	return Double.valueOf(twoDForm.format(d));
	}
	
	public void radioCheck() {
		
		System.out.println();
		System.out.println("Hangar " + (AirField.atAirField.indexOf(this) + 1) +":" );
		System.out.println("CLASSIFICATION: " + this.getId());
		System.out.println("MODEL: " + this.getModel());
		System.out.println("MAX SPEED: " + this.getSpeed() + " MPH");
		System.out.println("MAX RANGE: " + this.getRange() + " nMILES");
		System.out.println("UNIT PRICE: " + this.getPrice() + " U.S.D.");
		System.out.println("CREW: " + this.getCrew());
		System.out.println("CAPACITY/LOAD: " + this.getCapacity());
		System.out.println();
		
	}

	public void fly() {

//			fly() prints out the jet details and the amount of time the jet 
//			can fly until it runs out of fuel (based on speed and range).
		System.out.println();
		System.out.println("Model: " + model);
		System.out.println("Maximum Speed: " + speed + " MPH");
		System.out.println("Maximum Range: " + range + " nMiles");
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



	public int getCrew() {
		return crew;
	}



	public void setCrew(int crew) {
		this.crew = crew;
	}



	public double getCapacity() {
		return capacity;
	}



	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}



		// TODO Auto-generated method stub
	}

		
	

