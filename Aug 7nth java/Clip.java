class Clip {
    String color;
    String type;

    Clip(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void declareDetails() {
        System.out.println("Clip Details: Color=" + color + ", Type=" + type);
    }
}

