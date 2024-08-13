package form;
public class From {

  private String firstName;
  private String lastName;
  private Address address;
  // private String Addrline1
  // private String Addrline2
  // private String Addrline3


  // constucstor, getter, setter
  public From(String firstName, String lastname, Address address) {
    this.firstName = firstName;
    this.lastName = lastname;
    this.address = address;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public Address getAddress() {
    return this.address;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


public String toString() {
    return "Form(" //
        + "firstName=" + this.firstName //
        + ", lastName=" + this.lastName //
        + ", address=" + this.address // call this.address.toString()
        + ")";
  }

  System.out.println(Form.toString);






  
  
}
