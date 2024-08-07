class Ananya {
    String mobile;
    Knife knife;

    Ananya(String mobile, Knife knife) {
        this.mobile = mobile;
        this.knife = knife;
    }

    public void declareDetails() {
        System.out.println("Ananya Details: Mobile=" + mobile);
        knife.declareDetails();
    }
}
