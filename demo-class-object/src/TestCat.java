public class TestCat {
  public static void main(String[] args ) {
    // Local variable
    String name = "John";

    // Local 
    Cat c1 = new Cat(); // "new Cat()" -> produce Cat Object in memory 生成/實現化 (現在我要用cat型容 叫c1 ) 指針() = 物件
    // memory address -> Ox123kkjfljfld
    // c1 -> object reference, variable (), able to find the cat object 可已找到它地址/代號
    c1.setAge(10);
    System.out.println(c1.getAge()); // 10

    Cat c2 = new Cat();
    c2.setAge(7);
    System.out.println(c2.getAge()); // 7
    System.out.println(c1.getAge()); // 10

    Cat c3 = new Cat();
    System.out.println(c3.getAge()); // 0, because primitive type has default value


    Ball b = new Ball(); 
    // "Ball b" -> because Ball.class is "public class"
    // "new Ball()" -> because the constructor is "public"

    b.setColor("YELLOW"); // because setColor() method is "public" method

    
  }
}
