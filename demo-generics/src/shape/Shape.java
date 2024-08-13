package shape;

import java.math.BigDecimal;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;


public abstract class Shape {
  abstract double area();

  // public Shape() {}

  // aproach 1
  public static double area(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // approach 2: Generics
  // "T extends Shape>" is to describe the patent relationship  /*  */
  public static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }
  
  // Question /* 自行了解 */
  // List<object>? vs List<T> ? difference ?

  public static double area3(List<? extends Shape> shapes) {
    return -1.0;
  }

  public static void main(String[] args) {
    // Circle vs Shape -> Parent
    // List<Shape vs List<Circle> -> NOT Parent
    List<Shape> shapes = new LinkedList<>();  /* <Shape> List 已定object */
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));

    System.out.println(Shape.area(shapes));  // 83.69... 
    System.out.println(Shape.area2(shapes));  // 83.69...

    // ArrayList<Square> object
    // ArrayList<Circle> object
    List<? extends Shape> shapes2 = new ArrayList<Circle>();  // /* ? <extends Shape> 這句未定List object是(Circle/square/brid)所以未可add */
    shapes2 = new ArrayList<Square>();

    // shapes2.add(new Circle(3.4));  // NOT OK
    // shapes2.add(new Circle(5.0));  // NOT OK
    // during compile-time, we do not know the actual type of object reference by shape2

    // shapes2.add(new Object());

    List<? super Shape> shapes3 = new ArrayList<Object();  // /* ? <super Shape> 這句super List 包含全部shape extend 內object所以可add */
    shapes3 = new ArrayList<Shape>();

    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(3.4));
    shapes3.add(new Bird());  // NOT OK ?
    // during compile time, we Do not know ctual type of shapes3

    List<Object> objects = new ArrayList<Circle>();  // Not OK (Parent) /* 不是同伴關係(兩面不平行) */
    Object object = new Circle(2.4);  // Ok (Parent)







  }



}
