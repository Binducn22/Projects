class Chocolate {
    String brand;
    double price;
    String flavor;
    int size;
    String packaging = "Wrapped"; // literal declaration

    public Chocolate(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Flavor: " + flavor);
        System.out.println("Size: " + size + " grams");
        System.out.println("Packaging: " + packaging);
        System.out.println();
    }
}
