package sorting;

import java.util.Comparator;

public class BallSortByColor implements Comparator<Ball> {
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Color.RED) /* b1是RED放左-1 */
      return -1;
    if (b1.getColor() == Color.BLACK && b2.getColor() == Color.WHITE) /* b1是BLACK and b2是WHITE放左-1 */
      return -1;
    if (b1.getColor() == Color.BLACK && b2.getColor() == Color.RED) /* b1是BLACK and b2是RED放右1 */
      return 1;
    if (b1.getColor() == Color.WHITE) /* b1是WHITE放右1 */
      return 1;
    return 1;
  }
  
}
