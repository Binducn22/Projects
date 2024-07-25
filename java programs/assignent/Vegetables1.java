class Vegetables1
{
	public static void vegetable(double price)
	{
		String budget;
		if (price > 100 && price < 500) 
		{
		budget = "costly";
		} 
		else 
		{
		budget = "Cheap";
		}
		return budget;
	
	}
	public static void main(String[] args)
	{
		String ref=Vegetables1.vegetable(50);
		System.out.println("Vegetable is:"+ref);
	}
}