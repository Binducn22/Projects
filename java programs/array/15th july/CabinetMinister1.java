class CabinetMinister1
{
    public static void cabinet(String[] cabinetministersname)
    {
        System.out.println("running cabinet in CabinetMinisters");
        for ( int i=0;i<cabinetministersname.length;i++)
        {
            System.out.println(cabinetministersname[i]);

        }
		System.out.println("running cabinet in CabinetMinistersBackward");
		for(int i=cabinetministersname.length-1;i>=0;i--)
		{
		    System.out.println(cabinetministersname[i]);
	
		}

    }
}
