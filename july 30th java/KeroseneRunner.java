class KeroseneRunner
{
	public static void main (String[] args)
	{
		Kerosene kerosene=new Kerosene();
		Kerosene kerosene1=new Kerosene(400,4,true);
		System.out.println("kerosene1 price:"+kerosene1.price);
		System.out.println("kerosene1 quantity:"+kerosene1.quantity);
		System.out.println("kerosene1 quality:"+kerosene1.quality);
		
		Kerosene kerosene2=new Kerosene(true);
		System.out.println("kerosene2 quality:"+kerosene2.quality);

		Kerosene kerosene3=new Kerosene(500);
		System.out.println("kerosene3 price:"+kerosene3.price);

	}

}