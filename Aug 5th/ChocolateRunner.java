class ChocolateRunner {
    public static void main(String[] values) {
        Chocolate chocolate = new Chocolate("Cadbury");
        chocolate.price = 5;
        chocolate.flavor = "Milk Chocolate";
        chocolate.size = 50;
        chocolate.display();

        Chocolate chocolate1 = new Chocolate("Hershey's");
        chocolate1.price = 6;
        chocolate1.flavor = "Dark Chocolate";
        chocolate1.size = 60;
        chocolate1.display();

        Chocolate chocolate2 = new Chocolate("Lindt");
        chocolate2.price = 7;
        chocolate2.flavor = "White Chocolate";
        chocolate2.size = 70;
        chocolate2.display();
    }
}

