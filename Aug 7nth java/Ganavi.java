class Ganavi {
    String email;
    Clip clip;

    Ganavi(String email, Clip clip) {
        this.email = email;
        this.clip = clip;
    }

    public void declareDetails() {
        System.out.println("Ganavi Details: Email=" + email);
        clip.declareDetails();
    }
}

