public class TestGame{
  public static void main(String[] args ) {
    
//    System.out.println("ROOT is " + type);
    System.out.println(type);

    String type = "ACT";  // 這個無ID用完會消失找不到? 一次性用法
    System.out.println(type);
//    System.out.println(System.identityHashCode((type)));

    Game g1 = new Game();

//    System.out.println(System.identityHashCode((type)));

    System.out.println(System.identityHashCode(g1));  // 925858445
    g1.setName("one");
//    System.out.println(System.identityHashCode((type)));

    System.out.println(g1.getName());
    System.out.println(g1.toString());

//    Game g2 = new Game();
//    g2.games[] {"SF2", "CAPCOM", "FTG", 1.0d, 1993};
//    System.out.println(g2);
  }


}