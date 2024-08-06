class ProjectorRunner {
    public static void main(String[] values) {
        Projector projector = new Projector("Epson");
        projector.type = "LCD";
        projector.color = "White";
        projector.weight = 10;
        projector.display();

        Projector projector1 = new Projector("BenQ");
        projector1.type = "DLP";
        projector1.color = "Black";
        projector1.weight = 12;
        projector1.display();

        Projector projector2 = new Projector("ViewSonic");
        projector2.type = "Laser";
        projector2.color = "Silver";
        projector2.weight = 15;
        projector2.display();
    }
}

