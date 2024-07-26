public class Clock {
    String type;
    double price = 50.0;
    int hours;

    public Clock() {
        System.out.println("created Clock");
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.type = "Digital";
        clock.hours = 12;
        System.out.println("clock type:" + clock.type);
        System.out.println("clock price:" + clock.price);
        System.out.println("clock hours:" + clock.hours);
    }
}



