public class Scanner {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            //Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("please input a number: ");
    int month = input.nextInt();  // line of imput -> int
    System.out.println("month" + month);
    }
}
