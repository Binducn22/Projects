class Buy1
{
	public static void product(String brand,double price)
	{
		System.out.println("Brand: " + brand + ", Price: " + price);
		 if(price>=500){
            System.out.println("Buy Lee ");
        }
        else{
            System.out.println("buy hp : ");
        }
        
        

	}
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Name: " + name + ", Quantity: " + quantity + " quality:" + quality + ", Price: " + price);
		 if(quantity>=30 && price==20){
            System.out.println("Kerchief  quantity is premium");
        }
        else{
            System.out.println("Kerchief  quantity is wrong");
        }

        if(price==20 && price>60){
            System.out.println("it is  a good price");
        }
        else{
            System.out.println("price is to high");
        }

	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Name: " + name + ", Theater: " + theaterName + ", Quantity: " + quantity + ", Price: " + price);
		 if(quantity==2 && price==240){
            System.out.println("conform the booking");

        }
        else{
            System.out.println("Go back to menu");
        }

        if(price>=4 && quantity==480){
            System.out.println("Book movie tickets");
        }
        else{
            System.out.println("cancel the booking");
        }

	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Total: " + total + ", Price per egg: " + pricePerEgg);
		 if(total>12 && pricePerEgg==7){
            System.out.println("buy eggs");
        }
        else {
            System.out.println("don't buy");
        }

	}
	public static void buyShampoo(int quantityInMl,double price,String brand, String manfDate)
	{
		System.out.println("Quantity: " + quantityInMl + "Price: " + price + ", Brand: " + brand + ", Manufacture Date: " + manfDate);
		if(quantityInMl>=50 && price==100){
            System.out.println("BUy that shampoo");
        }
        else{
            System.out.println("don't buy that shampoo");
        
        }

	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Buy cake: Size: " + size + ", Type: " + type + ", Flavor: " + flavour + ", Cost: " + cost + ", Quantity: " + quantity);
		if(cost>300 && quantity>=3){
            System.out.println("Buy a cake");
        }
        else{
            System.out.println("don't buy a cake");
        }

	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Brand: " + brand + ", Serial No: " + serialNo + ", Price: " + price + ", Battery Capacity: " + batteryCapacity + ", Screen Size: " + screenSize + ", OS: " + os + ", Hard Disk Size: " + harddiskSize + ", RAM Size: " + ramSize);
		if(price>=50000){
            System.out.println("buy laptop");
        }
        else{
            System.out.println("don't buy laptop");
        }


	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Brand: " + brand + ", Price: " + price + ", Color: " + color + ", Type: " + type + ", Mode: " + mode);
		if(price>=4000 && color==255){
            System.out.println("buy that smartwatch");
        }
        else{
            System.out.println("dont buy that smart watch");
        }


	}
}