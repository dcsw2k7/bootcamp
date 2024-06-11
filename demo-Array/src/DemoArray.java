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
        System.out.println(result2);  //obkta

        //28May2024
        // averge 平均
        int[] arr5 = new int[] {4, 8, 3};
        int sum = 0;
        int count2 = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum += arr5[i];
            count2++;

        }
        System.out.println(sum / count2);  // (4 + 8 + 3) / 2


        // swapping in array
        int[] arr6 = new int[] {6, 10, -4, 15};
        // swap -4 and 6 -> [-4, 10, 6, 15]
        int temp = arr6[2];
        arr6[2] = arr6[0];
        arr6[0] = temp;
        System.out.println(Arrays.toString(arr6)); // [-4, 10, 6, 15]

        
        // Level 1;
        // arr6 -> [-4, 10, 6, 15]
        // move the first elment to the tail of the array
        // result [10, 6, 15, -4]
        int t = -1;
        for ( int i = 0; i < arr6.length - 1; i++) {  
            // arr.length -1 什麼要-1 , 因為行ARR6內有多少個行幾多次,有4個行4次,
            // arr.length = 4
            // int i = 0,次數 i < 4,每之自加1 i++
            // i = i + 1 , 
            // 0 + 1 = 1, i = 1, 1 < 7 next, 1 不等 0 AND 1 除 2 (0.5)相等 0, 
            // 1 + 1 = 2, i = 2, 2 < 7 next, 2 不等 0 AND 2 除 2 (1.0) 相等 0
            // 2 + 1 = 3, i = 3, 3 < 7 next, 3 不等 0 AND 3 除 2 (1.5) 相等 0
            // 3 + 1 = 4, i = 4, 4 < 7 next, 4 不等 0 AND 4 除 2 (2.0) 相等 0
            // 4 + 1 = 5, i = 5, 5 < 7 next, 5 不等 0 AND 5 除 2 (2.5) 相等 0
            // 5 + 1 = 6, i = 6, 6 < 7 next, 6 不等 0 AND 6 除 2 (3.0) 相等 0
            // 6 + 1 = 7, i = 7, 7 < 7 end
            t = arr6[i];
            arr6[i] = arr6[i + 1];
            arr6[i + 1] = t;
        }
        System.out.println(Arrays.toString(arr6)); // [10, 6, 15, -4]

        // level 2:
        // move the max elemnet to the tail
        // now : [10, 6, 15, -4]
        // 1 st round: [6, 10, 15, -4]
        // 2 st round: [6, 10, 15, -4]
        // 2 st round: [6, 10, -4, -15
        for (int i = 0; i < arr6.length -1; i++) {
            if (arr6[i] > arr6[i + 1]) {
                // swap
                t = arr6[i];
                arr6[i] = arr6[i + 1];
                arr6[i + 1] = t;
            }
        }
        System.out.println(Arrays.toString(arr6)); // [6, 10 ,-4, 15]


        // level 3:
        // sorting -> [-4, 6, 10, 15]
        // bubbl sort
        // for loop
        // nested loop
        for (int i = 0; i < arr6.length -1; i++) { // round
            for (int j = 0; j < arr6.length -i -1; j++) { // moving
                if (arr6[j] > arr6[j + 1]) {
                    t = arr6[j];
                    arr6[j] = arr6[j + 1];
                    arr6[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr6)); // [-4, 6, 10, 15]
        

        // Swap char value
        String str = "hello"; // swap e and 0 -> holle
        // convert char[]
        // for loop + charAt()
        char[] arr7 = new char[str.length()] ;
        char t2 = ' ';
        // for (int i = 0; i < str.length(); i++) {
        //    arr7[i] = str.chatAt(i);
        // }        
        // alternative ( String -> char[] )
        char[] arr7 = str.toCharArray(); // ['h', 'e', 'l', 'l', 'o']



        t2 = arr7[1];
        arr7[1] = arr7[4];
        arr7[4] = t2;
        str = String.valueOf(arr7); // assign a new String value to variable str
        System.out.println(str); // holle



        // Sorting -> [-4, 6, 10, 15] 排序
        // for loop
        // nested loop 
        //int[] arr7 = new int[] {-4, 6, 10, 15};{
       //     for ()

       // }









        }
  
}
