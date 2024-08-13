public class DemoLiterallPool {
  public static void main(String[] args) {
    // Literal Pool (String)
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);  // true
    System.out.println(System.identityHashCode(s1));  // 925858445
    System.out.println(System.identityHashCode(s2));  // 925858445


    String s3 = "hello";
    String s4 = new String("hello"); //
    System.out.println(s3 == s4);  // false
    System.out.println(s3 == s1 && s3 == s2);  // true

    s3 = s4;
    System.out.println(s3 == s4);  // true, they are porinting to the same object

    String s5 = "he";
    String s6 = "llo";
    s5 = s5 + s6;  // hello (new string) 
    System.out.println("s1" + s1);  // hello
    System.out.println("s5" + s5);  // hello
    System.out.println(s5 == s1);  // false

    // immutable
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7));  // 925858445
    s7 += " world";
    System.out.println(System.identityHashCode(s7));  // 1450495309 ( new String Object)

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8));  // 925858445
    s8 = s8.replace("e", "a");  //張e 轉為 a  // new
    System.out.println(System.identityHashCode(s8));  // 1670782018

    String s9 = "hello";
    System.out.println(System.identityHashCode(s9));  // 925858445
    s9 = s9.toUpperCase();  
    System.out.println(System.identityHashCode(s9));  // 1706377736








  }
}
