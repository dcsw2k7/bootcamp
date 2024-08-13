
import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;

  public NumberBox(T number) {
    this.number = number;
  }

  public static void main(String[] args) {
     NumberBox<Byte> byteBox = new NumberBox<>((byte) 1);  // int -> Byte
     // Long extends Number and Byte extends Number
     // byteBox = new NumberBox<
     // byteBox = new NumberBox<Long>();  // NOT OK /* 不是同伴不平行 */
     NumberBox<BigDecimal> bBox = new NumberBox<>(BigDecimal.valueOf(3.4));



  }
  
}
