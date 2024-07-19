class CabinetMinisters {
  public static void cabinetMinisters(String[] ministers) {
    System.out.println("Start cabinetMinisters");
    for(int names=0; names<ministers.length; names++){
	  String minister=ministers[names];
      System.out.println("Minister: " + minister);
    }
    System.out.println("End cabinetMinisters");
  }
}

