package com.xworkz.engineering;
public class Plant {

    private String name;
    private int height;
    private int width;
    private String color;
    private int age;
    private String species;
    private String soilType;
    private int waterLevel;
    private int sunlightLevel;
    private String fertilizerType;

    public Plant(String name, int height, int width, String color, int age) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.color = color;
        this.age = age;
    }
    public void initializePlant(String species, String soilType, int waterLevel, int sunlightLevel, String fertilizerType) {
        this.species = species;
        this.soilType = soilType;
        this.waterLevel = waterLevel;
        this.sunlightLevel = sunlightLevel;
        this.fertilizerType = fertilizerType;
    }

    public void printVariables() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
        System.out.println("Soil Type: " + soilType);
        System.out.println("Water Level: " + waterLevel);
        System.out.println("Sunlight Level: " + sunlightLevel);
        System.out.println("Fertilizer Type: " + fertilizerType);
    }
}



