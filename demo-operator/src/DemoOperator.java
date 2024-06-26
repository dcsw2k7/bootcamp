public class DemoOperator {
  public static void main ( String[] args){
    int x = 3;
    x = x + 1; // 3 + 1 , x = 4
    System.out.println("x=" + x); //string + int -> string

  x++;  //same as x = x + 1;
  System.out.println("x=" + x );

  x += 1;  //same as x = x + 1;
  System.out.println("x=" + x );

  x += 2;  //same as x = x + 2;
  System.out.println("x=" + x );

  ++x;  //same as x = x + 1;
  System.out.println("x=" + x );

  int y = 4;
  y = y - 1;
  y--;
  --y;
  y -=1;
  System.out.println("y=" + y); // y=0

  // *=
  int p =4;
  p = p * 2; //8
  p *= 2;  //16
  p /= 4;
  System.out.println("p=" + p);  //4

  int z = 10;
  z = z % 3;  // 1
  int j = 10;
  j %= 3; // 1
  System.out.println("z=" + z + ", J=" + j);  // z=1, j=1

  String s = "hello";
  s = s + "world";  // helloworld
  s += "!!!";
  System.out.println("s=" + s); // s=helloworld!!!

  // no ** //

  // >, <, >=, <=
  boolean r1 = 10 > 3;  // true, asking if 10 > 3
  boolean r2 = 4 > 10;  // flase
  boolean r3 = 10 >= 10;  //true
  boolean f4 = -9 <= 9; //true

  // and (&&), or (||)
  boolean r5 = 10 > 3 && 20 >= 20;  //true and true -> true, asking if 10 > 3, and 20 >= 20
  boolean r6 = 10 > 3 && 4 < 4; // true and false -> false

  boolean r7 = 10 > 3 || 20 >= 20; // true ord true -> ture
  boolean r8 = 10 > 3 || 20 < 18; // true and false -> ture
  boolean r9 = 3 > 10 || 20 < 18; // false and false -> false

  char c10 = 'A';
  char c11 = 'B';
  boolean r10 = c10 == c11; // false, ask if a value is equals to another value, we use "=="
  boolean r11 = 'C' != 'O'; //true, ask if a value is not equals to another value, we use "!="

  boolean r12 = 10 / 2 > 5 * 3; //false



  int n = 3;
  int result = n++ * 3; // original n multiply 3 first, assign 9 to result, then n = n + 1;
  System.out.println(result); // 9
  System.out.println(n); // 4

  int m = 4;
  int result2 = ++m * 5; // m = m + 1 first, multiply 5,  assign 25 to result2
  System.out.println(result2); // 25
  System.out.println(m); // 5

  int k = 4;
  int result3 = k++ * 7 * ++k;
  System.out.println(result3); // 168 = (4 * 7) * 6
  System.out.println(k);

  int jj = 10;
  int result4 = ++jj + 20 * 8 >> 1 % 6;
  System.out.println(result4);
  System.out.println(jj); 

}
}