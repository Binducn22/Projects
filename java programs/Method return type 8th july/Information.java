class Information{
    
    public static String getCountry(int code) {
        if (code == 234)
		{
            return "USA";
        } 
		else if (code == 91)
		{
            return "India";
        } 
		else if (code == 61)
		{
            return "France";
        } 
		else if (code == 84) 
		{
            return "Japan";
        } 
		else if (code == 72)
		{
            return "Brazil";
        } 
		else 
		{
            return "Country not found for this code.";
        }
    }

    public static double getPrice(String item) {
        if (item=="apple")
		{
            return 100;
        } else if (item=="banana") {
            return 5;
        } else if (item=="milk") {
            return 26;
        } else if (item=="bread") {
            return 30;
        } else if (item=="eggs") {
            return 7.0;
        } else {
            return -1; // Price not found for this item
        }
    }

    public static String getProducer(String movieName) {
        if (movieName=="Inception") {
            return "Christopher Nolan";
        } else if (movieName=="Titanic") {
            return "James Cameron";
        } else if (movieName=="The Godfather") {
            return "Francis Ford Coppola";
        } else if (movieName=="Avatar") {
            return "James Cameron";
        } else if (movieName=="Forest Gump") {
            return "Wendy Finerman";
        } else {
            return "Producer not found for this movie.";
        }
    }
 }

