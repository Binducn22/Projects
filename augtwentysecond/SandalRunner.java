package com.xworkz.augtwentysecond;

public class SandalRunner {
    public static void main(String[] args) {
        SandalStore sandalStore = new SandalStore();

        SandalData sandal1 = new SandalData("Nike", '8', 5000.0, "Black");
        SandalData sandal2 = new SandalData("Adidas", '9', 6000.0, "White");
        SandalData sandal3 = new SandalData("Reebok", '7', 4500.0, "Blue");
        SandalData sandal4 = new SandalData("Puma", '6', 4000.0, "Red");
        SandalData sandal5 = new SandalData("Fila", '5', 3500.0, "Green");

        sandalStore.save(sandal1);
        sandalStore.save(sandal2);
        sandalStore.save(sandal3);
        sandalStore.save(sandal4);
        sandalStore.save(sandal5);

        sandalStore.display();
    }
}

