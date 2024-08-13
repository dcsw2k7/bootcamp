import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    String s = "hello";
    s = null;
    generate(s);  // OK
  
    // method user
    generate(s).charAt(0);  // error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null of not null
    // the java will force to handle otential null scenario during compile-time.
    Optional<String> result = generate2(s);
    char target = ' ';
    if (result.isPresent()) {  // not null
      target = result.get().charAt(0);
    } else {  // null
      target = '_';
    }

  
  
  }



  // method author
  public static String generate(String s) {
    if (s == null)
      return null;
    return s.replace('a', 'b').toUpperCase();
  }

  // 1. Optional<String> != String
  public static Optional<String> generate2(String s) {
    if (s == null)
      return Optional.of(null);
    return Optional.of(s.replace('a', 'b').toUpperCase());
  }



}
