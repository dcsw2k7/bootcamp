import java.time.LocalDate;
import java.util.Objects;

// public class Book extends Object {}
public class Book {  // implicitly inherit Object.class
  private String author;
  private LocalDate publishDate;

  public Book(String author, LocalDate publishDate) {
    this.author = author;
    this.publishDate = publishDate;
  }

  public String getAuthor() {
    return this.author;
  }

  public LocalDate getPublishDate() {
    return this.publishDate;
  }


/* HashCode是用于查找使用的，而equals是用于比较两个对象是否相等的 */

  // if you do not @Override, the hashCode() method b defult representing
  // the object address
  @Override  // 用@Override 覆蓋原本第一個指針 
  public int hashCode() {
    return Objects.hash(this.author, this.publishDate);
  }

  // if you override it, the purpose is to make it become ture even if they are
  // 2 different object in heap memory
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
      // "instanceof" is checking if the object pointing by reference is an object
      // produced by Book.class
      if (!(obj instanceof Book)) 
      return false;
    Book book = (Book) obj;  //
    return Objects.equals(this.author, book.getAuthor())
      && Objects.equals(this.getPublishDate(), book.getPublishDate());
    // if (book.getAuthor().equals(this.author)
    // && book.getPublishDate().compareTo(this.publishDate) == 0 ) {
    // return true;
    // }
    // return false;
  }


  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12));

    System.out.println(b1.hashCode()); // 75848450
    System.out.println(b2.hashCode()); // 75848450

    Book b3 = new Book("John", LocalDate.of(2000, 12, 13));
    System.out.println(b3.hashCode()); // 75848451

    System.out.println(b1 == b2); // false

    // beacuse b1 & b2 are different object
    System.out.println(System.identityHashCode(b1)); // 798154996 
    System.out.println(System.identityHashCode(b2)); // 681842940

    // Object.class has equals() method
    // if you do not override, equals() by default checking object address
    // System.out.println(b1.equals(b2));  // false, if you do not override
    System.out.println(b1.equals(b2));  // true, after @Ouverride
    System.out.println(b1.equals(b3));  // false, after @Override

    // if both object are located in different address, equals() must return
    // false (No override)
    System.out.println(b1.equals(new Cat()));  // false

    String str = "abc";
    System.out.println(str.hashCode());  // 96354
    System.out.println(97 * (int) Math.pow(31, 2) + 98 * 31 + 99);  // 96354

    // Implication:
    // there will be another string value with same hash code.
    // 2 different string potentially can be with same hash code.
    String str2 = "abcdefghijklxy";
    System.out.println(str2.hashCode());  // 2093908551

    String str3 = "bbcdefghijklxy";
    System.out.println(str3.hashCode());  // 1588349926 overflow

    Integer i3 = 365;
    System.out.println(i3.hashCode());  // 365

    System.out.println(new String("abc").equals(new String("abc")));  // true

    // "Compile time" determine if s1 is able to call equals()
    // "Run time" determine the implementaion (method content) of equals() method
    Object s1 = new String("abcd");
    Object s2 = new String("abcd");
    System.out.println(s1.equals(s2));  // true (Runtime: String.equals())

    Object s3 = new String();
    Object s4 = new String();
    System.out.println(s3.equals(s4));  // false (Runtime: String.equals())


    
  
  }


}
