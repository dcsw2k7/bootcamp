public class DemoCharSequence {
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(s.length());  //3
    System.out.println(s.replace("c", "a"));  // "abc"
    String s3 = s;  // type-safe 因為s是String相同type
    
    CharSequence cs = "abc";
    System.out.println(cs.length());  // 3 (Polymorphism)
    // compile-time determine the scope of object can be accessed by "cs"
    System.out.println(cs.charAt(1));  // b
    // cs.replace()  // error, replace() is not included in CharSequence Interface
    // Some of methods in String object is hidden by "cs"


    // String s2 = cs;  // compiler concerns the type of "cs" ONLY  /* 放不回S2 */
    // compile time cannot realize the actual object reference by "cs"

    // both Parent Class and Interface relationship can apply "downcastring"  /* 改善1 */
    String s2 = (String) cs;
    // during cmopile-time, we don't guarantee if the casting will be successful.

    // As java developer,  /* 改善2加入條件  */
    if (cs instanceof String) {
      s2 = (String) cs;
    }

    System.out.println(s2.replase("b", "a"));  // "aac"


    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.length());  // 5
    System.out.println(sb.charAt(1));  // e
    System.out.println(sb.reverse());  // olleh

    CharSequence cs3 = new StringBuilder("hello");
    System.out.println(cs3.length());  // 5
    System.out.println(cs3.charAt(1));  // e
    // System.out.println(cs3.reverse()); //

    StringBuilder sb2 = (StringBuilder(cs));  // run-time error, cs refer to String object,
    // While object reference b2 is StringBuilder





  }
}
