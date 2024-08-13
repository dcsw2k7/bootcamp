public class Human extends Superman implements Walkable, Readable {

    // Class can only inherit instance methods, instance variables. /* inherit 繼承 只能 instace variable 如要用只能用call */
    // Constructor CANNOT be inherited.

    public Human() {

    }

    public Human(double height) {
        super(height);  // SuperHuman's constructor
    }

    @Override
    public void walk() {
        System.out.println("Human is walking ...");
    }

    @Override
    public void read() {
        System.out.println("Human is reading ...");
    }

    @Override
    public double getHeight() {
        return super.getHeight() + 1;
    }


    public static void main(String[] args) {
        System.out.println(Walkable.AGE);  // 3, public static final

        Human h1 = new Human();
        h1.walk();

        h1.run();  // default I am running

        Superman superman = new Superman();
        superman.run();  // Superman is running ....

        Walkable.swim();
    }
}
