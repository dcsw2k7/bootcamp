public class Person {
  private String name;
  private int age;

  public Person(String initialName) {
    this.name = initialName;
    this.age = 0;
  }

  public void printPerson() {
    System.out.println(this.name + this.age);
  }

  public void print123() {
    System.out.println(this.printPerson());
  }

  public static void main(String[] args) {
    System.out.println(Person());
  }




  
}
