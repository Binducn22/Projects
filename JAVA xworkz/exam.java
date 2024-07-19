class exam
{
	public static void test()
	{ 
	   System.out.println(" test postponed");
	   test();
	}
	public static void internals()
	{
	   System.out.println("internals postponed");
	   internals();
	}
}
class prepareforexam
{
	public static void main(String[] args)
	{
	prepareforexam.test();
	prepareforexam.internals();
	}
}
