class GanaviRunner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("Red", "Paperclip");
        Ganavi ganavi1 = new Ganavi("ganavi1@example.com", clip1);
        ganavi1.declareDetails();

        Clip clip2 = new Clip("Blue", "Binderclip");
        Ganavi ganavi2 = new Ganavi("ganavi2@example.com", clip2);
        ganavi2.declareDetails();
    }
}
