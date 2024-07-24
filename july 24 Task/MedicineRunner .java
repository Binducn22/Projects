class MedicineRunner {
    public static void main(String[] args) {
        System.out.println("Start main in MedicineRunner");
        Medicine medicine = new Medicine();
        String name = medicine.name;
        double price = medicine.price;
        String description = medicine.description;
        System.out.println("Medicine name:" + name);
        System.out.println("Medicine price:" + price);
        System.out.println("Medicine description:" + description);

        medicine.name = "Acetaminophen";
        medicine.price = 5.99;
        medicine.description = "Pain reliever";
        System.out.println("Medicine updated name:" + medicine.name);
        System.out.println("Medicine updated price:" + medicine.price);
        System.out.println("Medicine updated description:" + medicine.description);
        System.out.println("Stop main in MedicineRunner");
    }
}

