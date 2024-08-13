package shape;

import java.math.BigDecimal;

// Shape is a class containing area() abstract method
// Circle is a class inherit Shape class
public class Circle extends Shape {

// final class cannot be extended
// public final calss Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  // abstract method is not allowed in normal class
  // public abstract String test();

  // 1. the parent class has the same method.
  // 2. compile would check if the calss really hs the same method.

  @Override
  public final double area() {   // "final method" cannot be overrided in child class// 計面積
    // return this.radius + this.radius * Math.PI;  // 半徑*半徑*PI (3.14XXX)
    return BigDecimal.valueOf(this.radius) //
      .multiply(BigDecimal.valueOf(this.radius)) //
      .multiply(BigDecimal.valueOf(Math.PI)) //
      .doubleValue();
  }

  // Circle.class may have is own method.
  public void sleep() {
    System.out.println("circle is sleeping ...");
  }
  
  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area()); // 28.27.....
  }


}
