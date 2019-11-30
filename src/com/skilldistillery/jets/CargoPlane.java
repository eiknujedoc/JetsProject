package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String id, String model, double speed, int range, long price, int crew, int capacity) {
		super(id, model, speed, range, price, crew, capacity);

	}

	@Override
	public void loadCargo() {
		System.out.println("Initializing Mission Parameters:_");
		System.out.println(this.model + " ready for payload.");
		System.out.println(this.getCapacity() + "  lbs. maximum capacity.");
		System.out.println();
		System.out.println(this.getCrew() + " personnel ALERT STATUS changed to ACTIVE");
		System.out.println("Payload staged and ready.");
		System.out.println(this.getModel() + " loaded with payload.");
		System.out.println();
	}

}
