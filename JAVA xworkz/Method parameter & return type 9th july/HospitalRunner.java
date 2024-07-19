class HospitalRunner{

    public static double getMedicinePrice(String medicineName) {
        if (medicineName=="paracetomal")
		{
            return 10.0;
        } 
		else if (medicineName=="dolo") 
		{
            return 15.0;
        } 
		else if (medicineName=="")
		{
            return 20.0;
        }
		else
		{
            return -1; 
        }
    }

    public static String getMedicineName(String symptom) 
	{
        if (symptom=="fever")
		{
            return "paracetomal";
        } 
		else if (symptom=="Headache") 
		{
            return "Action 500";
        }
		else if (symptom=="body pain") 
		{
            return "Aspirin";
        }
		else 
		{
            return "Medicine not found for this symptom";
        }
    }

    public static String getAvailability(String doctorName) {
        if (doctorName=="Purshotham")
		{
            return "Available on Mondays and Wednesdays";
        } 
		else if (doctorName=="Bramkumar")
		{
            return "Available on Tuesdays and Thursdays";
        }
		else if (doctorName=="Anjali")
		{
            return "Available on Fridays and Saturdays";
        }
		else
		{
            return "Availability not found for this doctor";
        }
    }
 }