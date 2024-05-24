public class DemoString {

  public static void main(String[]args){
    String x = "hello";
    String y = "$(@*#)@!#*)!";
    String dollar = "$10";

    String withSpace = "  hello    h  ello";
    System.out.println(withSpace);

    //14May2024

    // +

    String z = x + dollar;
    System.out.println(z);

    double price = 9.99;
    String item = "Book";
    String description = "The " + item + " coast $" + price;
    System.out.println(description);

    char a = 'A';
    String message = "The answer is:" + a; // char -> String
    System.out.println(message);

    //String Method (tools) 1: length()
    String t = "hello";
    System.out.println("the length of t=" + t.length());  //t.length() => int

    // check if t length >= 4, if yes, print hello, else goodbye
    if (t.length() >= 4) {
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }


    // Metho 2 : equals() //等於
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)){
     System.out.println("they are having same String Value.");  //print
    } else{
      System.out.println("they are not with the same value.");
    }

    if (!s1.equals(s2)) {
      System.out.println("they are not with the same value.");
    } else {
      System.out.println("they are having same String Valuse.");  //print
    }

    if (s1 == s2) {
      System.out.println("they are same object."); // print


    // checkif s1 length >= 6 or s1 equals s2, print ...
    // or
    if (s1.length() >= 6 || s1.equals(s2)) {  // fales || true -> true
      System.out.println("hello");
    }

    if (s1.length() >= 6) {
      System.out.println("hello world");
    } else if (s1.equals(s2)){
      System.out.println("hello");
    }
    // checkif s1 length >= 6 ro s1 equals s2, print ...
    // AND
    if (s1.length() >=6 && s1.equals(s2)) {
      System.out.println("hello");
    }

    if (s1.length() >= 6) {
      if (s1.equals(s2)) {
        System.out.println("hello");
      }
    }
    // Method 3: chatAt(int index), for example, charAt(0)
    String s3 = "world";
    // 0 means the first character
    // 1 means the second character
    // 4 means the 5 th character
    System.out.println("the 1st character of s3=" + s3.charAt(0)); // w
    System.out.println("the 5st character of s3=" + s3.charAt(4)); // d

    System.out.println("the last character of s3=" + s3.charAt(s3.length() -1) ); //d 

    // System.out.println(s3.charAt(-1)); // java.lang.StringIndexOutOfBoundsException
    // System.out.println(s3.charAt(5)); // java.lang.StringIndexOutOfBoundsException

    // check if the last character is d and length > 5, if yes, print yes.
    String x2 = "hello world";
    if (x2.charAt(x2.length() - 1) == 'd' && x2.length() > 5) {
      System.out.println("yes");
    }  

    // Method 4 : substring(int beginIndex, int endIndex)
    String result = x2.substring(0,2);
    System.out.println(result); // he
    System.out.println(x2.substring(0,5)); // hello
    System.out.println(x2.substring(3,8)); // lo wo
    System.out.println(x2.substring(8,11)); // rld
    System.out.println(x2.substring(0,11)); // hello world

    System.out.println(x2.substring(0,0)); // ""
    System.out.println(x2.substring(0,1)); // "h'
    // System.out.println(x2.substring(0,-1)); //  java.lang.StringIndexOutOfBoundEx ....

    // check if the first three charactrer is "wel", if yes, print yes
    String x3 = "welcome";
    // substring()

    if (x3.substring(0,3).equals ("wel")) {
      System.out.println("yes");
    } else{
      System.out.println("no");
    }

    if (x3.substring(0,3) == ("wel")){
      System.out.println("yes");
    } else{
      System.out.println("no");  
    }

    // chain method
    System.out.println(x3.substring(0,3).length()); //3
    System.out.println(x3.substring(0,3).charAt(1)); // 'e'

    //
    String x6 = (x3.substring(0,3)); // "wel" 
    System.out.println(x6.length()); //3
   


    String x4 = x3.substring(0,3);
    int l1 = x4.length();
    System.out.println(l1); //3

    // charAt()
    if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == '1'){
      System.out.println("yes");
    }

    // isEmpty()
    // Empty String value -> ""
    String x7 = "";
    System.out.prirtln(x7.isEmpty()); // true
    String x8 = "abc";
    System.out.println(x8.isEmpty()); // false
    System.out.println(x7.length() == 0); // true

    // isBlack()
    String x9 = "";
    System.out.println(x9.isBlack()); // true
    x9 = " ";
    System.out.println(x9.isBlack()); // true
    System.out.println(x9.isEmpty()); // false

    // Substring(0,3)
    // Substring(0)
    String s10 = "hello";
    System.out.println(s10.substring(0)); // hello, form index 0 to the end.
    System.out.println(s10.substring(0,3)); // hel, form index 0 to the index 2 (3-1)

    // hello -> HELLO
    System.out.println(s10.toLowerCase()); // "HELLO"
    String s11 = "HELLLO";
    System.out.println(s11.toLowerCase()); // "hello"

    System.out.println(s10.replace('l', 'x')); // hexxo
    System.out.println(s10.replace("ll", "yyyy")); // heyyyyo
    System.out.println(s10.replace("lll", "abc")); // hello

    System.out.println(s10.contains("ell")); // true

    // startWith()
    System.out.println(s10.startsWith("he")); // true
    // endswith()
    System.out.println(s10.endsWith("o")); // true

    // trim(), removing the space chartacters at the head/tail of the string.
    String s12 = "    Hello,   bttocamp !!!   ";
    System.out.println(s12.trim()); // Hello,  bootcamp !!!

    String[] string = new String[] {"hello", "abcijk", "vincent", "HeLLo", "  HELLO   "};
    // how many string contains "ELL", but ignore case
    // "ell" or "ell" or "ELL" .........
    // toUpperCase(), contains()
  







  
  }

}
  
}