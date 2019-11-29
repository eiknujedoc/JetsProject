package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(int id, String model, double speed, int range, long price) {
		super(id, model, speed, range, price);
		
//		public Employee(String line) {
//	        String[] split = line.split(",");
//	        id = Integer.parseInt(split[0]);
//	        model = split[1];
//	        speed = split[2];
//	        range = split[3];
//	        price = split[4];
//	}
//	String[] lines = ....;
//	Employee[] employees = new Employee[lines.length];
//	for(int i = 0; i < lines.length; i++) {
//	     employees[i] = new Employee(lines[i]);
	}
	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub

	}

}
