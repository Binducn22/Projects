class Product1 // method without return as the last statement with return type
{
	public static String buyOptions(int productPrice)
	{
		if (productPrice>0 && productPrice<500)
		{
			return "Buy the product";
		} 
		else if(productPrice>=500)
		{
			return "Don't buy the product";
		}
		else
		{
			return "Invalid price";
		}
    }
	public static void main(String[] args)
	{
		String ref = Product1.buyOptions(400);
		System.out.println("Buying Options:"+ref);
	}
}
