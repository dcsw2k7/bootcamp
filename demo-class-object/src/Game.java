public class Game {

  // Constructors
  private String name;
  private int co;
  private String type;
  private double version;
  private int createdate;

  private Game [] games;
  


  // getter , setter
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setCo(int co) {
    this.co = co;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  public void setVersion(int version) {
    this.version = version;
  }

  public void setCreatedate(int createdate) {
    this.createdate = createdate;
  }


  public String getName() {
    return this.name;
  }

  public int getCo() {
    return this.co;
  }
  
  public String getType() {
    return this.type;
  }
  
  public int getVersion() {
      return this.version;
  }

  public int getCreatedate() {
    return this.createdate;
  }

  // toString
  public String toString() {
    return "Name = " + this.name +
    ", co = " + this.co +
    ", type = " + this.type +
    ", version = " + this.version +
    ", createdate = " + this.createdate;
  }




 
  


  public static void main(String[] args) {


  }


}