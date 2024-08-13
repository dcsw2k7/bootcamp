package shape;

public class Rectangle extends Shape {
  
  private double L;
  private double W;
  private double H;

  public double area() {   // 計面積
    // return this.l + this.W * this.H;  // 長*闊*高
    return BigDecimal.valueOf(this.L) //
      .multiply(BigDecimal.valueOf(this.W)) //
      .multiply(BigDecimal.valueOf(this.H)) //
      .doubleValue();
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 4, 9);
    System.out.println(r1.area()); // 
  }
}
