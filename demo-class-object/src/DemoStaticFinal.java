public class DemoStaticFinal {
  
  // Constant  // snakecase
  // logoString // camelcase
  private static final String LOGO_STRING;  // static vairables, finalized
  private static String name;  // static variables
  
  private static final double PI = Math.PI;  // Math.PI -> public static final double PI

  private final double salary = 0.0d;  // finalized instance variables
  
  
  // camelcase
  private int age;  // Instance variables
  
  // triggered before man() method
  static {
    LOGO_STRING = "default";
  }
  
  public int getAge() {
    return this.age;
  }
  
  public double getSalary() {
    return this.salary;
  }
  
  // final is a java keyword. Compiler would check all final variables have been
  // initialized.
  // private final double salary;
  // private static final String;
  
  public static void main(String[] args) {
    // Instance variables
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    // dsf.salary = 1000;  // compile error, salary is a final variable.
    System.out.println(dsf.salary); // 0.0
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(dsf2.salary);  // 0.0
    
    System.out.println(DemoStaticFinal.logo);  // default
  }


  // You       private static final String LOGO_STRING = "default";  // static vairables, finalized
}
