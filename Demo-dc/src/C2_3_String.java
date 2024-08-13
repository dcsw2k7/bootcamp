public class C2_3_String {
  public static void main(String[] args) {
    String name = "Venturenix Lab";
    String str = "hello";
    
    int length = str.length();
    System.out.println(name);
    System.out.println(length);
    
    // length()  /* 求長度 */
    System.out.println(name.length());
    // equals()  /* 求相等 */
    System.out.println(name.equals(str));
    // chatAt()  /* 求位置 */
    System.out.println(name.charAt(1));


    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "world";
    String result = str1 + str2;

    System.out.println(result);

    boolean isEqual1 = str1.equals(str2);
    System.out.println(isEqual1);
  }
  
}
