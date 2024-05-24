public class DemoNestedLoop {
  public static void main (String[] args) {
    for (int i = 0; i < 4; i++) { //0,1,2,3
      for (int j = 0; j < 2; j++) { //0,1
        System.out.println("hello" + "i=" + i + ",j=" + j);
      }
    }
    // hello i=0,j=0
    // hello i=0,j=1
    // hello i=1,j=0
    // hello i=1,j=1
    // hello i=2,j=0
    // hello i=2,j=1
    // hello i=3,j=0
    // hello i=3,j=1

    // hello i=1,j=0
    // hello i=3,j=0
    // Approach 1:
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        if (i % 2 == 1 && j % 2 == 0) {
          System.out.println("hello" + "i=" + i + "j=" + j);
        }
      }
    

    // Appreoach 2:
    for (int i = 0; i < 4; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 0; j < 2; j++) {
        if (j % 2 == 1) {
          continue;
        }
        System.out.println("hello" + "i=" + i + "j=" + j);
      }
    }
    // output:
    // hello i=1, j=0
    // hello i=3, j=0

    // Exercise: week work
    // 1-20
    // 1 3 5 7 9 ,12 14 16 18 20
    for (int i = 1; i < 21; i++) {
      if ((i % 2 == 1 && i < 10) || (i % 2 == 0 && i > 10)) {
        System.out.print(i + " "); 
      }
    }
    // Output: 1 3 5 7 9 12 14 16 18 20 
    System.out.println();


    // Searching
    String s = "Vincent book game laptop";
    // find the index of jirst chatacter 'a' 找a位置idx
    // 14
    // chatAt()
    int idx = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.chatAt(i) == 'a' ) {
        idx = i;
        break; // break -> exit loop
      }
    }
    System.out.println(idx); // 14
  }
}
}
