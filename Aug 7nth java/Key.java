class Key {
    double weight;
    String brand;
    
    public Key(double weight, String brand) {
        this.weight = weight;
        this.brand = brand;
    }

    public void declareDetails() {
        System.out.println("Key Details: Weight=" + weight + ", Brand=" + brand );
    }
}