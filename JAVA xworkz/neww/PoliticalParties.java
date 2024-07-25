class PoliticalParties
{
  public static void politicalParties(String[] parties) 
  {
    System.out.println("Start Political Parties");
    for (int i = 0; i < parties.length; i++) 
	{
      System.out.println("Party: " + parties[i]);
    }
    System.out.println("End Political Parties");
	    for (int i=parties.length-1; i>=0; i--)
		{
		      System.out.println("Party:" + parties[i]);
	
		} 

  }
}