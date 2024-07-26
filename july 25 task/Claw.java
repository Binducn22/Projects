public class Claw {
    String material;
    double length;
    double price = 15.0;

    public Claw() {
        System.out.println("created Claw");
    }

    public static void main(String[] args) {
        Claw claw = new Claw();
        claw.material = "Metal";
        claw.length = 10.5;
        System.out.println("claw material:" + claw.material);
        System.out.println("claw length:" + claw.length);
        System.out.println("claw price:" + claw.price);
    }
}

