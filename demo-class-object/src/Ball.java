public class Ball {
  private double weight;
  private String color;

  // constructors -- empty constructor, all args constructor
  // by default, there is an empty constructor implicitly exits in the class.
  // public Ball()

  // }

  // Customer empty constructor (可預設初初始值)
  public Ball() {
    this.color = "RED";
  }

  // 建立(由構思(硬碟HD)去到開房(用RAM)階段
  public Ball(double weight, String color) {
    this.weight = weight;
    this.color = color;
  }

  // 第2種寫次(CALL 自己)
  // this(weight, color); // call self constructor


 

  // getter, setter

  public double getWeight() {
    return this.weight;
  }

  public String getColor() {
    return this.color;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // toString ( test class 

  public String toString() { 
    return "Ball(" //
    + "weight=" + this.weight //
    + ", color=" + this.color //
    + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(); // empty constructor to create a ball object
    System.out.println(b1.getColor()); // RED

    Ball b2 = new Ball(10.2, "BLACK"); // all arugments constructor
    System.out.println(b2.getColor()); // "BLACK"
    System.out.println(b2.getWeight()); // 10.2

    //
    System.out.println(b2.toString()); // Ball@jkfdjkfdl (object)
  }


}
