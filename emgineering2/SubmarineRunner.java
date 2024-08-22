package com.xworkz.emgineering2;
	public class SubmarineRunner {
	    public static void main(String[] args) {
	        Submarine submarine1 = new Submarine("Sub1", 100, 20, 10, 500);
	        submarine1.initializeSubmarine("Steel", 20, 5000, 50, 100, "Diesel", 1000, 500, 10000, "Diesel", 1000, 10, 100, "Torpedo", 10, 5, 2, "Sonar", "Radio", "GPS", "Stealth", 10, 20, 30, "Oxygen", 100, 100, 100, "Basic", 100, "Satellite", "GPS");

	        Submarine submarine2 = new Submarine("Sub2", 150, 25, 12, 750);
	        submarine2.initializeSubmarine("Aluminum", 25, 7500, 75, 150, "Nuclear", 2000, 750, 20000, "Nuclear", 2000, 20, 200, "Missile", 20, 10, 5, "Radar", "Satellite", "INS", "Stealth", 20, 30, 40, "Oxygen", 200, 200, 200, "Advanced", 200, "Satellite", "INS");

	        Submarine[] submarines = {submarine1, submarine2};
	        for (Submarine submarine : submarines) {
	            submarine.printVariables();
	            System.out.println();
	        }
	    }
	}
