class Knife {
    double weight;
    double height;

    Knife(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void declareDetails() {
        System.out.println("Knife Details: Weight=" + weight + ", Height=" + height);
    }
}
