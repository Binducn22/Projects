class FoodRunner {
    public static void main(String[] args) {
        System.out.println("Start main in FoodRunner");
        Food food = new Food();
        String name = food.name;
        double price = food.price;
        String cuisine = food.cuisine;
        System.out.println("Food name:" + name);
        System.out.println("Food price:" + price);
        System.out.println("Food cuisine:" + cuisine);

        food.name = "Pizza";
        food.price = 12.99;
        food.cuisine = "Italian";
        System.out.println("Food updated name:" + food.name);
        System.out.println("Food updated price:" + food.price);
        System.out.println("Food updated cuisine:" + food.cuisine);
        System.out.println("Stop main in FoodRunner");
    }
}


