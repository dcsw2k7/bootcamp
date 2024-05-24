public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'B';
    switch (grade) {
        case 'A':
          System.out.println("the grade is " + grade);
          break;  // break the switch statement
        case 'B':
          System.out.println("the grade is " + grade);
          break;  // break the switch statement
        case 'C':
          break;  // break the switch statement
          System.out.println("the grade is " + grade);
        default:
          System.out.println("no grade");
    }

    if (grade == 'A' || grade == 'B' || grade == 'C') {
      System.out.println("the grade is " + grade);

    }else{
      System.out.println("no grade");
    }

    // if you don't use break statement, the odering of the cases may cause various resule

    int x = 0;
    switch(grade){
      case 'A':
      x += 10;
      case 'B':
      x += 10;
      case 'C':
      x += 10;
      default:
      x += 10;
    }
    System.out.println("x=" + x); // 30

    java.util.Scanner input = new Scanner(System.in);
    System.out.print("please input a number: ");
    int month = input.nextInt();  // line of imput -> int
    System.out.println("month" + month);


  }
}
