class LedRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LedRunner");
		
		Led led=new Led("blue","20","10");
		System.out.println("Led color:"+led.color);
		System.out.println("Led cost:"+led.cost);
		System.out.println("Led voltage:"+led.voltage);

		
		Led led1=new Led("red","10","20");
		System.out.println("Led color:"+led1.color);
		System.out.println("Led cost:"+led1.cost);
		System.out.println("Led voltage:"+led1.voltage);
		
		Led led2=new Led("green","20","30");
		System.out.println("Led color:"+led2.color);
		System.out.println("Led cost:"+led2.cost);
		System.out.println("Led voltage:"+led2.voltage);
		
		Led led3=new Led("black","30","10");
		System.out.println("Led color:"+led3.color);
		System.out.println("Led cost:"+led3.cost);
		System.out.println("Led voltage:"+led3.voltage);

		Led led4=new Led("white","20","20");
		System.out.println("Led color:"+led4.color);
		System.out.println("Led cost:"+led4.cost);
		System.out.println("Led voltage:"+led4.voltage);
		
		Led led5=new Led("pink","20","10");
		System.out.println("Led color:"+led5.color);
		System.out.println("Led cost:"+led5.cost);
		System.out.println("Led voltage:"+led5.voltage);
		
		Led led6=new Led("orange","20","30");
		System.out.println("Led color:"+led6.color);
		System.out.println("Led cost:"+led6.cost);
		System.out.println("Led voltage:"+led6.voltage);
		
		Led led7=new Led("blue","20","30");
		System.out.println("Led color:"+led7.color);
		System.out.println("Led cost:"+led7.cost);
		System.out.println("Led voltage:"+led7.voltage);

		Led led8=new Led("black","30","50");
		System.out.println("Led color:"+led8.color);
		System.out.println("Led cost:"+led8.cost);
		System.out.println("Led voltage:"+led8.voltage);

		Led led9=new Led("green","20","20");
		System.out.println("Led color:"+led9.color);
		System.out.println("Led cost:"+led9.cost);
		System.out.println("Led voltage:"+led9.voltage);

		Led led10=new Led("red","20","10");
		System.out.println("Led color:"+led10.color);
		System.out.println("Led cost:"+led10.cost);
		System.out.println("Led voltage:"+led10.voltage);

		System.out.println("End main in LedRunner");
	}
}