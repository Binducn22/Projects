class Rocket {
    String country;
    double speed;
    double fuelCapacity;
    int noOfThrusters;
    String rocketType = "Space Rocket"; // literal declaration

    public Rocket(String country) {
        this.country = country;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    public void display() {
        System.out.println("Country: " + country);
        System.out.println("Speed: " + speed + " mph");
        System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
        System.out.println("Number of Thrusters: " + noOfThrusters);
        System.out.println("Rocket Type: " + rocketType);
        System.out.println();
    }
}

