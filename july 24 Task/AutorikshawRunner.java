class AutorikshawRunner {
    public static void main(String[] args) {
        System.out.println("Start main in AutorikshawRunner");
        Autorikshaw autorikshaw = new Autorikshaw();
        String registrationNumber = autorikshaw.registrationNumber;
        int capacity = autorikshaw.capacity;
        boolean isAvailable = autorikshaw.isAvailable;
        System.out.println("Autorikshaw registrationNumber:" + registrationNumber);
        System.out.println("Autorikshaw capacity:" + capacity);
        System.out.println("Autorikshaw isAvailable:" + isAvailable);
        System.out.println("Stop main in AutorikshawRunner");
    }
}


