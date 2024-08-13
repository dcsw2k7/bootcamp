package clazz;

public class Person {

  private String name;  // if you use public here, it implies the source value
                        // can be read and replaced by others

  // Constant /* 為一用public static final 不會再改所以可公共出來 */
  public static final double PI = Math.PI;
  
  public String getName() {
    return this.name;
  }

  // By default a class implicitly contain empty constructor
  public Person() {

  }

  public Person(String name) {
    this.name = name;
  }

  public void eat() {

  }

  @Override
  public String toString() {
    return "Person(" //
      + "name=" + this.name  //
      + ")";
  }
}
