class CabCompanyRunner {
    public static void main(String[] args) {
        System.out.println("Start main in CabCompanyRunner");
        CabCompany cabCompany = new CabCompany();
        String companyName = cabCompany.companyName;
        int fleetSize = cabCompany.fleetSize;
        boolean isOperational = cabCompany.isOperational;
        System.out.println("CabCompany companyName:" + companyName);
        System.out.println("CabCompany fleetSize:" + fleetSize);
        System.out.println("CabCompany isOperational:" + isOperational);
        System.out.println("Stop main in CabCompanyRunner");
    }
}
