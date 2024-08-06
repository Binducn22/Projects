class SpeakerRunner
{
public static void main(String[] values) {
Speaker speaker=new Speaker(4); 
speaker.setBrand("Bluetooth");
speaker.cost=2000;
speaker.display();

Speaker speaker1=new Speaker(6);
speaker1.setBrand("Home Theater");
speaker1.cost=5000;
speaker1.display();

Speaker speaker2=new Speaker(7);
speaker2.setBrand("Woofer of Philips");
speaker2.cost=8000;
speaker2.display();

}
}