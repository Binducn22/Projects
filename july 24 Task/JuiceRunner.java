class JuiceRunner {
    public static void main(String[] args) {
        System.out.println("Start main in JuiceRunner");
        Juice juice = new Juice();
        String flavor = juice.flavor;
        double price = juice.price;
        String brand = juice.brand;
        System.out.println("Juice flavor:" + flavor);
        System.out.println("Juice price:" + price);
        System.out.println("Juice brand:" + brand);

        juice.flavor = "Mango";
        juice.price = 40;
        juice.brand = "Maaza";
        System.out.println("Juice updated flavor:" + juice.flavor);
        System.out.println("Juice updated price:" + juice.price);
        System.out.println("Juice updated brand:" + juice.brand);
        System.out.println("Stop main in JuiceRunner");
    }
}


