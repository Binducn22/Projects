class ChainRunner
{
	public static void main(String[] args)
	{
		int value=Chain.carat();
		System.out.println("carat :"+value);
		double cost=Chain.costPerGram();
		System.out.println("costPerGram : "+cost);
		String name=Chain.type();
		System.out.println("type : "+name);
		String name1=Chain.quality();
		System.out.println("quality : "+name1);
		int value1=Chain.quantity();
		System.out.println("quantity : "+value1);
		String name2=Chain.wastage();
		System.out.println("wastage : "+name2);
		double cost1=Chain.serviceCharge();
		System.out.println("serviceCharge : "+cost1);
		String name3=Chain.GST();
		System.out.println("GST return type: "+name3);
	}
}
