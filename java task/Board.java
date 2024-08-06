class Board {
    String type;
    String size;
    String length;
    Board(String typeLocal, String sizeLocal, String lengthLocal) {
        type = typeLocal;
        size = sizeLocal;
       length = lengthLocal;
        System.out.println("Created board using type, size, material");
    }
}