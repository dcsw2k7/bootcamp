public abstract class SuperHuman {
  private double height;

  public SuperHuman() {

  }
  // Why abstract class has constructor? but we cannot crate object for abstract class
  public SuperHuman(double height) {
    this.height = height;
  }


  public double getHieight() {
    return this.height;
  }

  
}
