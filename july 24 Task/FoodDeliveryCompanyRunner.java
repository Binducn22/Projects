class FoodDeliveryCompanyRunner {
    public static void main(String[] args) {
        System.out.println("Start main in FoodDeliveryCompanyRunner");
        FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
        String companyName = foodDeliveryCompany.companyName;
        int deliveryTime = foodDeliveryCompany.deliveryTime;
        boolean isDelivering = foodDeliveryCompany.isDelivering;
        System.out.println("FoodDeliveryCompany companyName:" + companyName);
        System.out.println("FoodDeliveryCompany deliveryTime:" + deliveryTime);
        System.out.println("FoodDeliveryCompany isDelivering:" + isDelivering);
        System.out.println("Stop main in FoodDeliveryCompanyRunner");
    }
}

