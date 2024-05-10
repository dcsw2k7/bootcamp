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


    //2024.05.10

    double d1=10.3;
    double d2=10.34567;
    double d3=110.999;

    double result2 = d1 + d2 - d3; //10.3 + 10.3xxx + 110
    System.out.println(result2);
   
    double result3 = 0.1 + 0.2;
    System.out.println(result3); //0.3000000000

    double result4 = 2 + 4 * 0.25 * 3 / 2 - 10;
    System.out.println(result4); // 2 + (4 * 0.25 * 3 / 2) -10 -> -6.5
  }
}