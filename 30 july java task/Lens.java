class Lens
 {
    String type;
    String focalLength;
    Lens(String typeLocal, String focalLengthLocal) 
	{
        type = typeLocal;
        focalLength = focalLengthLocal;
        System.out.println("Created lens using type, focal length");
    }
}
