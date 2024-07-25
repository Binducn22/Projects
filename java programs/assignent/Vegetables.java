class Vegetables
{
	public static String vegetable(double price)
	{
			if(price>100 && price<500)
			{
				return "Costly";
			}
			else
			{
				return "Cheap";
			}
	}
	public static void main(String[] args)
	{
		String ref=Vegetables.vegetable(50);
		System.out.println("Vegetable is:"+ref);
	}
}
