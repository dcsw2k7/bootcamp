public class Xbox {

  // Constructors
  private String name;
  private String type;
  private int version;
  


  // getter , setter
  
  public void setname(String name) {
    this.name = name;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public void setVersion(int version) {
    this.version = version;
  }
  

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public int getVersion() {
    return this.version;
  }


  public String toString() {
    return "Name" + this.name + 
    "type" + this.type + 
    "version" + this.version ;
  }






}




// toString
  public String toString() {
    return "xbox (" +  name + type + version + ")";
  }
  


  public static void main(String[] args) {


  }


}