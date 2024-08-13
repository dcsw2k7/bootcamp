public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value -. autobox -> Integer object (heap memory)

    // Internal Cache ( for number)
    i1 = 127; // i1 ( object ref), 127 -> (1st) create Integer Object  系統預設第一次
    i2 = 127; // i2 ( object ref), 127 -> (2nd) reuse the original Integer object
    // ruel: from -128 to 127 -> reuse the original object 系統觸發基制
    System.out.println(i1 == i2); // true (are they same object ?)

    Integer i3 = 128; // 128 -> (1st) create Integer object
    Integer i4 = 128; // 128 -> (2nd) create Integer object
    System.out.println(i3 == i4); // false (are they same object ?)

    //important !!!!
    // for class, you should always compare their objeect value by method !!!!
    System.out.println(i3.compareTo(i4)); //0
    
    // userless
    // System.out.println(i3 >= i4); // false
    // System.out.println(i1 >= i2); // false

  

    // Flocat, double ( no internal cache in jvm)
    Float f1 = 10.12345f; // autobox: float value -> float object 因指向ObjectT會自己AUTOBOX
    Float f2 = 10.12345f; // autobox: float value -> float object
    System.out.println(f1 == f2);  // false

    double d1 = 128.12345d; // autobox: double value -> double Object  因指向ObjectT會自己AUTOBOX
    double d2 = 128.12345d; // autobox: double value -> double Object
    System.out.println(d1 == d2);  //false

    //Boolean: support Internal cacha
    boolean b1 = true;
    boolean b2 = true;
    System.out.println(b1 == b2);

    // character: Support internal cache (-128 to 127)
    Character c1 = 'c';  // autobox: char value -> character object
    Character c2 = 'c';  // autobox: char value -> character object
    System.out.println(c1 == c2);  turn

    


  }
}