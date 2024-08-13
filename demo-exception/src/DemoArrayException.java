import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class DemoArrayException {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 1;
    // arr[5] = 1; // java.lang.ArrayIndexOutBoundsException

    int idx = 0;
    if (idx >= 0 && idx < arr.length) {
      arr[idx] = 10;
    }

    try {
      arr[5] = 1;
    } catch (ArrayIndexOutOfBoundsException e) {
      // send email to someone
    }
    System.out.println("end of program.");

    String str = "hello";
    str.charAt(1);  // e
    // str.charAt(str.length());  // java.lang.StringIndexOutOfBoundException
    str.substring(0, 6);  //  java.lang.StringIndexOutOfBoundException

    int result = Integer.parseInt("1");
    System.out.println(result);  // 1

    int result2;
    try {
      result2 = Integer.parseInt("hello");  // java.lang.NumberForMatException  // type轉換錯誤
    } catch (NumberFormatException e) {
      result2 = -1;
      System.out.println("NumberFormatException! Message: " + e.getMessage());  // For input string: "hello"
    }
    System.out.println(result2);  // -1

    System.out.println(getDescription(18));  // adult
    int age = -1;
    try {
      getDescription(age);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    
    List<String> strings = new ArrayList<>();  //arr[0]
    // string.get(0);  // java.lang.IndexOutOfBoundsException
    
    List<String> strings2 = new LinkedList<>();
    // string2.get(0);  // java.lang.IndexOutOfBoundsExcepion
    
  }



  public static String getDescription(int age) {
    if (age < 0)
      throw new IllegalArgumentException("age should not be negative1");  // invalid parameter
    if (age >= 66)
      return "Elderly";
    if (age >= 18)
      return "Adult";
    return "Children";
  }
}
