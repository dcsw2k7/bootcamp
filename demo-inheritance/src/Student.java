public class Student extends Person {
    private int studentId;
    // private String name;
    // private int age;

    // Constructor -> the process of constructing student object
    public Student(int studentId, String name, int age) {
      // calling Parent class contructor ...
      // 1. create Parent inside Student Object (heap object)
    super(name, age);  // super 只是常用key word
    
    this.studentId = studentId;
    //  this.name = name;
    //  this.age = age;
    }

    // public String getName() {
    //     return this.name;
    // }
    
    public int getStudentId() {
        return this.studentId;
    }
    
    // public int getAge() {
    //    return this.age;
    // }

      public void setName(String name) {
        this.name = name;
      }
    
      public void setAge (int age) {
      //  this.age = age;
        super.setAge(age);
      }




    public static void main(String[] args) {
    //    Student s = new Student("Vincent", 1, 13);
        Student s = new Student(1, "Vincent", 13);
        System.out.println(s.getStudentId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }

}
