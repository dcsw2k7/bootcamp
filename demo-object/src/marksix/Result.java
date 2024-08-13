package marksix;

import java.time.LocalDate;
import java.util.Objects;
/* class 叫 Result, 已Ball.java裡Ball[] balls, 組成有
 * 
 * 
*/
public class Result {
  private Ball[] balls;
  private LocalDate date;

  public Result(LocalDate date) {
    balls = new Ball[0];
    this.date = date;
  }

  // add(Ball ball)  ...

  public LocalDate getDate() {
    return this.date;
  }


  /*  check ????????/ */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) // CHECK是否同一地址，是同地址便是同一個值
     return true;
    if (!(obj instanceof Result))  // 如不是同一地址，便是否,不是同一個值
     return false;
     Result result = (Result) obj;  // 將obj放入 result中
     return Objects.equals(this.date, result.getDate());  // 
  }
 
  public static void main(String[] args) {
    Result r1 = new Result(LocalDate.of(2024, 6, 25));
    Result r2 = new Result(LocalDate.of(2024, 6, 25));

    System.out.println(r1.equals(r2));  // true
  }


}
