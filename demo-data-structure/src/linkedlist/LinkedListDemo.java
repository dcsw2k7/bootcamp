package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// import java.util.Collection;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array vs ArrayList -> underlying structure of ArrayList is array  /* arraylist 底層是 array */
    // 2. array -> fixed length -> a range of continous memoru locations  /* 連續位置 */
    
    Cat cat = new Cat(Color.BLUE);
    // Heap
    // Step 1: Cat Object
    // Step 2: Eye Array Object
    // Step 3: Two Eye objects
    // Step 4: 3 color objects (created when you execute the main method)

    cat.getEyes();  // cat object -> get Eye Array Object
    cat.getLeftEye();  // Cat object -> Eye Array Object -> Eye ojects

    Eye[] eyes = cat.getEyes();  // backup the array object memorty location
    Eye rightEye = eyes[1];

    // What is the relationship betweeed the momory location of cat, eyes,
    // righEye?
    // 1. LeftEye vs RightEye
    // 2. Cat object vs Eye[] object
    // 3. Cat object vs eye object

    String[] strings = new String[1000000];


    List<String> strings2 = new LinkedList<>();
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    strings2.add("D");
    for (String s : strings2) {
      System.out.println(s);
    }

    System.out.println(strings2.get(strings2.size() -1));
    // arr[arr.length - 1];

    System.out.println(strings2.isEmpty()); // false

    // LinkedList vs ArrayList
    // 1. Underlying DS
    // 2. Method Difference> (i.e. 11 LinkedList -> addFirst(), removeFirst())

    LinkedList<String> ll = new LinkedList<>();

    ll.add("hello");
    ll.addFirst("abc");
    ll.add("def");
    for (String s : ll) {
      System.out.println(s);
    }
    ll.removeFirst();
    for (String s : ll) {
      System.out.println(s);
    }

    System.out.println(ll.indexOf("hello"));  // 0
    
    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello"));  // 2

    // Queue.class
    Queue<String> emails = new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size());  // Collection.class
    String head = emails.poll();  // remove and return the first element in queue
    System.out.println(head);  // john@gmail.com
    emails.add("sally@hotmail.com");
    emails.add("dicky@yahoo.com.hk");
    
    String lookup = emails.peek();  // reuturn the first element in queue
    System.out.println(lookup);  // peter@gmail.com

    emails.remove(new String("dicky@yahoo.com.hk"));
    // LinkedList.class remove(object) -> LinkedList for loop
    
    // remove()
    System.out.println(emails);  // [peter@gmail.com, sally@hotmail]
    emails.remove();  // same as poll()

    // for-each
    for (String s : emails) {
      System.out.println(s);
    }

    // Convert Queue<String> to List<String>
    List<String> strings4 = new ArrayList<>();
    while(!emails.isEmpty()) {  // isEmpty()  /*  */
      // System.out.println(emails.poll());
      strings4.add(emails.poll());
    }
    System.out.println(strings4);
    System.out.println(emails);  // after while loop, all elements are removed.

    // clear()
    strings4.clear();  // Clear all the objects inside the ArrayList object
    strings4.add("abc");
    strings4 = null;  // remove the ArrayList object
    // strings4.add("def");  // NPE (null pointer exception)

    


  }
}
