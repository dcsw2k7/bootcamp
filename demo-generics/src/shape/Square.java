package shape;

public class Square  extends Shape {
  private double length;

  @Override
  public double area() {
    return Math.pow(this.length, 2);
  }
}
