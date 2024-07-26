public class Keyboard {
    String type;
    double price = 100.0;
    int keys;

    public Keyboard() {
        System.out.println("created Keyboard");
    }

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.type = "Wireless";
        keyboard.keys = 104;
        System.out.println("keyboard type:" + keyboard.type);
        System.out.println("keyboard price:" + keyboard.price);
        System.out.println("keyboard keys:" + keyboard.keys);
    }
}
