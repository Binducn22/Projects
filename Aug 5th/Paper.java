class Paper {
    double thickness;
    int size;
    String quality;
    String color;
    String material = "Wood Pulp"; // literal declaration

    public Paper(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Size: " + size + " inches");
        System.out.println("Quality: " + quality);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println();
    }
}
