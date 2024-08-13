import Animal;

package Q3;
public class Q3-1 {
  interface Vgetatian {
    default public String eat() {
      return "[Vegetarin] I am able to eat";
    }
  }

  interface Rummer {
    default public String eat() {
      return "[Runner] I am able to eat";
    }
  }

  class Pig extends Animal {
    public String eat() {
      return "[Pig] I am able to eat";
    }
  }

  class Animal {
    public String eat() {
      return "[Animal] I am able to eat";
    }
  }

  public class SmallPig extends Pig implements Vegetarian, Runner {

    public static void main(String[] args) {
      SmallPig smallPig = new smallPig();
      System.out.println(smallPig.eat());
    }
  }
}
