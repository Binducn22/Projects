public class Lolipop {
    String flavor;
    double price = 1.0;
    int calories;

    public Lolipop() {
        System.out.println("created Lolipop");
    }

    public static void main(String[] args) {
        Lolipop lolipop = new Lolipop();
        lolipop.flavor = "Strawberry";
        lolipop.calories = 50;
        System.out.println("lolipop flavor:" + lolipop.flavor);
        System.out.println("lolipop price:" + lolipop.price);
        System.out.println("lolipop calories:" + lolipop.calories);
    }
}

