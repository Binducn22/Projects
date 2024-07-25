class Paint{
    public static void brand(String brand){
        System.out.println("brand:" + brand);
    }

    public static void details(String brand, String color){
        System.out.println("brand:" + brand + ",color:" + color);
    }

    public static void price(String brand, double price){
        System.out.println("brand:" + brand + ",price:" + price);
    }

    public static void info(String color, String type, double price){
        System.out.println("color:" + color + ",type:" + type + ",price:" + price);
    }

    public static void main(String[] args) {
		
		
        brand("Nippon");
        details("Burger", "Blue");
        price("Asian", 9999);
        info("Pink", "Enamel", 670.78);
    }
}