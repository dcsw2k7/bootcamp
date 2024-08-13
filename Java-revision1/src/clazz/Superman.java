package clazz;

import java.math.BigDecimal;
import java.util.Objects;


public class Superman extends Person implements Flyable, PowerUp {

  public Superman() {
    // super();  // implicitly calling Person()
  }
  
  public Superman(String name) {
    super(name);  // call parent class constrauctor
  }

  @Override
  public void fly() {

  }

  @Override
  public void powerUp() {

  }

  public static void main(String[] args) {
    // Inheritance only for instance method, attribute
    // Do not inherit constructor
    Superman sm = new Superman("John");  // No Name attribute in
    
    // Polymorphism
    Person p1 = new Superman("Vincent");
    // During compile time, p1 cannotfly(), because p1 is declared by Person, 
    // which can call the instaned method from Person.class ONLY
    // fly() method is hidden when you use p1 to interact Superman Object
    p1.eat();

    Superman s1 = (Superman) p1;  // Perent -> Child (downcast)
    // what is the risk?
    // p1 can be an object created by other clss and this class extending 
    // Person.class as well.
    s1.fly();

    // From programming perspective, if you want to elimiate the risk, you can use instanceOf
    Superman s2;
    if (p1 instanceof Superman) {
      s2 = (Superman) p1;
    }

    // equals()
    System.out.println(sm);  // Superman(person=Person(name=John)
    Superman sm2 = new Superman("John");
    System.out.println(sm.equals(sm2));  // true

    PowerUp superman = new Superman("Sally");  // what is the point to use interface as object reference ?
    superman.powerUp();

    Superman sm3 = (Superman) superman;  // OK
  } 

  @Override
  public boolean equals(Object obj) {
    if (this == obj) /* 如在地址相同(地址相同等於值也相同) ,this(自己) 與外來 (obj) 是否地址相同*/
      return true;
    if (!(obj instanceof Superman))  // 地址不同(), 所以 是否 // // / / /重聽
      return false;
    Superman sm = (Superman) obj;
    return Objects.equals(super.getName(), sm.getName());  // Objects?
    
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getName());  // Objects?
  }
  
  @Override
  public String toString() {
    return "Superman(" //
      + "person=" + this.toString() //
      + ")";
  }
  



}
