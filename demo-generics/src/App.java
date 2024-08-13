public class App {
    
    public static <U> Box<U> createBox(U Value) {
        return new Box<>(Value);
      }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
