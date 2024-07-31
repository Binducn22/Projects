class HospitalRunner1 {
    public static void main(String[] args) {
        double price = HospitalRunner.getMedicinePrice("Saridon");
        System.out.println("medicineName" + price);
		double price1 = HospitalRunner.getMedicinePrice("Paracetomal");
        System.out.println("medicineName" + price1);
		double price2 = HospitalRunner.getMedicinePrice("Azithromycin");
        System.out.println("medicineName" + price2);
	    double price3 = HospitalRunner.getMedicinePrice("dolo");
        System.out.println("medicineName" + price3);
		
        String medicine = HospitalRunner.getMedicineName("Fever");
        System.out.println("medicineName" + medicine);
		String medicine1 = HospitalRunner.getMedicineName("headache");
        System.out.println("medicineName" + medicine1);
		String medicine2 = HospitalRunner.getMedicineName("Infection");
        System.out.println("medicineName" + medicine2);
		String medicine3 = HospitalRunner.getMedicineName("pain");
        System.out.println("medicineName" + medicine3);
		
        String availability = HospitalRunner.getAvailability("Doctor Parmesh");
        System.out.println("DoctorAvailability " + availability);
		String availability1 = HospitalRunner.getAvailability("Doctor Rachita");
        System.out.println("DoctorAvailability " + availability1);
		String availability2 = HospitalRunner.getAvailability("Doctor Divya");
        System.out.println("DoctorAvailability " + availability2);
		String availability3 = HospitalRunner.getAvailability("Doctor Ram");
        System.out.println("DoctorAvailability " + availability3);
    }
}