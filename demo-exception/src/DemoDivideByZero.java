public class DemoDivideByZero {
  public static void main(String[] args) {
    int amount = 0;
    System.out.println(divide(10, 3)); // 3
    // Approach 1
    if (amount != 0) {
      System.out.println(divide(10, amount));  // exception
    } else {
      System.out.println(0);
    }


    // Approach 2: Handle Exception
    // Unchecked Exception (Runtime Exception) = Implicitly
    try {
        divide(10, 2);  // 5
        // .... lines of code....
        String s = "hello";
        s = null;
        System.out.println(s.charAt(2));  // NullPointerException
    } catch (ArithmeticException e) {
        // send email to teammate ...
        // insert to datebase..
        // save log...
        System.out.println("hello! Divided by Zero:" + 10 + " / " + amount);
    } catch (NullPointerException e) {
        System.out.println("NPE: Please check");
    }
    
    try {
      double averageExpense = CalculateExpensePerEmployee2();
    }  catch (ArithmeticException e) {
        System.out.println("something to fix ...");
    }


    // main() -> CalculateExpensePerEmployee() -> getDepartemntExpense() & getEmployeeCount()
 
    try {
      CalculateExpensePerEmployee3();
    } catch(EmployeeCountZeroException e) {
        // specific handling for emplyee count = 0 ....
    }

  }

  // return int
  // throw ArithmeticException (Implicitly)
  public static int divide(int x, int y) {
    return x /y;
  }
  
  // Approach 1
  public static int CalculateExpensePerEmployee() {
    try {
      return getDepartemntExpense() / getEmployeeCount();  // bug
    } catch (ArithmeticException e) {
      return getDepartemntExpense();  // fix
    }
  }

  // Approach 2
  // When a method throw unchecked Exception without handling, the exception will be thrown back to caller.
  public static int CalculateExpensePerEmployee2() {
      return getDepartemntExpense() / getEmployeeCount();
  }

  // Appreach 3
  public static int CalculateExpensePerEmployee3() {
    try {
      return getDepartemntExpense() / getEmployeeCount();
    } catch (ArithmeticException e) {
      throw new EmployeeCountZeroException();
    }
  }








  public static int getEmployeeCount() {
    return 0;
  } 
  
  public static int getDepartemntExpense() {
    return 140000;
  } 
  
  


}
