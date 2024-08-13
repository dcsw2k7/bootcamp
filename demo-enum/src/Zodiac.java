public enum Zodiac {
  Rat("rax", 1),Ox("ox", 2),Tiger("tiger", 3),Rabbit("rabbit", 4),Dragon("dragon", 5),Snake("snake", 6),
  Horse("horse", 7),Goat("goat", 8),Monkey("monkey", 9),Rooster("rooster", 10),Dog("dog", 11),Pig("pig",12);

private final String name;
private final int number;

private Zodiac(String name, int number) {  /* enum 內 只可private 不可public */
  this.name = name;
  this.number = number;
}

public String getName() {
  return this.name;
}

public int getNumber() {
  return this.number;
}

public String toString() {
  return ("name= " + this.name + " is " + "number =" + this.number);
}


public static Zodiac get(int number) {
  for (Zodiac zod : Zodiac.values()) {
    if (number == zod.getNumber())
    return zod;
  }
  return null;  // throw exception (we teach later....)
}

public static int get(Zodiac zodiac) {  // 
  return zodiac.getNumber();
}



@Override
public static void main(String[] args) {
  
  System.out.println(Zodiac.getName());
  Zodiac z1 = new Zodiac;
  System.out.println(Zodiac.getName(z1));
  System.out.println(Zodiac.toString(z1));
  
}

}
