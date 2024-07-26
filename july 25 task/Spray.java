public class Spray {
    String type;
    double price = 10.0;
    int quantity;

    public Spray() {
        System.out.println("created Spray");
    }

    public static void main(String[] args) {
        Spray spray = new Spray();
        spray.type = "Insecticide";
        spray.quantity = 500;
        System.out.println("spray type:" + spray.type);
        System.out.println("spray price:" + spray.price);
        System.out.println("spray quantity:" + spray.quantity);
    }
}
