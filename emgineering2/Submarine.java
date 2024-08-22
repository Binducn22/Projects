package com.xworkz.emgineering2;

public class Submarine {
    private String name;
    private int length;
    private int width;
    private int height;
    private int depth;

    private String material;
    private int speed;
    private int weight;
    private int crew;
    private int capacity;
    private String propulsion;
    private int horsepower;
    private int torque;
    private int fuelCapacity;
    private String fuelType;
    private int range;
    private int endurance;
    private int payload;
    private String armament;
    private int torpedo;
    private int missile;
    private int mine;
    private String sensor;
    private String communication;
    private String navigation;
    private String stealth;
    private int sonar;
    private int radar;
    private int lidar;
    private String lifeSupport;
    private int airSupply;
    private int waterSupply;
    private int foodSupply;
    private String medicalFacilities;
    private int emergencyPower;
    private String emergencyCommunication;
    private String emergencyNavigation;

    public Submarine(String name, int length, int width, int height, int depth) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void initializeSubmarine(String material, int speed, int weight, int crew, int capacity, String propulsion, int horsepower, int torque, int fuelCapacity, String fuelType, int range, int endurance, int payload, String armament, int torpedo, int missile, int mine, String sensor, String communication, String navigation, String stealth, int sonar, int radar, int lidar, String lifeSupport, int airSupply, int waterSupply, int foodSupply, String medicalFacilities, int emergencyPower, String emergencyCommunication, String emergencyNavigation) {
        this.material = material;
        this.speed = speed;
        this.weight = weight;
        this.crew = crew;
        this.capacity = capacity;
        this.propulsion = propulsion;
        this.horsepower = horsepower;
        this.torque = torque;
        this.fuelCapacity = fuelCapacity;
        this.fuelType = fuelType;
        this.range = range;
        this.endurance = endurance;
        this.payload = payload;
        this.armament = armament;
        this.torpedo = torpedo;
        this.missile = missile;
        this.mine = mine;
        this.sensor = sensor;
        this.communication = communication;
        this.navigation = navigation;
        this.stealth = stealth;
        this.sonar = sonar;
        this.radar = radar;
        this.lidar = lidar;
        this.lifeSupport = lifeSupport;
        this.airSupply = airSupply;
        this.waterSupply = waterSupply;
        this.foodSupply = foodSupply;
        this.medicalFacilities = medicalFacilities;
        this.emergencyPower = emergencyPower;
        this.emergencyCommunication = emergencyCommunication;
        this.emergencyNavigation = emergencyNavigation;
    }

    public void printVariables() {
        System.out.println("Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        System.out.println("Material: " + material);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
        System.out.println("Crew: " + crew);
        System.out.println("Capacity: " + capacity);
        System.out.println("Propulsion: " + propulsion);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Torque: " + torque);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Range: " + range);
        System.out.println("Endurance: " + endurance);
        System.out.println("Payload: " + payload);
        System.out.println("Armament: " + armament);
        System.out.println("Torpedo: " + torpedo);
        System.out.println("Missile: " + missile);
        System.out.println("Mine: " + mine);
        System.out.println("Sensor: " + sensor);
        System.out.println("Communication: " + communication);
        System.out.println("Navigation: " + navigation);
        System.out.println("Stealth: " + stealth);
        System.out.println("Sonar: " + sonar);
        System.out.println("Radar: " + radar);
        System.out.println("Lidar: " + lidar);
        System.out.println("Life Support: " + lifeSupport);
        System.out.println("Air Supply: " + airSupply);
        System.out.println("Water Supply: " + waterSupply);
        System.out.println("Food Supply: " + foodSupply);
        System.out.println("Medical Facilities: " + medicalFacilities);
        System.out.println("Emergency Power: " + emergencyPower);
        System.out.println("Emergency Communication: " + emergencyCommunication);
        System.out.println("Emergency Navigation: " + emergencyNavigation);
    }
}

