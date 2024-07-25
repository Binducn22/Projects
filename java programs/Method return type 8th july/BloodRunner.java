class BloodRunner
{
	public static void main(String[] args)
	{
		char value=Blood.group();
		System.out.println("group : "+value);
		String name=Blood.personName();
		System.out.println("personName : "+name);
		double costRef=Blood.cost();
		System.out.println("cost : "+costRef);
		boolean ref=Blood.hospitalTested();
		System.out.println("hospitalTested : "+ref);
		boolean ref1=Blood.sicknessOrNot();
		System.out.println("sickness: "+ref1);
		boolean ref2=Blood.donateOrNot();
		System.out.println("donate:"+ref2);
	}
}