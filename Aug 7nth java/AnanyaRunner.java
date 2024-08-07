class AnanyaRunner {
    public static void main(String[] args) {
        Knife knife1 = new Knife(50, 10);
        Ananya ananya1 = new Ananya("1234567890", knife1);
        ananya1.declareDetails();

        Knife knife2 = new Knife(75, 12);
        Ananya ananya2 = new Ananya("9876543210", knife2);
        ananya2.declareDetails();
    }
}

