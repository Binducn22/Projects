class Led {
    String color;
    String cost;
    String voltage;
    Led(String colorLocal, String costLocal, String voltageLocal) {
        color = colorLocal;
        cost = costLocal;
        voltage = voltageLocal;
        System.out.println("Created led using color, cost, voltage");
    }
}

