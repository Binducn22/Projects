class States{
	public static void state(String[] stateNames)
	{
		System.out.println("Start main States");
		for(int names=0; names<stateNames.length; names++)
		{
			String ref=stateNames[names];
			System.out.println("States:"+ref);
		}
		System.out.println("End main States");
	}
}
