public class C2_4_Operators {
  
  public static void main(String[] args) {
    
    // +, -, *, /, %
    int x = 10 + 5;  // 15, addition
    System.out.println(x);
    int y = 10 - 3;  // 7, subtraction
    System.out.println(y);
    int z = 10 * 5;  // 50, multiplicaton
    System.out.println(z);
    int w = 10 / 5;  // 2, division
    System.out.println(w);
    int remainder = 10 % 3;  // 1 modulus
    System.out.println(remainder);

    // +=, -=, *=, /=, %=
    int x1 = 5;
    x1 += 3;  // x1 = x1 + 3
    System.out.println(x1);  // 8
    int y1 = 10;
    y1 -= 4;  // y1 = y1 - 4
    System.out.println(y1);  // 6
    int z1 = 7;
    z1 *= 2;  // z1 = z1 * 3
    System.out.println(z1);  // 14
    int w1 = 15;
    w1 /= 5;  // w1 = w1 / 5
    System.out.println(w1);  // 3
    int a = 10;
    a %= 3;  // a = a % 3
    System.out.println(a);  // 1
    
    // ++, --
    int x2 = 5;
    System.out.println("x2 = " + x2);
    x2++;  // 6
    System.out.println("x2++ = " + x2);
    ++x2;  // 7
    System.out.println("++x2 = " + x2);
    
    x2 = x2 + 1;
    System.out.println(x2);  // 8
    x2 += 2;
    System.err.println(x2);  // 10
    

    int a2 = 8;
    System.out.println("a2 = " + a2);
    a2--;
    System.out.println("a2-- = " + a2);
    --a2;
    System.out.println("--a2 = " + a2);
    a2 = a2 -1;
    System.out.println(a2);
    a2 -= 1;
    System.out.println(a2);

    int a3 = 5;
    System.err.println(a3);
    a3 -= 4;
    System.err.println(a3);

    String message = "Hello";
    System.err.println(message);
    message += "World";
    System.out.println(message);

    
  }
}
