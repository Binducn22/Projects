class LampRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LampRunner");
		
		Lamp lamp=new Lamp("Tablelamp","Small");
		System.out.println("Lamp type:"+lamp.type);
		System.out.println("Lamp size:"+lamp.size);
		
		Lamp lamp1=new Lamp("Floorlamp","Small");
		System.out.println("Lamp type:"+lamp1.type);
		System.out.println("Lamp size:"+lamp1.size);
		
		Lamp lamp2=new Lamp("Desk lamp","Medium");
		System.out.println("Lamp type:"+lamp2.type);
		System.out.println("Lamp size:"+lamp2.size);
		
		Lamp lamp3=new Lamp("Ceiling lamp","large");
		System.out.println("Lamp type:"+lamp3.type);
		System.out.println("Lamp size:"+lamp3.size);

		Lamp lamp4=new Lamp("Torch lamp","Small");
		System.out.println("Lamp type:"+lamp4.type);
		System.out.println("Lamp size:"+lamp4.size);
		
		Lamp lamp5=new Lamp("Reading lamp","Small");
		System.out.println("Lamp type:"+lamp5.type);
		System.out.println("Lamp size:"+lamp5.size);

		Lamp lamp6=new Lamp("Bedside lamp","Medium");
		System.out.println("Lamp type:"+lamp6.type);
		System.out.println("Lamp size:"+lamp6.size);
		
		Lamp lamp7=new Lamp("Led lamp","Medium");
		System.out.println("Lamp type:"+lamp7.type);
		System.out.println("Lamp size:"+lamp7.size);

		Lamp lamp8=new Lamp("Neon lamp","large");
		System.out.println("Lamp type:"+lamp8.type);
		System.out.println("Lamp size:"+lamp8.size);

		Lamp lamp9=new Lamp("Security lamp","large");
		System.out.println("Lamp type:"+lamp9.type);
		System.out.println("Lamp size:"+lamp9.size);

		Lamp lamp10=new Lamp("Solarlamp","Medium");
		System.out.println("Lamp type:"+lamp10.type);
		System.out.println("Lamp size:"+lamp10.size);

		System.out.println("End main in LampRunner");
	}
}