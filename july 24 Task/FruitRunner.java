class FruitRunner {
    public static void main(String[] args) {
        System.out.println("Start main in FruitRunner");
        Fruit fruit = new Fruit();
        String name = fruit.name;
        String color = fruit.color;
        double price = fruit.price;
        System.out.println("Fruit name:" + name);
        System.out.println("Fruit color:" + color);
        System.out.println("Fruit price:" + price);

        fruit.name = "Apple";
        fruit.color = "Red";
        fruit.price = 0.99;
        System.out.println("Fruit updated name:" + fruit.name);
        System.out.println("Fruit updated color:" + fruit.color);
        System.out.println("Fruit updated price:" + fruit.price);
        System.out.println("Stop main in FruitRunner");
    }
}


