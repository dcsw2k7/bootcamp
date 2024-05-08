public class DemoPrimitives{
  public static void main (String[]args){
    // number / string(text)
    // number (integers/decimal)
    int x = 3;
    //int y = 3.5;
    int z = -9;
    int total = x + z; // -6
    System.out.println(x);
    System.out.println(total);

    // + - *
    int a = total - 10 + x;
    System.out.println (a); //-13

    int k = a + x * 8;
    System.out.println (k); //11

    int l = 33 / x;
    System.out.println (l); //11
    int r = 32 / x;
    System.out.println (r); //10
    
    //remainder
    // % 整數除後會是餘數

    int remainder = 10 % 3; //1
    int divide = 10 /33 ;//3
    System.out.println (remainder); //1
    System.out.println (divide); //3
  }
}