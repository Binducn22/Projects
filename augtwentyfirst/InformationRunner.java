package com.xworkz.augtwentyfirst;

public class InformationRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        sweet.save("Jalebi");
        sweet.save("Gulab Jamun");
        sweet.save("Rasgulla");
        sweet.save("Ladoo");
        sweet.save("Barfi");
        sweet.save("Halwa");
        sweet.save("Kulfi");
        sweet.ShowNames();

        City city = new City();
        city.save("Bangalore");
        city.save("Mumbai");
        city.save("Chennai");
        city.save("Hyderabad");
        city.save("Pune");
        city.save("Kolkata");
        city.save("Delhi");
        city.ShowNames();

        River river = new River();
        river.save("Ganga");
        river.save("Yamuna");
        river.save("Godavari");
        river.save("Krishna");
        river.save("Kaveri");
        river.save("Narmada");
        river.save("Brahmaputra");
        river.ShowNames();

        Dam dam = new Dam();
        dam.save("Hirakud Dam");
        dam.save("Nagarjuna Sagar Dam");
        dam.save("Srisailam Dam");
        dam.save("Tungabhadra Dam");
        dam.save("Bhakra Dam");
        dam.save("Koyna Dam");
        dam.save("Gandhi Sagar Dam");
        dam.ShowNames();
    }
}


