class SimCard {
    String name;
    String size;
    String capacity;
    SimCard(String nameLocal, String sizeLocal, String capacityLocal) {
        name = nameLocal;
        size = sizeLocal;
        capacity = capacityLocal;
        System.out.println("Created sim card using name, size, capacity");
    }
}