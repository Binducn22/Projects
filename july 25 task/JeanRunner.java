class JeanRunner {
    public static void main(String[] args) {
        System.out.println("Start main in MatrimonyRunner");
        Jean jean = new Jean();
        jean.size = 32;
        jean.type = "cotton";
    
        System.out.println("jean size:" + jean.size);
        System.out.println("jean type:" + jean.type);
        System.out.println("jean price:" + jean.price);
        
        System.out.println("Stop main in MatrimonyRunner");
    }
}