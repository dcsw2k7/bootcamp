
// 文章12
public class Car {
  private static int count = 0; // static 是公家,又是object,有ID?
  private int id;
  private String color;

  // Constructor can access static variable
  public Car(String color) {
    System.out.println(count);
    System.out.println(id);
    this.id = ++count; //
    System.out.println(count);
    this.color = color;

    
  }

  public int getID() {
    return this.id;
  }




  public static void main (String[] args) {
    Car c1 = new Car("RED");
    Car c2 = new Car("YELLOW");
    Car c3 = new Car("BLACK");

    System.out.println(c3.getID()); // 3

  }
  





}
