class Product
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
    }
}

