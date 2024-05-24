import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 20;
        int x3 = -3; // -3 -> int value, while x3 -> variable

        // when you create an array object, you have to define the length of it.
        int [] arr = new int[3]; // length -> 3
        // arr[index]
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = -3;
        
        // compile-time Exception
        // arr[0] = "hello"; // java compiler knows that "arr" is an int array, which stores int value
        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20
        System.out.println(arr[2]); // -3

        arr[1] = 100;
        System.out.println(arr[1]); // 100

        // run-time exception
        // arr[3] = 200; // java.lang.arrayIndexOutOfBoundsException: index 3 out of bounds for length 3

        int[] arr2 = new int[] {10,20,-3};
        System.out.println(arr2[0]); // 10
        System.out.println(arr2[1]); // 20
        System.out.println(arr2[2]); // -3

        // string array -> "hello", "abc" , "ijk"
        // print all 3 string values
        ///String[] arr3 = new String[] {"hello","abc","ijk"};
        ///System.out.println(arr3[0]); // hello
        ///System.out.println(arr3[1]); // abc
        ///System.out.println(arr3[2]); // ijk
        String[] strings = new String[] {"hello","abc","ijk"};
        System.out.println(strings[0]); // hello
        System.out.println(strings[1]); // abc
        System.out.println(strings[2]); // ijk

        byte[] bytes = new byte[] {2,3,4};
        long[] values = new long[] {2,3,4};
        double[] dl = new double[] {2.0,3.3,4};

        // arrays.
        System.out.println(Arrays.toString(strings)); // [hello, abc, ijk]
        System.out.println(Arrays.toString(arr2)); // [10, 20, -3]

        // 9, -3, -100, 90, 66, -4
        // for loop, print out all
        int[] arr3 = new int[] {9, -3, -100, 90, 66, -4};
        for (int i = 0; i < arr3.length; i++) { // 0,1,2,3,4,5
            System.out.println(arr3[i]);
        }

        // loop
        // find the max value from arr3  //先開MAX存最大值,之後CHECK ARRAY內 與比較,最大的放入MAX中存,如此類推
        int max = Integer.MIN_VALUE; // the min. value of int
        for (int i = 0; i< arr3.length; i++) {
            if (arr3[i] > max ) {
                max = arr3[i];
            }
        }
        System.out.println("max =" + max);

        // find the min. value from arr3
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < min) {
                min = arr3[i];
            }
        }
        System.out.println("min =" + min);

        //
        char[] arr4 = new char[] {'l', 'e', 'e' , 'r', 'q'};
        // 1. count the number of 'e'
        int count = 0;
        for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
            if (arr4[i] == 'e') {
                count++;
            }
        }


        // 2. boolean result to store if 'r' exists
        boolean isrExist = false;
        for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
            if (arr4[i] == 'r') {
                isrExist = true;
            break;
            }
        }
        System.out.println("does character r exist?" + isrExist);


        // 3. string reuslt to store "qreel"
        String s = "";
        for (int i = arr4.length - 1; i >= 0; i--) { 
            s += arr4[i];
        }
        System.out.println("Reversed char[] = " + s);


        // 4. given two char[]
        char [] c1 = new char[] {'o', 'a', 'k'};
        char [] c2 = new char[] {'a', 'b', 'f', 't'};
        // 4a. result -> "oakpabft". append all characters to a string value
        String result1 = "";
        for (int i = 0; i < c1.length; i++) {
            result1 += c1[i]; // string value + char -> string
        }
        for (int i = 0; i < c2.length; i++) {
            result1 += c2[i];
        }
        System.out.println(result1); // oakpabft


        // 4b. result -> "obkt". when even index, get the value from c1. when odd index, get the value form c2
        String result2 = "";
        char[] c3 = new char[] {'o','a','k','p','a','b'};
        char[] c4 = new char[] {'a','b','f','t'};
        // obkta

        // if (c1.length > c2.length) {
        // length = c1.length;
        // } else {
        // length = c2.length;
        // }

        int length = c3.length > c4.length ? c3.length : c4.length;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0 && i < c3.length) {
                result2 += c3[i];
               } else if (i % 2 == 1 && i < c4.length) {
                result2 += c4[i];
               }
            }
        System.out.println(result2);


        }
  
}
