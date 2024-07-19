class Buy
{
	public static void product(String brand,double price)
	{
		System.out.println("Brand: " + brand + ", Price: " + price);
	}
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Name: " + name + ", Quantity: " + quantity + " quality:" + quality + ", Price: " + price);
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Name: " + name + ", Theater: " + theaterName + ", Quantity: " + quantity + ", Price: " + price);
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Total: " + total + ", Price per egg: " + pricePerEgg);
	}
	public static void buyShampoo(int quantityInMl,double price,String brand, String manfDate)
	{
		System.out.println("Quantity: " + quantityInMl + "Price: " + price + ", Brand: " + brand + ", Manufacture Date: " + manfDate);
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		 System.out.println("Buy cake: Size: " + size + ", Type: " + type + ", Flavor: " + flavour + ", Cost: " + cost + ", Quantity: " + quantity);
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Brand: " + brand + ", Serial No: " + serialNo + ", Price: " + price + ", Battery Capacity: " + batteryCapacity + ", Screen Size: " + screenSize + ", OS: " + os + ", Hard Disk Size: " + harddiskSize + ", RAM Size: " + ramSize);

	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Brand: " + brand + ", Price: " + price + ", Color: " + color + ", Type: " + type + ", Mode: " + mode);
	}
}
	
	