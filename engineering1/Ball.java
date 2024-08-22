package com.xworkz.engineering1;

public class Ball {
    private String name;
    private int size;
    private int weight;
    private String color;
    private int age;
    private String material;
    private int elasticity;
    private int hardness;

    private String brand;
    private String type;
    private int diameter;
    private int circumference;
    private int surfaceArea;
    private int volume;
    private int density;
    private int viscosity;
    private int surfaceTension;
    private int friction;
    private int gravity;
    private int buoyancy;
    private int displacement;
    private int velocity;
    private int acceleration;
    private int momentum;
    private int kineticEnergy;
    private int potentialEnergy;

    public Ball(String name, int size, int weight, String color, int age, String material, int elasticity, int hardness) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.material = material;
        this.elasticity = elasticity;
        this.hardness = hardness;
    }

    public void initializeBall(String brand, String type, int diameter, int circumference, int surfaceArea, int volume, int density, int viscosity, int surfaceTension, int friction, int gravity, int buoyancy, int displacement, int velocity, int acceleration, int momentum, int kineticEnergy, int potentialEnergy) {
        this.brand = brand;
        this.type = type;
        this.diameter = diameter;
        this.circumference = circumference;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.density = density;
        this.viscosity = viscosity;
        this.surfaceTension = surfaceTension;
        this.friction = friction;
        this.gravity = gravity;
        this.buoyancy = buoyancy;
        this.displacement = displacement;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.momentum = momentum;
        this.kineticEnergy = kineticEnergy;
        this.potentialEnergy = potentialEnergy;
    }

    public void printVariables() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Material: " + material);
        System.out.println("Elasticity: " + elasticity);
        System.out.println("Hardness: " + hardness);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
        System.out.println("Density: " + density);
        System.out.println("Viscosity: " + viscosity);
        System.out.println("Surface Tension: " + surfaceTension);
        System.out.println("Friction: " + friction);
        System.out.println("Gravity: " + gravity);
        System.out.println("Buoyancy: " + buoyancy);
        System.out.println("Displacement: " + displacement);
        System.out.println("Velocity: " + velocity);
        System.out.println("Acceleration: " + acceleration);
        System.out.println("Momentum: " + momentum);
        System.out.println("Kinetic Energy: " + kineticEnergy);
        System.out.println("Potential Energy: " + potentialEnergy);
    }
}
