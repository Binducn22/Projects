class CountryNameRunner{
public static void main(String[] args) {
String countryName1=CountryName.getCountry(1);
System.out.println("country name:"+countryName1);
String countryName2=CountryName.getCountry(2);
System.out.println("country name:"+countryName2);
String countryName3=CountryName.getCountry(3);
System.out.println("country name:"+countryName3);
String countryName4=CountryName.getCountry(4);
System.out.println("country name:"+countryName4);
String countryName5=CountryName.getCountry(5);
System.out.println("country name:"+countryName5);
String countryName6=CountryName.getCountry(6);
System.out.println("country name:"+countryName6);
double price=CountryName.getPrice("apple");
System.out.println("country name:"+price);
double price1=CountryName.getPrice("banana");
System.out.println("country name:"+price1);
double price2=CountryName.getPrice("milk");
System.out.println("country name:"+price2);
double price3=CountryName.getPrice("bread");
System.out.println("country name:"+price3);
double price4=CountryName.getPrice("eggs");
System.out.println("country name:"+price4);
double price5=CountryName.getPrice("no");
System.out.println("country name:"+price5);
String producer=CountryName.getProducer("Inception");
System.out.println("country name:"+producer);
String producer1=CountryName.getProducer("Titanic");
System.out.println("country name:"+producer1);
String producer2=CountryName.getProducer("The Godfather");
System.out.println("country name:"+producer2);
String producer3=CountryName.getProducer("Avatar");
System.out.println("country name:"+producer3);
String producer4=CountryName.getProducer("Forrest Gump");
System.out.println("country name:"+producer4);
String producer5=CountryName.getProducer("no");
System.out.println("country name:"+producer5);
    }
}