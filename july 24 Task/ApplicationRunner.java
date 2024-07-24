class ApplicationRunner
{
public static void main(String[] args)
{
System.out.println("Start main in ApplicationRunner");
Application application=new Application();
String appName=application.appName;
boolean isInstalled=application.isInstalled;
String version=application.version;
System.out.println("application appName:"+appName);
System.out.println("application isInstalled:"+isInstalled);
System.out.println("application version:"+version);
System.out.println("Stop main in ApplicationRunner");
application.appName="Whatsapp";
application.isInstalled=true;
application.version="24.6";
System.out.println("application updated appName:"+application.appName);
System.out.println("application updated isInstalled:"+application.isInstalled);
System.out.println("application updated version:"+application.version);

}
}