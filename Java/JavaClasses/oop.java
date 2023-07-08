package Java.JavaClasses;
class Student{
    String name;
    int age;
    String city;

    public Student(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
}


public class oop {
    public static void main(String[] args) {
        Student s1 = new Student("mustafa", 24, "multan");
        System.out.print(s1);
    }
}
