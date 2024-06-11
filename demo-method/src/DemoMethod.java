public class DemoMethod {
    public static void main(String[] args) {

        // Method: you put something into the box, and then it return something to you.
        // calloing method

        System.out.println("hello");

        //call method (sum)
        int result = sum(10, 3);
        System.out.println("result=" + result); // 13

        //call
        System.out.println(lastChar("hello")); // o

        //
        char[] arr = new char[] {'a','b','c'};
        System.out.println(toString(arr)); //abc

        //
        System.out.println(max(new int[] {3, 10, 7}) ); // 10

        System.out.println(isSubstring("hello", "ll")); // true
        System.out.println(isSubstring("hello", "lll")); // false
        System.out.println(isSubstring("hello", "lo")); // true
        System.out.println(isSubstring("hello", "loo")); // false

        // circle area

        System.out.println(circleArea(3)); // 28.274333882308138

        // double * double
        System.out.println(0.2 * 0.1); // 0.0200000000000004
        

    }

    public static int sum(int x, int y) {
        // if you method is with return type, you method content should contain a key word "return"
        return x + y; // int + int -> int
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public statis String toString(char[] arr) {
        // approach 1:
        // String return = "";
        // for (int i = 0; i < arr.length; i++) {
        //    return += arr[i];
        // }
        // return result;

        // approach 2:
        return String.valueOf(arr);
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        } 
        return max;
    }

    public static boolean isElderly(int age) {
        // > 65
        // approach 1:
        // if (age > 65) {
        // return true;
        // }
        // return false;

        // approach 2:
        return age > 65;

    }

    public static boolean isSubstring(String str, String substr) {
        // check if substr is a substring of str
        
        // approach 1:
        // return str.contains(substr);

        // approach 2:
        // indexOf90 menth return an int index, which is index position substring
        // if it return -1, means not exists.
        // return str.indexOf(substr) != -1;

        // approach 3:
        // hellllo, llll
        for ( int i = 0; i < str.length(); i++) {
          for ( int j = 0; j < substr.length(); j++) {
            if (str.chatAt(i + j) == substr.charAt(j)) {
                break;
            } 
            if (j == substr.length() -1 ) {
                return false;
            }
          }
        }
        return false;


    }

    // java -> PI
    public static double circleArea(int radius) {
        return radius * radius * Math.PI; // int * int * double -> double (2 * 2 8 2.0 -> 8.0)
    }
    //System.out.println()



    }


}
