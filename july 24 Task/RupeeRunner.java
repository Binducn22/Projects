class RupeeRunner{
public static void main(String[] args)
{
System.out.println("Start main in RupeeRunner");
Rupee rupee=new Rupee();
int value=rupee.value;
String currency=rupee.currency;
String issuingAuthority=rupee.issuingAuthority;
System.out.println("rupee value:"+value);
System.out.println("rupee currency:"+currency);
System.out.println("rupee issuingAuthority:"+issuingAuthority);
System.out.println("Stop main in RupeeRunner");
}
}