class AirConditionRunner {
    public static void main(String[] args) {
        System.out.println("Start main in AirConditionRunner");
        AirCondition ac = new AirCondition();
        String brand = ac.brand;
        double temperature = ac.temperature;
        boolean isOn = ac.isOn;
        System.out.println("AirCondition brand:" + brand);
        System.out.println("AirCondition temperature:" + temperature);
        System.out.println("AirCondition isOn:" + isOn);
        System.out.println("Stop main in AirConditionRunner");
    }
}

