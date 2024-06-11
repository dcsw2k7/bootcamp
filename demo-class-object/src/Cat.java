public class Cat { // Class name -> name Convention -> able to descride physical object
  
  // what is "this" ?
  // why setAge() and setName() are void methods ?
  // why getAge() and getName() are methods with return type?
  
  // state
  // attributes
  private String name; // 自己定義東西/用什麼組成 (設計藍圖)
  private int age;
  
  // if No construtorm is defined,
  // by default the class implicatly has a empty constructor

  // behavior
  // instance method
  // setAge() is method that can be called by object only
  // for example, cat c1 = new Cat();
  // c1.setAge(13);
  // "this" -> the object pointed by c1 (object rference)
  public void setAge(int age) {  // 設定建立一個用來修改事項途徑
    this.age = age; 
  }

  // void is a return type, requires return nothing.
  public void setName(String name ) {
    this.name = name;
  }

  public int getAge() { // 使用執行生成之前開途徑
    return this.age;
  }

  public String getName() {
    return this.name;
  }
  
  // instance method
  public String describe(String x) {
    return "The age of this cat is " + this.age + ", and name of this.cat is "
      + this.name + " " + x;
  }

  // static method
  public static String hello() {
    return "hello";
  }

  public static String hello(String s) {
    return s + "!!!";
  }

  public static void main(String[] args) {

    // the purpost of static method -> produce something by the input paramters
    // static method should not access any object attributed/ behaviors
    System.out.println(Cat.hello()); // hello
    System.out.println(Cat.hello("goodbye")); // goodbye!!!
    System.out.println(Book.hello()); // hello

    System.out.println(3); //

    // how to call describe()
    // instance menthod 
    Cat cat = new Cat();
    cat.setAge(13);
    cat.setName("ABC");

    // The age of this cat is 13, and name of this cat is ABC.
    System.out.println(cat.describe("."));

  }
}

