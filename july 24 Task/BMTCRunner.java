class BMTCRunner {
    public static void main(String[] args) {
        System.out.println("Start main in BMTCRunner");
        BMTC bmtc = new BMTC();
        String busNumber = bmtc.busNumber;
        int routeNumber = bmtc.routeNumber;
        boolean isRunning = bmtc.isRunning;
        System.out.println("BMTC busNumber:" + busNumber);
        System.out.println("BMTC routeNumber:" + routeNumber);
        System.out.println("BMTC isRunning:" + isRunning);
        System.out.println("Stop main in BMTCRunner");
    }
}
