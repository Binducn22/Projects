class States1
{
    public static void state(String[] statename)
    {
        System.out.println("running state in states");
        for ( int i=0;i<statename.length;i++)
        {
            System.out.println(statename[i]);

        }
		for ( int i=statename.length-1;i>=0;i--)
        {
            System.out.println(statename[i]);

        }
    }
}
