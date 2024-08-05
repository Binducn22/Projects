class AeroplaneRunner
{
	public static void main (String[] args)
	{
		Aeroplane aeroplane=new Aeroplane();
		Aeroplane aeroplane1=new Aeroplane("AirIndia",150,2000,"Banglore","Manglore");
		System.out.println("Aeroplane company:"+aeroplane1.company);
		System.out.println("Aeroplane noOfSeats:"+aeroplane1.noOfSeats);
		System.out.println("Aeroplane ticketPrice:"+aeroplane1.ticketPrice);
		System.out.println("Aeroplane source:"+aeroplane1.source);
		System.out.println("Aeroplane destination:"+aeroplane1.destination);
		
		Aeroplane aeroplane2=new Aeroplane("IndiGo","Mumbai","Banglore");
		System.out.println("Aeroplane company:"+aeroplane2.company);
		System.out.println("Aeroplane source:"+aeroplane2.source);
		System.out.println("Aeroplane destination:"+aeroplane2.destination);
		
		Aeroplane aeroplane3=new Aeroplane("Vistara",5000,"chennai","Delhi");
		System.out.println("Aeroplane company:"+aeroplane3.company);
		System.out.println("Aeroplane ticketPrice:"+aeroplane3.ticketPrice);
		System.out.println("Aeroplane source:"+aeroplane3.source);
		System.out.println("Aeroplane destination:"+aeroplane3.destination);


	}

}