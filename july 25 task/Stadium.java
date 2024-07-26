public class Stadium {
    String name;
    double capacity;
    double price = 0.0;

    public Stadium() {
        System.out.println("created Stadium");
    }

    public static void main(String[] args) {
        Stadium stadium = new Stadium();
        stadium.name = "Wembley";
        stadium.capacity = 90000;
        System.out.println("stadium name:" + stadium.name);
        System.out.println("stadium capacity:" + stadium.capacity);
        System.out.println("stadium price:" + stadium.price);
    }
}

