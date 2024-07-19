class BusTicket //use return with void type
{
	public static void ticketPrice()
	{
		int ticketPrice=50;
		if (ticketPrice==100) 
		{
			System.out.println("Book Ticket");
			return;                                //will stop execution
			
		} 
		else
		{
			System.out.println("Don't book the ticket");     //will continue execution
		}
		return;         //stop the execution
	}
	public static void main(String[] args)
	{
		 BusTicket.ticketPrice();
	}
}
