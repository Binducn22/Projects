class LensRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LensRunner");
		
		Lens lens=new Lens("Cylindrical","50mm");
		System.out.println("Lens type:"+lens.type);
		System.out.println("Lens focalLength:"+lens.focalLength);
		
		Lens lens1=new Lens("Optical","20mm");
		System.out.println("Lens type:"+lens1.type);
		System.out.println("Lens focalLength:"+lens1.focalLength);
		
		Lens lens2=new Lens("Concave","30mm");
		System.out.println("Lens type:"+lens2.type);
		System.out.println("Lens focalLength:"+lens2.focalLength);
		
		Lens lens3=new Lens("Convex","40mm");
		System.out.println("Lens type:"+lens3.type);
		System.out.println("Lens focalLength:"+lens3.focalLength);

		Lens lens4=new Lens("Standard","50mm");
		System.out.println("Lens type:"+lens4.type);
		System.out.println("Lens focalLength:"+lens4.focalLength);
		
		Lens lens5=new Lens("Macro","70mm");
		System.out.println("Lens type:"+lens5.type);
		System.out.println("Lens focalLength:"+lens5.focalLength);

		Lens lens6=new Lens("Wide-Angle","60mm");
		System.out.println("Lens type:"+lens6.type);
		System.out.println("Lens focalLength:"+lens6.focalLength);
		
		Lens lens7=new Lens("Telephoto","30mm");
		System.out.println("Lens type:"+lens7.type);
		System.out.println("Lens focalLength:"+lens7.focalLength);

		Lens lens8=new Lens("Fisheye","10mm");
		System.out.println("Lens type:"+lens8.type);
		System.out.println("Lens focalLength:"+lens8.focalLength);

		Lens lens9=new Lens("Infrared","40mm");
		System.out.println("Lens type:"+lens9.type);
		System.out.println("Lens focalLength:"+lens9.focalLength);

		Lens lens10=new Lens("Tilt","30mm");
		System.out.println("Lens type:"+lens10.type);
		System.out.println("Lens focalLength:"+lens10.focalLength);

		System.out.println("End main in PrintingMachineRunner");
	}
}