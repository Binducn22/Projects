class InformationRunner
{	
public static void main(String[] args)
{
String countryName1=Information.getCountry(234);
System.out.println("country name:"+countryName1);
String countryName2=Information.getCountry(91);
System.out.println("country name:"+countryName2);
String countryName3=Information.getCountry(61);
System.out.println("country name:"+countryName3);
String countryName4=Information.getCountry(84);
System.out.println("country name:"+countryName4);
String countryName5=Information.getCountry(72);
System.out.println("country name:"+countryName5);
String countryName6=Information.getCountry(6);
System.out.println("country name:"+countryName6);

double price=Information.getPrice("apple");
System.out.println("Item price:"+price);
double price1=Information.getPrice("banana");
System.out.println("Item price:"+price1);
double price2=Information.getPrice("milk");
System.out.println("Item price:"+price2);
double price3=Information.getPrice("bread");
System.out.println("Item price:"+price3);
double price4=Information.getPrice("eggs");
System.out.println("Item price:"+price4);
double price5=Information.getPrice("peanut");
System.out.println("Item price:"+price5);

String producer=Information.getProducer("Inception");
System.out.println("producer name:"+producer);
String producer1=Information.getProducer("Titanic");
System.out.println("producer name:"+producer1);
String producer2=Information.getProducer("The Godfather");
System.out.println("producer name:"+producer2);
String producer3=Information.getProducer("Avatar");
System.out.println("producer name:"+producer3);
String producer4=Information.getProducer("Forest Gump");
System.out.println("producer name:"+producer4);
String producer5=Information.getProducer("no");
System.out.println("producer name:"+producer5);
    }
}