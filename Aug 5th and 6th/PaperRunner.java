class PaperRunner {
    public static void main(String[] values) {
        Paper paper = new Paper(0.5);
        paper.size = 8;
        paper.quality = "High";
        paper.color = "White";
        paper.display();

        Paper paper1 = new Paper(0.7);
        paper1.size = 10;
        paper1.quality = "Medium";
        paper1.color = "Yellow";
        paper1.display();

        Paper paper2 = new Paper(1.0);
        paper2.size = 12;
        paper2.quality = "Low";
        paper2.color = "Pink";
        paper2.display();
    }
}
