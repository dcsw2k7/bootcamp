package shape;

import java.math.BigDecimal;

public abstract class Shape {
  // abstract class can create instance method without implementation
  // Method without implementation -> abstract method
  public abstract double area();
  

  public static double circleArea(double radius) {
    return BigDecimal.valueOf(radius) //
      .multiply(BigDecimal.valueOf(radius)) //
      .multiply(BigDecimal.valueOf(Math.PI)) //
      .doubleValue();
  }

  /* 
  public static double totalArea(Circle[] circles) {
    // ....
  }

  public static double totalArea(Square[] square) {
    // ....
  }
  */

  // 17章
  public static double totalArea(Shape[] shape) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shape) {  // s is obj ref, point to actual object (Circle/Square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

   
  public static void main(String[] args) {
  System.out.println(Shape.circleArea(3.0d));
    Shape[] shapes = new Shape[] {new Circle(3.0d), new Square(4.0d), new Circle(10.0) };
    System.out.println(Shape.totalArea(shapes));  // 358.4xxxxxxxxxx
    
    // extra exmaple (BigDecimal vs StringBuilder Design Difference)
    StringBuilder sb = new StringBuilder("hello");
    sb.append("worls");  // java: you don't have to assign the return object to a reference.
    // sb = sb.append("worls");  // ????!!!!
    System.out.println(sb);  // helloworld
    // you should refer to box.java for the answer.


  }

}
