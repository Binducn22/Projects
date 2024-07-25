class HospitalRunner1 {
    public static void main(String[] args) {
        double priceofmedicine = HospitalRunner.getMedicinePrice("Action 500");
        System.out.println("priceofmedicine" + priceofmedicine);
		double priceofmedicine1 = HospitalRunner.getMedicinePrice("Paracetomal");
        System.out.println("priceofmedicine" + priceofmedicine1);
		double priceofmedicine2 = HospitalRunner.getMedicinePrice("Amlong");
        System.out.println("priceofmedicine" + priceofmedicine2);
	    double priceofmedicine3 = HospitalRunner.getMedicinePrice("dolo");
        System.out.println("priceofmedicine" + priceofmedicine3);
		
        String medicine = HospitalRunner.getMedicineName("fever");
        System.out.println("medicineName" + medicine);
		String medicine1 = HospitalRunner.getMedicineName("headache");
        System.out.println("medicineName" + medicine1);
		String medicine2 = HospitalRunner.getMedicineName("body pain");
        System.out.println("medicineName" + medicine2);
		String medicine3 = HospitalRunner.getMedicineName("gastritis");
        System.out.println("medicineName" + medicine3);
		
        String availability = HospitalRunner.getAvailability("Purshotham");
        System.out.println("DoctorAvailability " + availability);
		String availability1 = HospitalRunner.getAvailability("Bramkumar");
        System.out.println("DoctorAvailability " + availability1);
		String availability2 = HospitalRunner.getAvailability("Anjali");
        System.out.println("DoctorAvailability " + availability2);
		String availability3 = HospitalRunner.getAvailability("Ram");
        System.out.println("DoctorAvailability " + availability3);
    }
}