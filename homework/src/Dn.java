import java.time.LocalDate;

public class Dn {
  
  // constructor
  private String dnnum,custno,product;
  private String dndate;
  private int itemno;
 

  public Dn() {
    this.itemno = 1;
    this.dndate = "20240619";  //LocalDate();
  }


  // getter, setter
  public String getdnnum() {
    return this.dnnum;
  }

  public String getdndate() {
    return this.dndate;
  }

  public String getcustno() {
    return this.custno;
  }

  public int getitemno() {
    return this.itemno;
  }

  public String getprduct() {
    return this.product;
  }


  public void setdn(String dnnum) {
    this.dnnum = dnnum;
  }

  // toString
  public String toString() { 
    return "dnnun :" + this.dnnum + 
    ", dndate :" + this.dndate +
    ", custno :" + this.custno +
    ", itemno :" + this.itemno + 
    ", product :" + this.product;
  }


  public static void main(String[] args) {
    Dn d1 = new Dn();
    //d1.dnnum("dn123");
    //d1.dndate(34343);
    //d1.custno("ibm"), 
    //d1.product("T450");
    System.out.println(d1.toString());
  }









}
