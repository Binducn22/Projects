class PrimeMinister1
 {
  public static void primeminister(String[] primeministers)
  {
    System.out.println("Start primeminister");
    for(int names=0; names<primeministers.length; names++) 
	{
	  String pm=primeministers[names];
      System.out.println("Prime Minister: " + pm);
    }
    System.out.println("End primeminister");
	for(int names=primeministers.length-1; names>=0; names--) 
	{
	  String pm=primeministers[names];
      System.out.println("Prime Minister: " + pm);
    }
  }
}