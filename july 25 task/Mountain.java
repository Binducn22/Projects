public class Mountain {
    String name;
    double height;
    double price = 0.0;

    public Mountain() {
        System.out.println("created Mountain");
    }

    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        mountain.name = "Everest";
        mountain.height = 8848.86;
        System.out.println("mountain name:" + mountain.name);
        System.out.println("mountain height:" + mountain.height);
        System.out.println("mountain price:" + mountain.price);
    }
}
