class Gold {
    String karat;
    String weight;
    String purity;
    Gold(String karatLocal, String weightLocal, String purityLocal) {
        karat = karatLocal;
        weight = weightLocal;
        purity = purityLocal;
        System.out.println("Created gold using karat, weight, purity");
    }
}
