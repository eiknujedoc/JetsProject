package com.skilldistillery.jets;

public abstract class Jet {

		private String model;
		private double speed;
		private int range;
		private long price;
	
		public Jet(String model, double speed, int range, long price) {
			super();
			this.model = model;
			this.speed = speed;
			this.range = range;
			this.price = price;
		}
		
		
		public void fly() {
			
//			fly() prints out the jet details and the amount of time the jet 
//			can fly until it runs out of fuel (based on speed and range).

			System.out.println(model);
			System.out.println(speed);
			System.out.println(range);
//			System.out.println(price);
			System.out.println("Maximum Flight Time: " + (range / speed) + " hours");
			
			
		}
		
}
