class Country {
  public static void main(String[] args) {
    System.out.println("Start main in Country");
    int[] pincode = {577101, 571109, 590001, 586113, 583101, 585201, 561202, 577115, 561206, 585226};
    for (int i = 0; i < pincode.length; i++) {
      int ref = pincode[i];
      System.out.println("Pincode: " + ref);
    }
    System.out.println("End main in Country");
  }
}

