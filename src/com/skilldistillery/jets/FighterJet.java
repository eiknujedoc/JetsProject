package com.skilldistillery.jets;


public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String id, String model, double speed, int range, long price, int crew, int capacity) {
		super(id, model, speed, range, price, crew, capacity);
	}
	
	@Override	
	public void dogFight() {
		System.out.println(this.getModel() + " COPY VECTOR, CHECK YOUR VECTOR VICTOR, ROGER VICTOR, VECTOR CHANGED TO VICTOR VECTOR.");
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		System.out.println("PEW PEW PEW!");
		
	}
}

