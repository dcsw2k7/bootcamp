public class DemoLoop {
    public static void main(String[] args)  {
        int x = 3;
        x *= 3; // 9
        x *= 3; // 27
        x *= 3; // 81

        // 16 May, 2024
        // for loop
        // initialization (variable declaration & assignment) ; continue criteria ; incremental operation
        // step 1: "int i = o"
        // step 2: check if i < 4 ? yes
        // step 3: print hello
        // step 4: i++ -> i become 1
        // step 5: check if i < 4 ? yes
        // step 6: print hello
        // step 7: i++ -> i become 2
        // step 8: check if i < 4 ? yes
        // step 9: print hello
        // step 10: i++ -> i become 3
        // step 11: check if i < 4 ? yes
        // step 12: print hello
        // step 13: i++ -> i become 4
        // step 14: check if i < 4 ? no
        // step 15: exit the loop
        for (int i = 0; i < 4; i++) { //0,1,2,3
            System.out.println("Hello");
        }
        // hello
        // hello
        // hello
        // hello

        int y = 3;
        for (int i = 0; i <3; i++) {
            y *= 3;
        }
        System.out.println("y=" + y);
        // y = 81
        

        // 2
        // 4
        // 6
        for ( int i = 0; i < 7; i++){
            if (i != 0 && i % 2 == 0) {
            }else if (i % 2 == 1 ){
                }    else if (i % 2 == 2){
            }
            System.out.println("i=" + i) ;{

            }
        }

        // 1 + 2 + 3 + 4 + 5 ... 10  // 自加10次
        // 0 + 1 = 1
        // 1 + 2 = 3
        // 3 + 3 = 6
        // 6 + 4 = 10
        // 10 + 5 = 15
        // 15 + 6 = 21
        // 21 + 7 = 28
        // 28 + 8 = 36
        // 36 + 9 = 45
        // 45 + 10 = 55
        int sum = 0;
        for (int i = 0; i < 11; i++){
            sum += i;
        }
        System.out.println("sum=" + sum); //55
        
        // 2 + 4 + 6 + 8 // 只要雙數 雙加 
        int sum2 = 0;
        for (int i = 0; i < 9; i++){ // % 2 is to find the even number 如是雙數放入sum2再行
            if (i % 2 == 0){
                sum2 += i;
            } 
        }        
        System.out.println("sum=" + sum2); // 20

        // 8
        // 6
        // 4
        // 2
        for (int i = 9; i > 0; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        // break  // 從loop 中 淘出
        for (int i = 0; i < 10; i++){
            if (i > 7 ){
                break; // exit loop
            }
            System.out.println(i); // main logic
        }
        // 0
        // 1
        // ...
        // 7

        // contunue // 從loop 回初
        int total = 0;
        for (int i = 0; i < 5; i++){
            if (i > 3){
            continue; // when i = 4, skip "total += i", goes to "i++"
            }
        total += i;
        }
        System.out.println("total=" + total);

    }
}
