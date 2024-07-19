class BuyRunner1 
{
    public static void main(String [] args)
	{
        Buy3.product("nike", 500);
        Buy3.product("nike",400);
        Buy3.product("idly",2,"good",30);
        Buy3.product("idly",1,"good",30);
        Buy3.product("idly",2,"good",40);
        Buy3.product("idly",1,"good",100);
        Buy3.bookMovieTicket("kalki2892AD","",3,200);
        Buy3.bookMovieTicket("kalki2892AD","cinima",4,200);
        Buy3.bookMovieTicket("kalki2892AD","cinima",5,600);
        Buy3.bookMovieTicket("kalki2892AD","cinima",6,300);
        Buy3.buyEgg(8, 6);
        Buy3.buyEgg(3, 6);
        Buy3.buyShampoo(50,300,"Dove","22024" );
        Buy3.buyShampoo(40,300,"Dove","232024" );
        Buy3.buyCake('s', "square","chocolet", 800, 2);
        Buy3.buyCake('s', "square","chocolet", 600, 2);
        Buy3.buyLaptop("dell", 222, 30000, 6000, 15, "windows", 16, 8);
        Buy3.buyLaptop("dell", 222, 29000, 6000, 15, "windows", 16, 8);
        Buy3.buySmartWatch("boat",2500,"black",'M',102);
        Buy3.buySmartWatch("boat",2000,"black",'M',102);  
    }  
}