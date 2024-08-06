class GoldRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in GoldRunner");
		
		Gold gold=new Gold("24","10g","high");
		System.out.println("Gold karat:"+gold.karat);
		System.out.println("Gold weight:"+gold.weight);
		System.out.println("Gold purity:"+gold.purity);

		
		Gold gold1=new Gold("22","20g","low");
		System.out.println("Gold karat:"+gold1.karat);
		System.out.println("Gold weight:"+gold1.weight);
		System.out.println("Gold purity:"+gold1.purity);
		
		Gold gold2=new Gold("24","25g","high");
		System.out.println("Gold karat:"+gold2.karat);
		System.out.println("Gold weight:"+gold2.weight);
		System.out.println("Gold purity:"+gold2.purity);
		
		Gold gold3=new Gold("22","10g","high");
		System.out.println("Gold karat:"+gold3.karat);
		System.out.println("Gold weight:"+gold3.weight);
		System.out.println("Gold purity:"+gold3.purity);

		Gold gold4=new Gold("24","20g","low");
		System.out.println("Gold karat:"+gold4.karat);
		System.out.println("Gold weight:"+gold4.weight);
		System.out.println("Gold purity:"+gold4.purity);
		
		Gold gold5=new Gold("24","40g","high");
		System.out.println("Gold karat:"+gold5.karat);
		System.out.println("Gold weight:"+gold5.weight);
		System.out.println("Gold purity:"+gold5.purity);

		Gold gold6=new Gold("20","30g","high");
		System.out.println("Gold karat:"+gold6.karat);
		System.out.println("Gold weight:"+gold6.weight);
		System.out.println("Gold purity:"+gold6.purity);
		
		Gold gold7=new Gold("24","23g","high");
		System.out.println("Gold karat:"+gold7.karat);
		System.out.println("Gold weight:"+gold7.weight);
		System.out.println("Gold purity:"+gold7.purity);

		Gold gold8=new Gold("24","10g","low");
		System.out.println("Gold karat:"+gold8.karat);
		System.out.println("Gold weight:"+gold8.weight);
		System.out.println("Gold purity:"+gold8.purity);

		Gold gold9=new Gold("20","20g","high");
		System.out.println("Gold karat:"+gold9.karat);
		System.out.println("Gold weight:"+gold9.weight);
		System.out.println("Gold purity:"+gold9.purity);

		Gold gold10=new Gold("24","35g","high");
		System.out.println("Gold karat:"+gold10.karat);
		System.out.println("Gold weight:"+gold10.weight);
		System.out.println("Gold purity:"+gold10.purity);

		System.out.println("End main in GoldRunner");
	}
}