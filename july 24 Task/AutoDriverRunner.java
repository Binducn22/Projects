class AutoDriverRunner {
    public static void main(String[] args) {
        System.out.println("Start main in AutoDriverRunner");
        AutoDriver autoDriver = new AutoDriver();
        String name = autoDriver.name;
        int experience = autoDriver.experience;
        boolean isLicensed = autoDriver.isLicensed;
        System.out.println("AutoDriver name:" + name);
        System.out.println("AutoDriver experience:" + experience);
        System.out.println("AutoDriver isLicensed:" + isLicensed);
        System.out.println("Stop main in AutoDriverRunner");
    }
}


