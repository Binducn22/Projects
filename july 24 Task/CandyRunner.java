class CandyRunner {
    public static void main(String[] args) {
        System.out.println("Start main in CandyRunner");
        Candy candy = new Candy();
        String flavor = candy.flavor;
        double price = candy.price;
        String brand = candy.brand;
        System.out.println("Candy flavor:" + flavor);
        System.out.println("Candy price:" + price);
        System.out.println("Candy brand:" + brand);

        candy.flavor = "Strawberry";
        candy.price = 1.99;
        candy.brand = "Haribo";
        System.out.println("Candy updated flavor:" + candy.flavor);
        System.out.println("Candy updated price:" + candy.price);
        System.out.println("Candy updated brand:" + candy.brand);
        System.out.println("Stop main in CandyRunner");
    }
}

