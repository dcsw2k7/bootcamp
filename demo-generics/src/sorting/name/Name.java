package sorting.name;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import sorting.Ball;


public class Name implements Comparable<Name> {
  private String name;
  private NiceName nicename;

  public Name(String name, NiceName nicename) {
    this.name = name;
    this.nicename = nicename;
  }

  public int getName() {
    return this.name;
  }

  public NiceName getNicename() {
    return this.nicename;
  }

  @Override
  public int compareTo(Name name) {
    return this.name > name.getName() ? -1 : 1;
  }


  @Override
  public String toString() {
    return "Name("
    + "name=" + this.name
    + ", nicename=" + this.nicename
    + ")"; 
  }

  public static void main(String[] args) {
  
  
    Queue<Name> pq4 = new PriorityQueue<>();
    // Class -> formula
    // add
    pq4.add("chan");
    pq4.add("wong");
    pq4.add("fong");
    pq4.add("chun");
    // poll()
  
  }
}