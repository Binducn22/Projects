class Movie
{
	public static void user(String name,int age)
	{
		if(age>18){
		System.out.println("The movie ticket price is 1000rs");
		}
		else
		{
		System.out.println("The movie ticket price is 500rs");
		}
	}
	public static void main(String[] args)
	{
		user("Bindu",22);
		user("Prem",16);
	}
}