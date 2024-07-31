class Vegetables12 {
    public static String vegetable(double price) {
        String budget;
        if (price >= 100 && price <= 500) {
            budget = "costly";
        } else {
            budget = "Cheap";
        }
        return budget;
    }

    public static void main(String[] args) {
        String result = Vegetables12.vegetable(600);
        System.out.println("Vegetable is:" + result);
    }
}





