class RapidoRunner {
    public static void main(String[] args) {
        System.out.println("Start main in RapidoRunner");
        Rapido rapido = new Rapido();
        String bikeNumber = rapido.bikeNumber;
        int rating = rapido.rating;
        boolean isBusy = rapido.isBusy;
        System.out.println("Rapido bikeNumber:" + bikeNumber);
        System.out.println("Rapido rating:" + rating);
        System.out.println("Rapido isBusy:" + isBusy);
        System.out.println("Stop main in RapidoRunner");
    }
}

