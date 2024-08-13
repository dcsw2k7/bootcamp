package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
  private String name;
  // privete Person Person;

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person());
    List<Person> person2 = new LinkedList<>();
    person2.add(new Person());

    long before = System.currentTimeMillis();
    for (int i = 0; i < 1_000_000; i++) {
      persons.add(new Person());
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);  // 13ms

    // persons.add() and persons2.add() are running different implemetation.
  
  }
  
}
