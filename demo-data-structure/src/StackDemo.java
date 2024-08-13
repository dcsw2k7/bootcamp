import java.util.Stack;
import java.util.List;

public class StackDemo {
  public static void main(String[] args) {
    // Last-in, First-out
    Stack<String> ss = new Stack<>();
    ss.add("hello");  // [hello]
    System.out.println(ss);
    ss.push("world");
    System.out.println(ss);
    ss.push("abc");
    System.out.println(ss);
    System.out.println(ss.pop());  // abc, remove and return the last element
    System.out.println(ss.pop());  // world

    ss.push("bbb");
    System.out.println(ss);  // [hello, bbb]

    List<String> ss2 = new Stack<>();
    // ss2.push();
    // ss2. pop();
    ss2.add("hello");
    ss2.add("worls");
    ss2.remove("abc");
    System.out.println(ss2);  // [hello]

    Stack<String> sss = new Stack<>();
    sss.push("hell2o");
    System.out.println(sss);
    sss.push("worlsr");
    System.out.println(sss);
    sss.add("abcs");
    System.out.println(sss);
    System.out.println(sss);  // [hello]

  }
}
