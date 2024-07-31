class BuyRunner
{
	public static void main(String[] args)
	{
		Buy1.product("Lee",500);
		Buy1.product("hp",20);
		Buy1.product("Kerchief",20,"premium",400);
		Buy1.product("Lee", 2, "units", 200);
		Buy1.bookMovieTicket("John", "Milana", 2, 240);
		Buy1.bookMovieTicket("Jane", "Navrang",4, 480);
		Buy1.buyEgg(12, 7);
		Buy1.buyEgg(20, 7);
		Buy1.buyShampoo(500, 100, "Pantene", "01-01-2024");
		Buy1.buyShampoo(200, 80, "Dove", "01-06-2024");
		Buy1.buyCake('S', "Pastry", "Mango",160, 2);
		Buy1.buyCake('L', "Cheese", "Strawberry",300,3);
		Buy1.buyLaptop("Dell", 223456789, 65500, 6450, 15.6, "Windows", 500, 4);
		Buy1.buyLaptop("Lenovo",123456789, 50000,5200, 16.6, "Linux", 500, 8);
		Buy1.buySmartWatch("Samsung",3500,255, 'M',8);
		Buy1.buySmartWatch("Noise", 4000,65280, 'S',9);
	}
}