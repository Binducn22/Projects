package com.xworkz.engineering;

public class PlantRunner {
	 public static void main(String[] args) {
	    
	        Plant plant1 = new Plant("Rose", 50, 30, "Red", 2);
	        plant1.initializePlant("Flower", "Clay", 40, 60, "Inorganic");

	        Plant plant2 = new Plant("Sunflower", 100, 50, "Yellow", 3);
	        plant2.initializePlant("Flower", "Loamy", 50, 70, "Organic");

	        Plant plant3 = new Plant("Fern", 20, 10, "Green", 1);
	        plant3.initializePlant("Shrub", "Sandy", 30, 50, "Inorganic");

	        Plant[] plants = {plant1, plant2, plant3};
	        for (Plant plant : plants) {
	            plant.printVariables();
	            System.out.println();
	        }
	    }


}
