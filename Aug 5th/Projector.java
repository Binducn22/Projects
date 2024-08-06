class Projector {
    String company;
    String type;
    String color;
    double weight;
    String technology = "DLP"; // literal declaration

    public Projector(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Technology: " + technology);
        System.out.println();
    }
}

