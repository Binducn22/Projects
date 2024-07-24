class AlcoholBrandRunner {
    public static void main(String[] args) {
        System.out.println("Start main in AlcoholBrandRunner");
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        String name = alcoholBrand.name;
        double price = alcoholBrand.price;
        String type = alcoholBrand.type;
        System.out.println("AlcoholBrand name:" + name);
        System.out.println("AlcoholBrand price:" + price);
        System.out.println("AlcoholBrand type:" + type);

        alcoholBrand.name = "Johnnie Walker";
        alcoholBrand.price = 50.0;
        alcoholBrand.type = "Scotch Whisky";
        System.out.println("AlcoholBrand updated name:" + alcoholBrand.name);
        System.out.println("AlcoholBrand updated price:" + alcoholBrand.price);
        System.out.println("AlcoholBrand updated type:" + alcoholBrand.type);
        System.out.println("Stop main in AlcoholBrandRunner");
    }
}

