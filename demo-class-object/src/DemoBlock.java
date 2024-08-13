public class DemoBlock {

  private static int nuumber;
  private static int number2;
  private String name;

// static block
// 1. triggered once only, no matter the number of static variable(s).

  static {
    System.out.println("start block.");
    number = 3;
    System.out.println("end block.");
  }
  
  public DemoBlock() 


  public static void main(String[] args) {
    System.out.println("start static block.");
    System.out.println(DemoBlock.number);
    System.out.println("end static block.");
  }

  //instance block
  // 1. it is triggered when there is new object created
  // 2, it is triggered before constructor
  // 3. usage: common logic between construtors
  {
    System.out.println("Start instance block.");
    this.name = "john";
    System.out.println("end instance block.");
    number = 10;
  }

  public static void main(String[] args) {
    System.out.println("start.");
    System.out.println(DemoBlock.number);


    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock();
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number);
    System.out.println("end.");
    System.out.println();
  }
}
