public class Crow {
    String color;
    double wingspan;
    double price = 0.0;

    public Crow() {
        System.out.println("created Crow");
    }

    public static void main(String[] args) {
        Crow crow = new Crow();
        crow.color = "Black";
        crow.wingspan = 2.5;
        System.out.println("crow color:" + crow.color);
        System.out.println("crow wingspan:" + crow.wingspan);
        System.out.println("crow price:" + crow.price);
    }
}

