public class C3_Boolean {
  
  public static void main(String[] args) {
    
    int x = 5;
    int y = 10;
    int z = 5;
    
    boolean result1 = x == y;
    System.out.println(result1);
    boolean result2 = x != y;
    System.out.println(result2);
    boolean result3 = x < y;
    System.out.println(result3);
    boolean result4 = x > y;
    System.out.println(result4);
    boolean result5 = x <= y;
    System.out.println(result5);
    boolean result6 = x >= y;
    System.out.println(result6);
    boolean result7 = x == z;
    System.out.println(result7);

    
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;

    boolean result8 = b1 == b2;
    System.out.println("result8 = " + result8);
    boolean result9 = b1 == b3;
    System.out.println(result9);

    boolean b4 = false;
    System.out.println("b4 = " + b4);

    boolean b5 = b3;
    System.out.println("b5 = " + b5);
    b5 = false;
    System.out.println("b5 = " + b5);
    b5 = true;
    System.out.println("b5 = " + b5);

    System.out.println(result9);
//     System.out.println(new Card(Suit.CLUB, Rank.NINE)

  }
}
