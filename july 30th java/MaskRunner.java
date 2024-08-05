class MaskRunner
{
	public static void main (String[] args)
	{
		Mask mask=new Mask();
		Mask mask1=new Mask(100);
		System.out.println("Mask cost:"+mask1.cost);
		
Mask mask2=new Mask('S');
		System.out.println("Mask size:"+mask2.size);
		
		Mask mask3=new Mask("cotton");
		System.out.println("Mask material:"+mask3.material);
		
		Mask mask4=new Mask(150,'M');
		System.out.println("Mask cost:"+mask4.cost);
				System.out.println("Mask size:"+mask4.size);

		Mask mask5=new Mask(200,'L',"Nylon");
		System.out.println("Mask cost:"+mask5.cost);
				System.out.println("Mask size:"+mask5.size);
		System.out.println("Mask material:"+mask5.material);


	}

}