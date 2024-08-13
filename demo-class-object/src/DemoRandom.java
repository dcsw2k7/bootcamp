import java.util.Random;

public class DemoRandom {

  public static void main(String[] args) {
    // JDK
    // random -> usually integer
    int random = new Random().nextInt(3);  // 0-2
    System.out.println(random);
    int random2 = new Random().nextInt(3) + 1;  // 1-3
    System.out.println(random2);
    int random3 = new Random().nextInt(3 - 1) + 1;  // 0-1 + 1 -> 1-2
    System.out.println(random3);

    // 49 or 50


    DomoRadom dr = new DemoRandom()[
    System.out.println(dr.sum(2, 3))  //5
    System.out.println(DemoRanom.sum(2, 3));  // 5

    

    ]
  } 
  
  // ?? in method and static method 用不用in 或 static 想想是否要有狀態是否要儲存要否要recall  **因為對效能及儲存

  public static int sum(int x, int y) {
    return x + y;
  }

}
