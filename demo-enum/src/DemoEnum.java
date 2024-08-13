public class DemoEnum {

  // Constnat (finite)
  // Weekday
  public static final String monday = "MONDAY";
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thursday = "THURSDAY";
  public static final String friday = "FRIDAY";
  public static final String satday = "SATDAY";
  public static final String sumday = "SUMDAY";
  
  public static final int east = 1;

  public static void main(String[] args) {
    System.out.println(DemoEnum.monday);  // MONDAY

    // what happen in heap memory?
    // Answer :

    // During the main method being execuated, it loads enum class
    // System.out.println(main.wednesday);
    System.out.println(Weekday.MONDAY);  // sysout -> calling Weekday MONDAY tsString()
    // by deafult Weekday.class already @Override toString()
    System.out.println(Weekday.TUESDAY);
    System.out.println(Weekday.WEDNESDAY);
    System.out.println(Weekday.THURSDAY);
    System.out.println(Weekday.FRIDAY);
    System.out.println(Weekday.SATDAY);
    System.out.println(Weekday.SUMDAY);




    // Other example ?
    // NORTH, WEST, EAST, SOUTH
    
    int direction = 2;
    if (direction == east) { //?
    }

    Direction d = Direction.EAST;
    if (d == Direction.SOUTH) {  // compare object address directly
      
    }
    

    // season
    // spring, summer, fall (autumn), winter
    public static final String spring = "SPRING";
    public static final String summer = "SUMMER"; 
    public static final String autumn = "AUTUMN"; 
    public static final String winter = "WINTER"; 

    System.out.println(Season.AUTUMN);

    // time 24hou 60min 60sec
    //public static final int monday = "MONDAY";


    // 12 12 Chinese zodiac
    // 鼠	Rat,牛	Ox,虎	Tiger,兔	Rabbit,龍	Dragon,蛇	Snake
    // 馬	Horse,羊	Goat,猴	Monkey,雞	Rooster,狗	Dog,豬	Pig
    public static final String rat = "RAT";
    public static final String Ox = "OX";
    public static final String tiger = "TIGER";
    public static final String rabbit = "RABBIT";
    public static final String dragon = "DRAGON";
    public static final String snake = "SNAKE";
    public static final String house = "HOUSE";
    public static final String goat = "GOAT";
    public static final String monkey = "MONKEY";
    public static final String rooster = "ROOSTER";
    public static final String dog = "DOG";
    public static final String pig = "PIG";

    System.out.println(Zodiac.Rat);

    


    
  }
  
}
