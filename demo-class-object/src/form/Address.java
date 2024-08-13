package form;

import java.text.Normalizer.Form;

public class Address {
  private String line1;
  private String line2;
  private String line3;
  
  
    // all arguments constucstor, getter
    public Address(String line1, String line2, String line3) {
      this.line1 = line1;
      this.line2 = line2;
      this.line3 = line3;
  
    }
  
    public String getLine1() {
      return this.line1;
    }

public String getLine2() {
    return this.line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public String getLine3() {
    return this.line3;
  }

  public String toString() {
    return "Address(" //
        + "line1=" + this.line1 //
        + ", line2=" + this.line2 //
        + ", line3=" + this.line3 //
        + ")";
  }




    public static void main(String[] args) {
      // create a form object, with address object
      Address address = new Address("abc", "ijk", "def");
      Form form = new Form("Vincent", "Lau", address);

      System.out.println(form);
      // Form.class -> toString()
      // Form(firstName=Vincent, lastName=Lau, address=form.Address@6b95977)

      // Form.class & Address.class -> toString()
      // Form(firstName=Vincent, lastName=Lau, address=Address (line1=abc, line2=ijk, line3=def))
    
      System.out.println(form.getAddress());  // call Address object toString()
      // Address(line1=abc, line2=ijk, line3= def)

      System.out.println(form.getAddress().getLine2());
      // ijk

      /* 初用FORM1 +  address1地址 之後,開新FORM2 只單改 單ADDRESS1 LINE1,  再回看初FORM1 LINE1 改變了， 因為開FORM2是改動了ADDRESS1
        如要不改動，form2不要用form1的address1,自己開一個address2用 
      */
      Form form2 = new Form("Jenny", "Wong", address);
      System.out.println(form2.getAddress().getLine2()); // ijk
  
      form.getAddress().setLine2("xyz");
      System.out.println(form.getAddress().getLine2()); // xyz
  
      System.out.println(form2.getAddress().getLine2()); // xyz)

      // why both form address and form2 address was changed to xyz?

      
    } //

}
