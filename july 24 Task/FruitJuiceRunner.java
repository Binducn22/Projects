class FruitJuiceRunner
{
public static void main(String[] args)
{
System.out.println("Start main in FruitJuiceRunner");
FruitJuice fruitJuice=new FruitJuice();
String flavor=fruitJuice.flavor;
double price=fruitJuice.price;
String brand=fruitJuice.brand;
System.out.println("fruitJuice flavor:"+flavor);
System.out.println("fruitJuice price:"+price);
System.out.println("fruitJuice brand:"+brand);
System.out.println("Stop main in FruitJuiceRunner");
fruitJuice.flavor="Mango";
fruitJuice.price=40;
fruitJuice.brand="Maaza";
System.out.println("FruitJuice updated flavor:"+fruitJuice.flavor);
System.out.println("FruitJuice updated price:"+fruitJuice.price);
System.out.println("FruitJuice updated brand:"+fruitJuice.brand);

}
}