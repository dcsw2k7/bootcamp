package sorting.name;

import java.util.Comparator;


public class NameSortByNiceName implements Comparator<Name> {
  @Override
  public int compare(Name n1, Name n2) {
    if (b1.getColor() == Color.RED) /* b1是RED放左-1 */
      return -1;
    if (n1.getColor() == Color.BLACK && n2.getColor() == Color.WHITE) /* b1是BLACK and b2是WHITE放左-1 */
      return -1;
    if (n1.getColor() == Color.BLACK && n2.getColor() == Color.RED) /* b1是BLACK and b2是RED放右1 */
      return 1;
    if (n1.getColro() == Color.WHITE) /* b1是WHITE放右1 */
      return 1;
    return 1;
  }
}
