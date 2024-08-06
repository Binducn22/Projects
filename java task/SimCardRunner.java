class SimCardRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in SimCardRunner");
		
		SimCard simCard=new SimCard("Airtel","small","128gb");
		System.out.println("SimCard name:"+simCard.name);
		System.out.println("SimCard size:"+simCard.size);
		System.out.println("SimCard capacity:"+simCard.capacity);

		
		SimCard simCard1=new SimCard("Jio","small","64gb");
		System.out.println("SimCard name:"+simCard1.name);
		System.out.println("SimCard size:"+simCard1.size);
		System.out.println("SimCard capacity:"+simCard1.capacity);
		
		SimCard simCard2=new SimCard("vodafone","small","64gb");
		System.out.println("SimCard name:"+simCard2.name);
		System.out.println("SimCard size:"+simCard2.size);
		System.out.println("SimCard capacity:"+simCard2.capacity);
		
		SimCard simCard3=new SimCard("bsnl","medium","128gb");
		System.out.println("SimCard name:"+simCard3.name);
		System.out.println("SimCard size:"+simCard3.size);
		System.out.println("SimCard capacity:"+simCard3.capacity);

		SimCard simCard4=new SimCard("Idea","medium","64gb");
		System.out.println("SimCard name:"+simCard4.name);
		System.out.println("SimCard size:"+simCard4.size);
		System.out.println("SimCard capacity:"+simCard4.capacity);
		
		SimCard simCard5=new SimCard("verizon","small","128gb");
		System.out.println("SimCard name:"+simCard5.name);
		System.out.println("SimCard size:"+simCard5.size);
		System.out.println("SimCard capacity:"+simCard5.capacity);
		
		SimCard simCard6=new SimCard("Airtel","small","256gb");
		System.out.println("SimCard name:"+simCard6.name);
		System.out.println("SimCard size:"+simCard6.size);
		System.out.println("SimCard capacity:"+simCard6.capacity);
		
		SimCard simCard7=new SimCard("bsnl","small","256gb");
		System.out.println("SimCard name:"+simCard7.name);
		System.out.println("SimCard size:"+simCard7.size);
		System.out.println("SimCard capacity:"+simCard7.capacity);

		SimCard simCard8=new SimCard("Jio","medium","256gb");
		System.out.println("SimCard name:"+simCard8.name);
		System.out.println("SimCard size:"+simCard8.size);
		System.out.println("SimCard capacity:"+simCard8.capacity);

		SimCard simCard9=new SimCard("vodafone","large","256gb");
		System.out.println("SimCard name:"+simCard9.name);
		System.out.println("SimCard size:"+simCard9.size);
		System.out.println("SimCard capacity:"+simCard9.capacity);

		SimCard simCard10=new SimCard("Idea","small","128gb");
		System.out.println("SimCard name:"+simCard10.name);
		System.out.println("SimCard size:"+simCard10.size);
		System.out.println("SimCard capacity:"+simCard10.capacity);
		
		System.out.println("End main in SimCardRunner");
	}
}