class Charger {
    String type;
    int power;
    double price = 200.0;

    public Charger() {
        System.out.println("created Charger");
    }

    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.type = "USB";
        charger.power = 10;
        System.out.println("charger type:" + charger.type);
        System.out.println("charger power:" + charger.power);
        System.out.println("charger price:" + charger.price);
    }
}
