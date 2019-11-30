package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String id, String model, double speed, int range, long price, int load, int capacity) {
		super(id, model, speed, range, price);

	}

	@Override
	public void loadCargo() {
		System.out.println("Initializing Mission Parameters: PLEASE WAIT_");
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < i; j++) {

			}
		}
		System.out.println("SUCCESS!");
		System.out.println("Loading " + this.model + " with payload.");
		System.out.println();
		System.out.println("Mission parameters updated.");
		System.out.println();
	}

}
