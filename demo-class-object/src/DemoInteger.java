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

  
  }
}