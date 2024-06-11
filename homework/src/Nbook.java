public class Nbook {
  // constructor
  private String cpu;
  private int ram;
  private String hdd;
  private double vol;



  // getter, setter
  public String getcup() {
    return this.cpu;
  }

  public int getram() {
    return this.ram;
  }

  public String gethdd() {
    return this.hdd;
  }

  public double vol() {
    return this.vol;
  }


  public void setcpu(String cpu) {
    this.cpu = cpu;
  }

  public void setram(int ram) {
    this.ram = ram;
  }

  public void sethdd(String hdd) {
    this.hdd = hdd;
  }

  public void setvol(double vol) {
    this.vol = vol;
  }


  
  // toString
  public String toString() { 
    return this.cpu + this.ram + this.hdd;
  }

  public static void main(String[] args) {
    Nbook n1 = new Nbook();
    System.out.println(n1.getcpu());

    Nbook n2 = new Nbook("i5", 1024, "SSD", 2046.01);
    System.out.println(n2.toString());
  }
  
}