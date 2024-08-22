package com.xworkz.augtwentyfirst;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.save("Suzuki");
        bike.save("yamaha");
        bike.save("KTM");
        bike.save("Apache");
        bike.save("Mahindra");
        bike.save("Hondaii");
        bike.save("azuz");
        bike.ShowNames(); 
    }
}

