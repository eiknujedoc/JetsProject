package com.skilldistillery.jets;


public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String id, String model, double speed, int range, long price, int crew, int capacity) {
		super(id, model, speed, range, price, crew, capacity);
	}
	
	@Override	
	public void dogFight() {
		System.out.println(this.getModel() + " engaging new vector...");
		System.out.println();
		System.out.println(" COPY VECTOR, CHECK YOUR VECTOR VICTOR, ROGER VICTOR, VECTOR CHANGED TO VICTOR VECTOR.");
		System.out.println();
		System.out.println();
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		System.out.println();
		System.out.println();
		System.out.println("EJECT MAILMAN!");
		System.out.println();
	}
}

